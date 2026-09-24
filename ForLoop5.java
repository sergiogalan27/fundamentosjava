package fundamentosjava;
/**
 * The problem that we are going to resolve:
 * We have a temperature sensor and a 
 * fan connected to a microcontroller.
 * We have to program our microcontroller 
 * in the following way:
 * !whenever the temperature is greater 
 * than 40 degrees, turn on the fan 
 * 2 otherwise turn it off
 * 
 * Sep 24, 2026
 * Sergio
 */
public class ForLoop5 {

    public static void main(String[] args) {
        int temperature = 30;
        String fan;

        if (temperature > 40) {
            fan = "encendido";
        } else {
            fan = "apagado";
        }
        System.out.println("Temperatura: " + temperature + " - Ventilador " + fan);

        for (int i = 35; i <= 45; i++) {
            if (i > 40) {
                fan = "encendido";
            } else {
                fan = "apagado";
            }
            System.out.println("Temperatura: " + i + " - Ventilador " + fan);
        }
    }
}

