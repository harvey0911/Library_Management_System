package Reporting_and_Analytics_System;

import Cataloging_Classification_System.Author;
import Cataloging_Classification_System.Library_Source;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static Circulation_System.MyDatabase_utility.MylistsUtility.*;
public class Report {

public ArrayList<Library_Source> library_sources_report =Library_resources;
public ArrayList<Author> authors_report= authors;
    public Report() {

        sort_resources();
System.out.println(library_sources_report);
System.out.println(authors_report);
    }
    public void sort_resources() {
        Collections.sort(library_sources_report, Comparator.comparingInt(Library_Source::getNumber_of_times_demanded).reversed());
    }
public void sort_authors(){
    Collections.sort(authors_report, Comparator.comparingInt(Author::getNumber_of_times_searched).reversed());
}

    @Override
    public String toString() {
        return "Report{" +
                "library_sources_report=" + library_sources_report +
                '}';
    }
}
