package Cataloging_Classification_System;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Physical_Source extends Library_Source{
    public Physical_Source() {
    }
public Physical_Source(String title,Author author){
        super(title,author);
}
    public Physical_Source(String title, ArrayList<Author> authors, LocalDateTime date, String ISBN, String call_Number, boolean status, boolean hold, boolean high_demand, int number_of_times_demanded, Subject subject) {
        super(title, authors, date, ISBN, call_Number, Cataloging_Classification_System.Format.HARDCOPY, status, hold, high_demand, number_of_times_demanded, subject);

    }

    public Physical_Source(String title, Author author1, LocalDateTime date, String ISBN, String call_Number, boolean status, boolean hold, boolean high_demand, int number_of_times_demanded, Subject subject) {
        super(title, author1, date, ISBN, call_Number, Cataloging_Classification_System.Format.HARDCOPY, status, hold, high_demand, number_of_times_demanded, subject);
    }







}
