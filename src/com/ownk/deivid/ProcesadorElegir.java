package com.ownk.deivid;
import java.util.Scanner;

public class ProcesadorElegir {
public void Elegir () {
	String txt; 
	 System.out.print("Ingrese numero ::");
		Scanner A = new Scanner(System.in);
		 int a = A.nextInt();
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
 default: txt= "Invalido";
          break;
		  }
		  }


}

