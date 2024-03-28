package com.javarush.khmelov.cmd;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.mock;

public class BaseIT {
    protected final HttpServletRequest request;
    protected final HttpServletResponse response;

    public BaseIT() {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
    }
}
