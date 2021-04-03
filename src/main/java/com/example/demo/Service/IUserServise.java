package com.example.demo.Service;

import com.example.demo.Models.User;

public interface IUserServise {

    User getById(int id);

    Boolean isAdmin(String username, String pasw);

    Boolean isUser(String username, String pasw);

    void update(User user);
}
