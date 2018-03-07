package com.ownk.deivid;
import java.util.Scanner;

public class ProcesadorSuma {
	public  void suma() {

		int suma =0;
		System.out.print("Ingrese numero A::");
		Scanner primer_numero = new Scanner(System.in);
		int numeroa = primer_numero.nextInt();
		System.out.print("Ingrese numero B::");
		Scanner segundo_numero = new Scanner(System.in);
		int numerob = segundo_numero.nextInt();
		suma = numeroa+numerob;
		System.out.println("Total::"+suma);


	}
}
