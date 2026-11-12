package oopmodeling.universe;

/**
 * @author sergio
 * @crated 12/11/2026
 */
public class Planet extends CelestialBody{
    //declare two different constructors for this class.

    public Planet(double mass, float radius, String name) {
        // create or initialize the parent properties
        super(mass, radius, name);
        /**
         * before changing any properties of an object
         * created from Planet, we must first create
         * its parent
         */
    }

    public Planet() {
        super();
    }
}
