package com.ownk;
import java.util.Scanner;

public class ProcesadorSuma {
	public  void suma() {

		int suma =0;

		 System.out.print("Ingrese numero A::A");
			Scanner A = new Scanner(System.in);
			 int a = A.nextInt();
			 System.out.print(" Ingrese numero B::");
				Scanner B = new Scanner(System.in);
				 int b = B.nextInt();
				 suma = a+b;
				 System.out.println("Total::"+suma);
				 
	}
}
