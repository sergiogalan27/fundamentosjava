package fundamentosjava;

public class VariablesTest {
	public static void main (String[] args) {

		//the structure of the declaration of a variable:
		//type of the variable + name of the variables 
		// = is the assignment operator
		String name = "Nestor";
		
		System.out.println(1223123);
		System.out.println("Hello Java");
		name = "asier";
		System.out.println(name); 
		//Declaration of an integer variable
		//4 bytes
		//1 byte is 8 bits
		int age = 23432432;
		long weight = 2345655745743l;// a long variable has 8 bytes
		float height = 23.3f;// a float variable holds 4 bytes
		double b = 324.32243344;//a double has 8 bytes
		byte a = 127;//a byte has only one byte of capacity
				
		//increase the value of "age" by 10
		age = age + 10;
		System.out.println(age);
		age = age * 10;// * multiplication operator
		System.out.println(age);
		weight = weight - 100000;
		System.out.println(weight);
		height = height / 100;// division
		System.out.println(height);
		
		
		a = 3;
		b = 4;
		System.out.println("the square of a = " + a * a);
		System.out.println("the square of a = " + b * b);
		System.out.println("the square of c = " + a * a + b * b);
		
		final int SPEED_OF_LIGHT = 300000000;
//		SPEED_OF_LIGHT = 234;
		
	}
}

