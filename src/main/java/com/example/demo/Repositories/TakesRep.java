package com.example.demo.Repositories;

import com.example.demo.Models.TakeBook;
import com.example.demo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TakesRep extends JpaRepository<TakeBook, Long> {

    TakeBook  getById (int id);
    TakeBook getByUserId(int userid);

}
