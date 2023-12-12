package Cataloging_Classification_System;

import java.util.ArrayList;

public enum Subject {


    ART_AND_ARCHITECTURE(new ArrayList<>()),
    BIOGRAPHY(new ArrayList<>()),
    BUSINESS_AND_ECONOMICS(new ArrayList<>()),
    CHILDREN_BOOKS(new ArrayList<>()),
    COOKING_AND_FOOD(new ArrayList<>()),
    EDUCATION(new ArrayList<>()),
    ENVIRONMENT_AND_NATURE(new ArrayList<>()),
    FICTION(new ArrayList<>()),
    HEALTH_AND_FITNESS(new ArrayList<>()),
    HISTORY(new ArrayList<>()),
    HUMOR(new ArrayList<>()),
    LANGUAGES_AND_LINGUISTICS(new ArrayList<>()),
    LAW_AND_POLITICS(new ArrayList<>()),
    LITERATURE(new ArrayList<>()),
    MATHEMATICS_AND_SCIENCE(new ArrayList<>()),
    MUSIC(new ArrayList<>()),
    PHILOSOPHY(new ArrayList<>()),
    PSYCHOLOGY_AND_MENTAL_HEALTH(new ArrayList<>()),
    RELIGION_AND_SPIRITUALITY(new ArrayList<>()),
    SOCIALSCIENCES(new ArrayList<>()),
    SPORTS_AND_RECREATION(new ArrayList<>()),
    TECHNOLOGY_AND_ENGINEERING(new ArrayList<>()),
    TRAVEL_AND_GEOGRAPHY(new ArrayList<>());

    private ArrayList<Library_Source> library_sources_subjects= new ArrayList<>();


    Subject(ArrayList<Library_Source> library_sources) {
        this.library_sources_subjects=library_sources;

    }

    public ArrayList<Library_Source> getLibrary_sources_subjects() {
        return library_sources_subjects;
    }

    public void addLibrarySource(Library_Source librarySource) {
        library_sources_subjects.add(librarySource);
    }



    /*static ArrayList<Library_Source> library_sources= new ArrayList<>();
    static ArrayList<Library_Source> library_sources= new ArrayList<>();
    static ArrayList<Library_Source> library_sources= new ArrayList<>();
    static ArrayList<Library_Source> library_sources= new ArrayList<>();
*/

//public static HashMap<Subject,Library_Source> Source_Subject = new HashMap();







}
