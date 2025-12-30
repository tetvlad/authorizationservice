package ru.netology.authorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationservice.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        // Для проверки работоспособности можно сделать запрос из браузера,
        // заполнив <ИМЯ_ЮЗЕРА> и <ПАРОЛЬ_ЮЗЕРА> своими тестовыми данными:
        if (user.equals("vlad") && password.equals("qwerty")) {
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        return Collections.emptyList();
    }
}

