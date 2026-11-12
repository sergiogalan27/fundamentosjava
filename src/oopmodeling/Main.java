package oopmodeling;

import oopmodeling.math.Circle;

/**
 * @author sergio
 * @created 08/10/2026
 */
public class Main {
    public Main() {
    }

    static void main(String[]args){
        // create three objects from "Circle" class

        Circle c1 = new Circle(2);
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        // Print the memory addresses of the objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        // Call methods of the objects
        System.out.println(c1.circumference());
        System.out.println(c2.circumference());
        System.out.println(c3.circumference());
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c3.area());

        Book b1=
                new Book(12, "beyond good and evil");
        System.out.println(b1.category);
        b1.category = "science fiction";
        System.out.println(b1.category);

        Book b2=
                new Book(13,"spiderman");
        System.out.println(b2.category);
        b2.category ="adventures";
        System.out.println(b2.category);

        Book b3=
                new Book(14,"harry potter");
        System.out.println(b3.category);
        b2.category ="mystery";
        System.out.println(b3.category);
    }
}

