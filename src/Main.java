import Cataloging_Classification_System.*;
import Circulation_System.Librarian;
import Circulation_System.Member;
import GUI.Login;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static Cataloging_Classification_System.Library_Source.*;

public class Main {

//@// TODO: 2023-05-08 check why i cannot access the arraylist authors from the author class even though it's static

    public static void main(String[] args) {


        Author author1= new Author("Aymane");
        Author author2= new Author("anas");



        Book b1= new Book("Social and political science vol1",author1, LocalDateTime.now(),"1234","12345",false,false,false,0,Subject.SOCIALSCIENCES);
        Book b2= new Book("Social and political science vol2",author1, LocalDateTime.now(),"12345","12345",false,false,false,0,Subject.SOCIALSCIENCES);

        Book b3= new Book("another book written by the same person",author1);//@todo reminder that also have this optimized constrcutor

        Book b4= new Book("islamic art and architecture vol1",author2, LocalDateTime.now(),"123456","12345",false,false,false,0,Subject.ART_AND_ARCHITECTURE);
        Book b5= new Book("islamic art and architecture vol2",author2, LocalDateTime.now(),"123456","12345" ,false,false,false,0,Subject.ART_AND_ARCHITECTURE);

        Book b6= new Book("Social and political science vol3",author2, LocalDateTime.now(),"123456789","12345",true,false,false,0,Subject.SOCIALSCIENCES);


        Member m1= new Member();
        Subject s1= Subject.SOCIALSCIENCES;


        KeyWord k1= new KeyWord("social");
        KeyWord k2= new KeyWord("environment");
        ArrayList<KeyWord>keywords= new ArrayList<>();
        keywords.add(k1);
        keywords.add(k2);





        Source_Subject.put(s1,b1);
        Source_Date.put(b1.getDate(),b1);

        // TODO: 2023-05-08 check why is the hashmap linking author with arraylist of library source does not accept array of books although it's an instance of library source






        System.out.println(Source_Author.get(b1));

        Librarian l1= new Librarian();

        Source_Keyword.put(k1,b1);
        Source_Keyword.put(k1,b3);

        Member m2= new Member("aymane","aymaneaitmansour@gmail.com","123");
        Member m3= new Member();
        Member m4= new Member();
        Member m5= new Member();


        System.out.println("--------------------");

        m1.Book_item(b1);

        System.out.println(m1.reminders);


        l1.generate_Report();




        Search_History search_history1= new Search_History();

        search_history1.search_by_author_name=m1.Search(author1);
        search_history1.search_by_subject=m1.Search(Subject.ART_AND_ARCHITECTURE);
        System.out.println(search_history1);









































    }
}