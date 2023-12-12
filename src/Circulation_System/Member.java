package Circulation_System;

import Cataloging_Classification_System.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;


import static Cataloging_Classification_System.Library_Source.*;

public class Member extends Thread {


    private String membership_id;
    static int id;
    private String name;
    private String phone_number;
    private String email;
    private String password;
    private boolean flag = false;

    HashMap<Member, Search_History> member_search = new HashMap<>();


    ArrayList<Reservation> reservations = new ArrayList<>();
    ArrayList<Loan> loans = new ArrayList<>();
public ArrayList<Reminder> reminders= new ArrayList<>();

    public ArrayList<Fine> fines = new ArrayList<>();



    public Member(){}
    public Member(String name,String phone_number,String email,String password) {
        //sign up constructor
        this.membership_id= String.valueOf(id++);
        this.name=name;
        this.phone_number=phone_number;
        this.email=email;
        this.password=password;
        MyDatabase_utility.MylistsUtility.members.add(this);

    }

    public Member(int id, String name, String phone_number, String email, String password, String membership_id) {
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
        this.membership_id = membership_id;
        member_search.put(this, new Search_History());


        MyDatabase_utility.MylistsUtility.members.add(this);

    }


    public Member(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        MyDatabase_utility.MylistsUtility.members.add(this);
    }


    public String getMembership_id() {
        return membership_id;
    }

    public void setMembership_id(String membership_id) {
        this.membership_id = membership_id;
    }


    public void setId(int id) {
        this.id = id;
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

    public  Boolean checkFines() {

        Boolean isfined=false;
        LocalDateTime now = LocalDateTime.now();
        System.out.println("checking fines...");
        for (Loan loan : loans) {

            if (loan.getResource().getStatus() && loan.getDeadline().isBefore(now)) {


                /*Reminder reminder = new Reminder(loan.getResource(), loan.getDeadline(), this);
                reminders.add(reminder);*/

                Duration duration= Duration.between(now, loan.getDeadline());
                long overdue= duration.getSeconds();

                double fineAmount =(- overdue) * 100;


                Fine fine = new Fine(fineAmount);
                fines.add(fine);

                isfined=true;



            }

        }
        System.out.println("done checking fines...");

        return isfined;
     }

    /*
    public  void check_reservations(){

        for (Reservation reservation :reservations) {
            if(!reservation.getResource().getStatus())
                this.Book_item(reservation.getResource());

        }
    }*/


    @Override
    public void run() {
Boolean isfine=false;

        while (true){
         isfine=checkFines();

         if (isfine){
             System.out.println(fines);
         }

         try {
                Thread.sleep(60*60*3600*24); // Sleep for 24 hours (adjust as needed)
            } catch (InterruptedException e) {

            }
        }
    }

        public void return_item (Library_Source resource){
            for (Loan loan : loans) {
                if (resource.equals(loan.getResource()))
                    loans.remove(loan);

            }
        }


        public void Book_item (Library_Source resource){

            resource.setNumber_of_times_demanded();

            if (!resource.getStatus() && !resource.getHold()) {
                Loan loan = new Loan(resource, this, LocalDateTime.now());
                resource.setStatus(true);

                loans.add(loan);


                if (!flag) {
                    this.start();
                    flag = true;
                }


            } else if (resource.getHold()) {

                Reservation r1 = new Reservation(resource, this);
                reservations.add(r1);

            } else if (resource.getStatus()) {

                Reservation r1 = new Reservation(resource, this);
                reservations.add(r1);
                //r1.getResource().waitinglist.offer(r1);
                System.out.println("this item is already booked. a reservation has been set, you will reserve it directly after it's returned");
            }

        }


        public void Cancel_reservation (Library_Source resource){

            for (Reservation reservation : reservations) {
                if (resource == reservation.getResource()) {

                    resource.waitinglist.remove(reservation);
                    reservations.remove(reservation);

                }

            }


        }





    public static ArrayList<Library_Source>  Search(Author author ){
        return  Source_Author.get(author);
    }
    public static ArrayList<Library_Source>  Search( KeyWord keyWord ){


        return  Source_Keyword.get(keyWord);
    }
    public static ArrayList<Library_Source>  Search( Subject subject ){
        return  Source_Subject.get(subject);
    }
    public static ArrayList<Library_Source>  Search( LocalDateTime date ){
        return  Source_Author.get(date);
    }
    public static ArrayList<Library_Source>  Search(Format format){
        return  Source_Author.get(format);
    }

        public static <T > ArrayList < Library_Source > Search(T thing) {

            if (thing instanceof Author) {
                ((Author) thing).setNumber_of_times_searched();
                return Source_Author.get(thing);
            } else if (thing instanceof KeyWord)
                return Source_Keyword.get(thing);
            else if (thing instanceof LocalDateTime)
                return Source_Date.get(thing);
            else if (thing instanceof Subject)
                return Source_Subject.get(thing);


            return null;
        }



    }
