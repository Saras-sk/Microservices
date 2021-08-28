package com.services.user_service.service;

import com.services.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user list

    List<User> list=List.of(
            new User(1311L, "saras singh", "7045873061"),
            new User(1312L, "shashank singh", "7045873067"),
            new User(1313L, "shikhar singh", "6543289904")
    );
    @Override
    public User getUser(Long id) {

        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
