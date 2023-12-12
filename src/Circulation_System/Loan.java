package Circulation_System;

import Cataloging_Classification_System.Library_Source;

import java.time.LocalDateTime;

public class Loan {
private Library_Source resource;
private Member member;
private LocalDateTime deadline;
    public Loan() {
    }

    public Loan(Library_Source resource, Member member, LocalDateTime deadline) {
        this.resource = resource;
        this.member = member;
        this.deadline = deadline;
    }


    public Library_Source getResource() {
        return resource;
    }

    public void setResource(Library_Source resource) {
        this.resource = resource;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }


    @Override
    public String toString() {
        return "Loan{" +
                "resource=" + resource.getTitle() +
                ", member=" + member.getName() +
                ", deadline=" + deadline +
                '}';
    }
}
