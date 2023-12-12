package Cataloging_Classification_System;

import java.util.ArrayList;

import static Circulation_System.MyDatabase_utility.MylistsUtility.authors;

public class Author {
    private String name;
    private int number_of_times_searched;
       ArrayList<Library_Source> literacy_work = new ArrayList<>();


    public Author() {

    }

    public ArrayList<Library_Source> getLiteracy_work() {
        return literacy_work;
    }

    public void setLiteracy_work(ArrayList<Library_Source> literacy_work) {
        this.literacy_work = literacy_work;
    }

    public Author(String name) {

        this.name = name;
       authors.add(this);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNumber_of_times_searched() {
        return number_of_times_searched;
    }

    public void setNumber_of_times_searched() {
        this.number_of_times_searched += 1;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", number_of_times_searched=" + number_of_times_searched +
                ", literacy_work=" + literacy_work +
                '}';
    }


}

