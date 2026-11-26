package fundamentosjavaloops;

/**
 * @author sergio
 * @crated 26/11/2026
 */

public class NestedLoop {
    public static void main(String[] args) {
        int x = 10;
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("x =" + x);
                    x = x + 10;
                }
                System.out.println("the final value of x is" + x);
            }
        }
    }
}
