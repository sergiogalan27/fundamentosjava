package oopmodeling;

import java.util.Date;

/**
 * How to design a class
 * 1 declaration of variables to represent common attributes
 * @author sergio
 * @created 15/10/2026
 */
public class Book {
    //part 1 object variables
    private long id;

    private String title;

    private String author;

    private Date releaseDate;

    private int numOfPages;

    public String category;

    //part 2 constructors

    public Book(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(long id, String title, String author, Date releaseDate, int numOfPages, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.numOfPages = numOfPages;
        this.category = category;
    }
//part 3 methods
}
