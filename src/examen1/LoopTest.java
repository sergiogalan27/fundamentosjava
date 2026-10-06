package examen1;

public class LoopTest {
    static void main(String[] args) {
        int acumulador = 10;
        int contadorPares = 0;
        int paso = 0;

        //Proceso repetitivo para analizar la automatizacion
        for (int i = 1; i < 6; i++) {
            paso++;

            if(i % 2 == 0){
                acumulador= acumulador + i;
                contadorPares++;
            }else {
                acumulador = acumulador -1;
            }
        }
        System.out.println("Fin del programa.");
    }
}
