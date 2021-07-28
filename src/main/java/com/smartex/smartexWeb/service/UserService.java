package com.smartex.smartexWeb.service;

import com.smartex.smartexWeb.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers () {
        return List.of(new User (
                "Lesha",
                "Ivanov",
                "Ivanov@mail.ru",
                "LeshaKalosha"

        ));
    }
}
