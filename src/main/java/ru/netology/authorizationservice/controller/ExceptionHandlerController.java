package ru.netology.authorizationservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.authorizationservice.exception.InvalidCredentials;
import ru.netology.authorizationservice.exception.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlerController {

    // Обработка исключения InvalidCredentials (ошибка 400)
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handleInvalidCredentials(InvalidCredentials e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    // Обработка исключения UnauthorizedUser (ошибка 401) + вывод в консоль
    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handleUnauthorizedUser(UnauthorizedUser e) {
        System.out.println("Unauthorized access attempt: " + e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
