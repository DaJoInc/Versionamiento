package com.ownk.deivid;
import java.util.Scanner;

public class ProcesadorElegir {
	public void elegir () {
		String txt; 
		System.out.print("Ingrese numero :");
		Scanner A = new Scanner(System.in);
		int a = A.nextInt();
		if (a==5) {
			System.exit(5);
		} else {
			switch(a) {
			case 1: ;
			System.out.print("SUMA \n");
			ProcesadorSuma procesadorSuma = new ProcesadorSuma();
			procesadorSuma.suma();
			break;
			case 2: ;
			System.out.print("RESTA \n");
			Resta restica = new Resta();
			restica.restas();
			break;
			case 3: ;
			System.out.print("MULTIPLICACIÓN \n");
			Multiplicación multiplica = new Multiplicación();
			multiplica.multipli();
			break;
			case 4: ;
			System.out.print("Division \n");
			ProcesadorDivision division = new ProcesadorDivision();
			division.division();
			break;
			default: txt= "Invalido";
			return ;
			}
			
		}

	}


}

