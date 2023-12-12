package Acquisition_System;

import Cataloging_Classification_System.Library_Source;

import java.time.LocalDateTime;

public class Purchase_order {
    private Vendor vendor;
    private Library_Source resource;
    private double Cost;
    private int PurchaseNumber;
    private LocalDateTime Date;

    public Purchase_order() {
    }

    public Purchase_order(Vendor vendor, Library_Source inventory, int PurchaseNumber, double cost){
        this.Cost = cost;
      this.vendor=vendor;
      this.resource=inventory;
      this.PurchaseNumber=PurchaseNumber;
      this.Date=LocalDateTime.now();
  }

    public Purchase_order(Vendor vendor, Library_Source inventory, int PurchaseNumber){
        this.vendor=vendor;
        this.resource=inventory;
        this.PurchaseNumber=PurchaseNumber;
        this.Date=LocalDateTime.now();
    }



    //public void update_inventory();
}
