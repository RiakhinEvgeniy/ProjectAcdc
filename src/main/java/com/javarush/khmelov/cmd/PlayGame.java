package com.javarush.khmelov.cmd;

import com.javarush.khmelov.entity.Game;
import com.javarush.khmelov.entity.Question;
import com.javarush.khmelov.entity.User;
import com.javarush.khmelov.service.GameService;
import com.javarush.khmelov.service.QuestionService;
import com.javarush.khmelov.util.Go;
import com.javarush.khmelov.util.Key;
import com.javarush.khmelov.service.RequestService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Optional;

@SuppressWarnings("unused")
public class PlayGame implements Command {

    private final GameService gameService;
    private final QuestionService questionService;

    public PlayGame(GameService gameService, QuestionService questionService) {
        this.gameService = gameService;
        this.questionService = questionService;
    }

    @Override
    public String doGet(HttpServletRequest request, HttpServletResponse response) {
        Long questId = Long.parseLong(request.getParameter(Key.QUEST_ID));
        Optional<User> user = RequestService.getUser(request.getSession());
        if (user.isPresent()) {
            Long userId = user.get().getId();
            Optional<Game> game = gameService.getGame(questId, userId);
            if (game.isPresent()) {
                showOneQuestion(request, game.get());
                return getJspPage();
            } else {
                RequestService.setError(request, "Нет незавершенной игры");
                return Go.HOME;
            }
        } else {
            RequestService.setError(request, "Сначала нужно войти в аккаунт");
            return Go.LOGIN;
        }
    }

    @Override
    public String doPost(HttpServletRequest request, HttpServletResponse response) {
        Long gameId = RequestService.getId(request);
        Long answerId = RequestService.getId(request, Key.ANSWER);
        Optional<Game> game = gameService.processOneStep(gameId, answerId);
        if (game.isPresent()) {
            if (answerId == 0) {
                RequestService.setError(request, "Нужно выбрать какой-то ответ");
            }
            Game currentGame = game.get();
            return "%s?questId=%d&id=%d".formatted(Go.PLAY_GAME, game.get().getQuestId(), game.get().getId());
        } else {
            RequestService.setError(request, "Нет такой игры");
            return Go.HOME;
        }
    }

    private void showOneQuestion(HttpServletRequest request, Game game) {
        request.setAttribute(Key.GAME, game);
        Optional<Question> question = questionService.get(game.getCurrentQuestionId());
        request.setAttribute(Key.QUESTION, question.orElseThrow());
    }

}
