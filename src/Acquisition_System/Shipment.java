package Acquisition_System;

import java.time.LocalDateTime;

public class Shipment {
    private Purchase_order purchase;
    private boolean status;
    private LocalDateTime date;
    public Shipment(Purchase_order purchase) {
        this.purchase = purchase;
        this.status = false;
    }

    public Shipment() {
    }

    public Purchase_order getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase_order purchase) {
        this.purchase = purchase;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "purchase=" + purchase +
                ", status=" + status +
                '}';
    }
}
