package Circulation_System;

import java.time.LocalDateTime;

public class Fine {


    private double amount;
    private LocalDateTime creationDate;
    public Fine(double amount) {

        this.amount=amount;
        this.creationDate= LocalDateTime.now();

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "the member is fined with an ammount of "+amount;
    }
}
