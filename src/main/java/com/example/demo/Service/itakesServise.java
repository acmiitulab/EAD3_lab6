package com.example.demo.Service;

import com.example.demo.Models.TakeBook;

public interface itakesServise {

     TakeBook getByID (int id) ;

     TakeBook getByUserID (int id) ;

     void Update (TakeBook takeBook) ;

}
