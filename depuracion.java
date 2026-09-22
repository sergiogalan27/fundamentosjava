package fundamentosjava;
/**
 * 
 * @author sergio
 *15 sept 2026
 */
public class depuracion {
	public class EjemploDebug {
	    public static void main(String[] args) {
	 
	        int edad = 20;
	        double saldo = 150.75;
	        String nombre = "Ana";
	        boolean mayorDeEdad = false;
	 
	        System.out.println("Antes: " + nombre + " " + edad + " " + saldo + " " + mayorDeEdad);
	 
	        edad = edad + 5;
	        saldo = saldo + 100.25;
	        nombre = nombre + " Garcia";
	        mayorDeEdad = edad >= 18;
	 
	        System.out.println("Despues: " + nombre + " " + edad + " " + saldo + " " + mayorDeEdad);
	 
	        if (saldo < 300) {
	            saldo = saldo + 50;
	        }
	 
	        System.out.println("Final: " + saldo);
	    }
	}
}
