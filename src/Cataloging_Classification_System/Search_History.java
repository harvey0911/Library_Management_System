package Cataloging_Classification_System;

import java.util.ArrayList;

public class Search_History {

    public Search_History() {
    }

    public ArrayList<Library_Source> search_by_author_name=new ArrayList<>();
    public ArrayList<Library_Source>search_by_subject=new ArrayList<>();
    public ArrayList<Library_Source>search_by_keywords=new ArrayList<>();
    public ArrayList<Library_Source>search_by_date=new ArrayList<>();

    @Override
    public String toString() {
        return "Search_History{" + "search_by_author_name=" + search_by_author_name + "\n search_by_subject=" + search_by_subject + "\nsearch_by_keywords=" + search_by_keywords + "\nsearch_by_date=" + search_by_date +"\n";
    }
}
