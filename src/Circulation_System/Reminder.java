package Circulation_System;

import Cataloging_Classification_System.Library_Source;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Reminder {

    private LocalDateTime deadline;
    private Member member;
    private Library_Source resource;

    public Reminder() {
    }


    public Reminder(Library_Source resource,LocalDateTime deadline, Member member) {
        this.resource=resource;
        this.deadline = deadline;
        this.member=member;
    }




    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }


    @Override
    public String toString() {
        return "Dear" +member.getName()+"We hope this message finds you well. We are writing to remind you that the due date for the book titled" + resource.getTitle()+
                " has passed by"+ ChronoUnit.DAYS.between(LocalDateTime.now(),deadline) +"and it has not been returned to the library yet.As a valued member of our library, we kindly request that you return the book as soon as possible to avoid any late fees or penalties.";
    }
}
