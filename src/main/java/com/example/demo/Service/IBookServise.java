package com.example.demo.Service;

import com.example.demo.Models.Book;

public interface IBookServise {

     boolean isAvailable (int id) ;

     void update (Book book) ;

     Book getByID (int id) ;

     Book getByName (String name) ;

}
