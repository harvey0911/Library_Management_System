package Circulation_System;

import Acquisition_System.Purchase_order;
import Acquisition_System.Shipment;
import Acquisition_System.Vendor;
import Cataloging_Classification_System.*;
import Reporting_and_Analytics_System.Report;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Librarian {

    static int id=1;
    private String employement_id;
    private String name;
    private String phone_number;
    private String email;
    private String password;
    private ArrayList<Purchase_order>purchases=new ArrayList<Purchase_order>();
    private ArrayList<Shipment>shipments=new ArrayList<Shipment>();

    private ArrayList<Vendor> Subscribed_vendors = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Librarian() {
    }

    public Librarian( String name,String email, String password,String phone_number) {
        this.employement_id= String.valueOf(id++);
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        MyDatabase_utility.MylistsUtility.librarians.add(this);
    }

    public String getEmployement_id() {
        return employement_id;
    }

    public void setEmployement_id(String employement_id) {
        this.employement_id = employement_id;
    }


   public void place_hold(Library_Source resource) {
        resource.setHold(true);
    }
    public void remove_hold(Library_Source resource){
        resource.setHold(false);
    }

    // TODO: 2023-05-15 add a method called add_keywords

public void add_KeyWord(Library_Source resource, KeyWord keyword){
        resource.keyWords.add(keyword);


}




    @Override
    public String toString() {
        return "Librarian{" +
                "employement_id='" + employement_id + '\'' +
                '}';
    }

    public void classify_Dewey_Decimal (){

       //classification Dewey decimal algorithm


    }
    public void classify_Congress(){
        
       // Congress Classification algorithm

    }
    public void  Create_Purchase_Order(Vendor vendor, Library_Source inventory,int purchase_number,double cost ){
       Purchase_order purchase_order;

       if(Subscribed_vendors.contains(vendor)) {

           purchase_order= new Purchase_order(vendor,inventory,purchase_number);
       } else{
           purchase_order= new Purchase_order(vendor,inventory,purchase_number,cost);

       }

       purchases.add(purchase_order);

    }


    // TODO: 2023-05-15 receive shipments

    public void receive_shipment(Purchase_order purchase_order){
       Shipment shipment= new Shipment(purchase_order);
        shipment.setStatus(true);
        shipment.setDate(LocalDateTime.now());
        shipments.add(shipment);
  }

    // TODO: 2023-05-15 update inventory
            public void add_to_inventory(Library_Source resource){

                MyDatabase_utility.MylistsUtility.Library_resources.add(resource);
                    if(resource instanceof Book)
                        MyDatabase_utility.MylistsUtility.books.add((Book) resource);
                    else if (resource instanceof Magazine)
                        MyDatabase_utility.MylistsUtility.magazines.add((Magazine) resource);
                    else if (resource instanceof Audio_Source)
                        MyDatabase_utility.MylistsUtility.audio_sources.add((Audio_Source) resource);
                    else if (resource instanceof Video_Source)
                        MyDatabase_utility.MylistsUtility.video_sources.add((Video_Source) resource);


            }

            public void remove_from_inventory(Library_Source resource){
                MyDatabase_utility.MylistsUtility.Library_resources.remove(resource);
                if(resource instanceof Book)
                    MyDatabase_utility.MylistsUtility.books.remove((Book) resource);
                else if (resource instanceof Magazine)
                    MyDatabase_utility.MylistsUtility.magazines.remove((Magazine) resource);
                else if (resource instanceof Audio_Source)
                    MyDatabase_utility.MylistsUtility.audio_sources.remove((Audio_Source) resource);
                else if (resource instanceof Video_Source)
                    MyDatabase_utility.MylistsUtility.video_sources.remove((Video_Source) resource);

            }

    public Report generate_Report(){
           return new Report();
    }
    public void process_inter_library_loan(){
        //@// TODO: 2023-05-15 milestone 5
    }


}
