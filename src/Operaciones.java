import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		int suma =0;
		 System.out.print("Ingrese numero A::");
			Scanner A = new Scanner(System.in);
			 int a = A.nextInt();
			 System.out.print("Ingrese numero B::");
				Scanner B = new Scanner(System.in);
				 int b = B.nextInt();
				 suma = a+b;
				 System.out.println("Total::"+suma);
				 
	}

}