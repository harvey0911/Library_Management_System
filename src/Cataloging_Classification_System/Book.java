package Cataloging_Classification_System;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static Circulation_System.MyDatabase_utility.MylistsUtility.books;

public class Book extends Physical_Source{

    public Book(String tile,Author author){
        super(tile,author);
    }

    public Book(String title, ArrayList<Author> authors, LocalDateTime date, String ISBN, String call_Number, boolean status, boolean hold, boolean high_demand, int number_of_times_demanded, Subject subject) {
        super(title, authors, date, ISBN, call_Number, status, hold, high_demand, number_of_times_demanded, subject);

    }

    public Book(String title, Author author1, LocalDateTime date, String ISBN, String call_Number, boolean status, boolean hold, boolean high_demand, int number_of_times_demanded, Subject subject) {
        super(title, author1, date, ISBN, call_Number, status, hold, high_demand, number_of_times_demanded, subject);
        books.add(this);
    }
    public Book(){

    }

}
