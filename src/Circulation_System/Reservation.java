package Circulation_System;

import Cataloging_Classification_System.Library_Source;

import java.time.LocalDateTime;

public class Reservation {

private Library_Source resource;
private  Member member;
private LocalDateTime dateTime= LocalDateTime.now();


    public Reservation(Library_Source resource, Member member) {
        this.resource = resource;
        this.member= member;
    }

    public Library_Source getResource() {
        return resource;
    }

    public void setResource(Library_Source resource) {
        this.resource = resource;
    }
}
