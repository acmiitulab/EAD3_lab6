package com.example.demo.Service;

import com.example.demo.Models.User;
import com.example.demo.Repositories.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServise implements IUserServise {

    @Autowired
    private UserRep userRep;

    public User getById (int id) {
        return userRep.getById(id);
    }

    public Boolean isAdmin (String username, String pasw) {
        return userRep.existsUserByUsernameAndPasswordAndAdmin(username, pasw, true);
    }

    public Boolean isUser (String username, String pasw) {
        return userRep.existsUserByUsernameAndPasswordAndAdmin(username, pasw, false);
    }

    public void update (User user) {
        userRep.save(user);
    }


}