package com.ownk.deivid;
import java.util.Scanner;

public class ProcesadorElegir {
	public String txt;
	public void elegir () {
		
		System.out.print("Ingrese numero :");
		Scanner eleccion = new Scanner(System.in);
		int eleccion_operacion = eleccion.nextInt();
		if (eleccion_operacion==5) {
			System.exit(5);
		} else {
			switch(eleccion_operacion) {
			case 1: ;
			System.out.print("SUMA \n");
			ProcesadorSuma procesadorSuma = new ProcesadorSuma();
			procesadorSuma.suma();
			break;
			case 2: ;
			System.out.print("RESTA \n");
			ProcesadorResta resta = new ProcesadorResta();
			resta.resta();
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

