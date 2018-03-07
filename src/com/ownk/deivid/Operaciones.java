package com.ownk.deivid;
import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {

	System.out.println("Bienvenido a la calculadora de OWNK");
	System.out.println("Presione 1 para hacer suma de 2 numeros");
	System.out.println("Presione 2 para hacer resta de 2 numeros");
	System.out.println("Presione 3 para hacer multiplicación de 2 numeros");
	System.out.println("Presione 4 para hacer división de 2 numeros");
	System.out.println("Presione 5 salir");
	 
	 ProcesadorElegir procesadorElegir = new ProcesadorElegir();
	 procesadorElegir.elegir();
	
	 System.exit(5);
	

}
}