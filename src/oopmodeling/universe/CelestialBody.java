package oopmodeling.universe;

/**
 * @author sergio
 * @crated 12/11/2026
 */
public class CelestialBody {
    public double mass;

    private float radius;

    public String name;

    public CelestialBody(double mass, float radius, String name) {
        this.mass = mass;
        this.radius = radius;
        this.name = name;
    }

    public CelestialBody() {
    }
}
