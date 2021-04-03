package com.example.demo;
import com.example.demo.Models.*;
import com.example.demo.Service.*;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Library {

    @Autowired
    private IUserServise userServise;

    @Autowired
    private itakesServise takesServise;

    @Autowired
    private IBookServise bookServise;

    public boolean isBookAvailable (int id) {
        return bookServise.isAvailable(id);
    }

    public void RentBook (int userid, ArrayList<Integer> bookids) {
        User user = userServise.getById(userid);
        Random random = new Random();
        ArrayList<Book> books = new ArrayList<>();

        TakeBook takeBook = new TakeBook(random.nextInt(), user, null, false);

        for (int i : bookids) {
            if (bookServise.isAvailable(i)) {

                Book book = bookServise.getByID(i);

                book.setAvailable(false);
                bookServise.update(book);
                books.add(book);

            } else {
                System.out.println("Book is not available");
            }

        }

        takeBook.setBooks(books);
    }



    public void run () {
        Random random = new Random();

        User user = new User(random.nextInt(), "someone", "1234", false);

        Book book1 = new Book(random.nextInt(), "Abay zholy 1pt", true);
        Book book2 = new Book(random.nextInt(), "Abay zholy 2pt", true);

    //    userServise.update(user);

      //  bookServise.update(book1);
       // bookServise.update(book2);




    }




}
