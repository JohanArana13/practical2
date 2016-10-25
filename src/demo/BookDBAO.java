package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HaouJohan on 10/24/2016.
 */
public class BookDBAO {

    public BookDetails getBookDetails(String bookId){
        return createDummyBook(bookId);
    }

    private BookDetails createDummyBook(String bookId){
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfer the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }

    public List<BookDetails> getAllBooks(){
        BookDetails book1 = new BookDetails();
        book1.setTitle("Duke: A Biography of the Java Evangelist");
        book1.setFirstName("Itzal");
        book1.setSurname("Tru");
        book1.setPrice(45.00f);
        BookDetails book2 = new BookDetails();
        book2.setTitle("From Oak to Java: The Revolution of a Language");
        book2.setFirstName("Kevin");
        book2.setSurname("Novation");
        book2.setPrice(10.75f);
        BookDetails book3 = new BookDetails();
        book3.setTitle("Java Intermediate Bytecodes");
        book3.setFirstName("James");
        book3.setSurname("Gosling");
        book3.setPrice(30.95f);
        BookDetails book4 = new BookDetails();
        book4.setTitle("My Early Years: Growing up on *7");
        book4.setFirstName("Duke");
        book4.setSurname("");
        book4.setPrice(30.75f);
        BookDetails book5 = new BookDetails();
        book5.setTitle("The Green Project: Programming for Consumer Devices");
        book5.setFirstName("Ben");
        book5.setSurname("Thrilled");
        book5.setPrice(30.00f);
        BookDetails book6 = new BookDetails();
        book6.setTitle("Web Components for Web Developers");
        book6.setFirstName("Webster");
        book6.setSurname("Masterson");
        book6.setPrice(27.75f);
        BookDetails book7 = new BookDetails();
        book7.setTitle("Web Servers for Fun and Profit");
        book7.setFirstName("Jeeves");
        book7.setSurname("");
        book7.setPrice(40.75f);
        ArrayList<BookDetails> list = new ArrayList<BookDetails>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        list.add(book7);
        for(int i = 0; i < list.size(); i++){
            list.get(i);
        }
        return list;
    }
}