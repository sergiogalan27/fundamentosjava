package oopmodeling;


import oopmodeling.universe.BlackHole;


public class Test {

    public static void main(String[] args) {

        BlackHole bh1 = new BlackHole("Guille");
        System.out.println(bh1);
        System.out.println(bh1.mass);

        BlackHole bh10 = new BlackHole("Asier");
        System.out.println(bh10);
        System.out.println(bh10.mass);

        for (int i = 0; i < 10000000; i++) {
            System.out.println(new BlackHole("Anix"));
            /**
             * try-catch statement is used to capture
             * potential exceptions
             */
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}





