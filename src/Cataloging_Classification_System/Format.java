package Cataloging_Classification_System;

import java.util.ArrayList;

public enum Format {
    HARDCOPY(new ArrayList<>()),
    PDF(new ArrayList<>()),
    VIDEO(new ArrayList<>()),
    AUDIO(new ArrayList<>()),
    HTML(new ArrayList<>()),
    EBOOK(new ArrayList<>()),
    URL(new ArrayList<>());

    private ArrayList<Library_Source> library_sources_Format= new ArrayList<>();

    Format(ArrayList<Library_Source> library_sources) {
        this.library_sources_Format=library_sources_Format;

    }


}
