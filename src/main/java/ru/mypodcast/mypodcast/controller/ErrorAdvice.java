package ru.mypodcast.mypodcast.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.mypodcast.mypodcast.dto.BaseResponse;

import java.io.IOException;

@ControllerAdvice
public class ErrorAdvice {

    private final ObjectMapper objectMapper;

    public ErrorAdvice(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BaseResponse<Long> constraintViolationException(
            MethodArgumentNotValidException e) throws IOException {

        BaseResponse<Long> baseResponse = new BaseResponse<>(e.getMessage());
        String s = objectMapper.writeValueAsString(baseResponse);

        return baseResponse;
    }

}
