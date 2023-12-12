package Cataloging_Classification_System;

import Circulation_System.Reservation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

import static Circulation_System.MyDatabase_utility.MylistsUtility.Library_resources;

public class Library_Source extends ArrayList<Library_Source> {


    private  Author author;
    protected String Title;
    protected ArrayList<Author> authors= new ArrayList<>();
    protected LocalDateTime Date;
    protected  String ISBN;
    protected String Call_Number;
    protected Format Format;
    protected boolean status;
    protected boolean Hold;
    protected boolean High_demand;
    protected int number_of_times_demanded;
    protected Subject subject;

    protected double price;


    public static ArrayList<KeyWord> keyWords= new ArrayList<>();
    public    PriorityQueue<Reservation> waitinglist = new PriorityQueue<>();

    public static HashMap<Subject,ArrayList<Library_Source>> Source_Subject = new HashMap();

    public static HashMap<KeyWord ,ArrayList<Library_Source>> Source_Keyword = new HashMap();

    public static HashMap<LocalDateTime,ArrayList<Library_Source>> Source_Date= new HashMap<>();

    public static HashMap<Author, ArrayList<Library_Source>> Source_Author= new HashMap<>();

    public static HashMap<Format,ArrayList<Library_Source>> Source_Format= new HashMap<>();


    public Library_Source() {
    }


    public Library_Source(String title, ArrayList<Author> authors, LocalDateTime date, String ISBN, String call_Number, Format format, boolean status, boolean hold, boolean high_demand, int number_of_times_demanded, Subject subject) {
        Title = title;
        this.authors = authors;
        Date = date;
        this.ISBN = ISBN;
        Call_Number = call_Number;
        Format = format;
        this.status = status;
        Hold = hold;
        High_demand = high_demand;
        this.number_of_times_demanded = number_of_times_demanded;
        this.subject = subject;
        Library_resources.add(this);

    }


    public Library_Source(String title, Author author, LocalDateTime date, String ISBN, String call_Number, Format format, boolean status, boolean hold, boolean high_demand, int number_of_times_demanded, Subject subject) {
        Title = title;
        this.author = author;
        Date = date;
        this.ISBN = ISBN;
        Call_Number = call_Number;
        Format = format;
        this.status = status;
        Hold = hold;
        High_demand = high_demand;
        this.number_of_times_demanded = number_of_times_demanded;
        this.subject = subject;

    //linking the resource with the author
        author.literacy_work.add(this);
        Source_Author.put(author,author.literacy_work);

    //linking the resource with the subject
        subject.getLibrary_sources_subjects().add(this);
        Source_Subject.put(subject,subject.getLibrary_sources_subjects());


        Library_resources.add(this);


    }



    public Library_Source(String title,Author author){
        this.Title=title;
        this.author=author;
        author.getLiteracy_work().add(this);
    Source_Author.put(author, author.getLiteracy_work());
        Library_resources.add(this);

}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

/*
this.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {



        }
    } );*/










    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public LocalDateTime getDate() {
        return Date;
    }

    public void setDate(LocalDateTime date) {
        Date = date;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCall_Number() {
        return Call_Number;
    }

    public void setCall_Number(String call_Number) {
        Call_Number = call_Number;
    }

    public Format getFormat() {
        return Format;
    }

    public void setFormat(Format format) {
        Format = format;
    }

    public boolean getHold() {
        return Hold;
    }

    public void setHold(boolean hold) {
        Hold = hold;
    }

    public boolean getHigh_demand() {
        return High_demand;
    }

    public void setHigh_demand(boolean high_demand) {
        High_demand = high_demand;
    }

    public int getNumber_of_times_demanded() {
        return number_of_times_demanded;
    }

    public void setNumber_of_times_demanded() {
        this.number_of_times_demanded += 1;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\tLibrary_Source{" + " Title=" + Title+"}\n";
    }


   /* @Override
    public String toString() {
        return "Library_Source{" +
                "author=" + author +
                ", Title='" + Title + '\'' +
                ", authors=" + authors +
                ", Date=" + Date +
                ", ISBN='" + ISBN + '\'' +
                ", Call_Number='" + Call_Number + '\'' +
                ", Format='" + Format + '\'' +
                ", status=" + status +
                ", Hold=" + Hold +
                ", High_demand=" + High_demand +
                ", number_of_times_demanded=" + number_of_times_demanded +
                ", subject=" + subject +
                '}';
    }*/

}
