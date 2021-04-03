package com.example.demo.Repositories;

import com.example.demo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends JpaRepository<User, Long> {

    User  getById (int id);
    User getByUsername(String username);
    Boolean existsUserByUsernameAndPasswordAndAdmin(String username, String password, Boolean isAdmin);

}
