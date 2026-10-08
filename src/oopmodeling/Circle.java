package oopmodeling;

/**
 * @author sergio
 * @crated 08/10/2026
 */
public class Circle {
    //main properties or attributes of the objects of a class
    private float radius;

    public final float PI = 3.14f;

    //constructors: we use constructors to create objects

    /**
     * The main differences between a normal method and a constructor
     * 1 A constructor is used only to create objects
     * 2 The mame of a constructor is the same as the name of the class
     * Constructor of the class with parameters
     * @param radius
     */
    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    //behaviours,functions or methods
    private float area(){
        return PI* radius* radius;
    }
    public float circumference(){
        return 2* PI * radius;

    }


}
