package examen1;

public class AutomatizationLoop {
    static void main(String[] args) {
        int contador = 1;
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            total = total + (contador*5);
            contador++;
        }
        System.out.println(contador);
        System.out.println(total);
    }
}
