package oopmodeling;

/**
 * @author sergio
 * @created 15/10/2026
 */
public class Dog {

    // Atributos privados: solo se pueden usar dentro de esta clase
    private String name;
    private String breed;
    private int age;
    private double weight;     // double: número con decimales (por ejemplo 28.5 kg)
    private String color;

    // Constructor vacío: pone valores por defecto
    public Dog() {
        this.name = "Sin nombre";
        this.breed = "Mestizo";
        this.age = 0;
        this.weight = 0.0;     // 0.0 con punto: así Java sabe que es un decimal
        this.color = "Marrón";
    }

    // Constructor con 2 datos: el resto se rellena con valores por defecto
    public Dog(String name, String breed) {
        this.name = name;      // this.name es el atributo, name es el parámetro
        this.breed = breed;
        this.age = 1;
        this.weight = 5.0;
        this.color = "Marrón";
    }

    // Constructor completo: recibe todos los datos
    public Dog(String name, String breed, int age, double weight, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;  // el parámetro double recibe el peso con decimales
        this.color = color;
    }
}
