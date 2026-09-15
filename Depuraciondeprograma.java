package fundamentosjava;
/**
 * 
 * @author sergio
 *15 sept 2026
 */
public class Depuraciondeprograma {
	/**
	 * EjemploDebug.java
	 *
	 * Programa de ejemplo para practicar el uso del debugger de Eclipse.
	 * Contiene 4 variables de tipos diferentes (int, double, String, boolean),
	 * y una variable adicional (char) para enriquecer el ejercicio.
	 * Cada variable se modifica varias veces a lo largo del programa,
	 * para que puedas observar cómo cambia su valor paso a paso
	 * usando "Step Over" (F6) en el debugger de Eclipse.
	 */
	public class EjemploDebug {

	    public static void main(String[] args) {

	        // ---------- 1. Declaración inicial de variables ----------
	        int edad = 20;                 // tipo entero
	        double saldoCuenta = 150.75;   // tipo decimal
	        String nombre = "Ana";         // tipo cadena de texto
	        boolean esMayorDeEdad = false; // tipo booleano
	        char inicial = 'A';            // tipo carácter (extra)

	        System.out.println("=== Valores iniciales ===");
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	        System.out.println("Saldo: " + saldoCuenta);
	        System.out.println("Es mayor de edad: " + esMayorDeEdad);
	        System.out.println("Inicial: " + inicial);

	        // ---------- 2. Primera modificación de variables ----------
	        edad = edad + 5;                    // 20 -> 25
	        saldoCuenta = saldoCuenta + 100.25;  // 150.75 -> 251.00
	        nombre = nombre + " García";        // "Ana" -> "Ana García"
	        esMayorDeEdad = edad >= 18;         // false -> true
	        inicial = Character.toLowerCase(inicial); // 'A' -> 'a'

	        System.out.println("\n=== Después de la primera modificación ===");
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	        System.out.println("Saldo: " + saldoCuenta);
	        System.out.println("Es mayor de edad: " + esMayorDeEdad);
	        System.out.println("Inicial: " + inicial);

	        // ---------- 3. Segunda modificación (dentro de un bucle) ----------
	        // Ideal para colocar un breakpoint y observar cómo cambian
	        // las variables en cada iteración con el debugger.
	        for (int i = 1; i <= 3; i++) {
	            edad = edad + 1;
	            saldoCuenta = saldoCuenta - 20.5;
	            System.out.println("\nIteración " + i +
	                    " -> Edad: " + edad + " | Saldo: " + saldoCuenta);
	        }

	        // ---------- 4. Modificación condicional ----------
	        if (saldoCuenta < 200) {
	            saldoCuenta = saldoCuenta + 50; // se recarga el saldo
	            System.out.println("\nSaldo recargado: " + saldoCuenta);
	        }

	        // ---------- 5. Valores finales ----------
	        System.out.println("\n=== Valores finales ===");
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	        System.out.println("Saldo: " + saldoCuenta);
	        System.out.println("Es mayor de edad: " + esMayorDeEdad);
	        System.out.println("Inicial: " + inicial);
	    }
	}
}
