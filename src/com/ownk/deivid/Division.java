package com.ownk.deivid;

import java.util.Scanner;

public class Division {
public void Divi() {
	
		
		int divi;
		System.out.println("Digite Numero uno: ");
		Scanner local = new Scanner(System.in);
				int locals = local.nextInt();
		System.out.println("Digite Numero dos: ");
		Scanner segundi= new Scanner (System.in);
				int segundis = segundi.nextInt();
				divi= locals / segundis;
		System.out.println("La Multiplicaci�n entre "+locals + " y "+ segundis +" es: "+ divi);
				
	}
}