package com.ownk.joan;
import java.util.Scanner;

public class ProcesadorElegir {
	private String txt;
	
public void elegir () {
	
	 System.out.print("Ingrese numero ::");
		Scanner A = new Scanner(System.in);
		 int a = A.nextInt();
		  switch(a) {
		  case 1: ;
	  System.out.print("SUMA");
			 ProcesadorSuma procesadorSuma = new ProcesadorSuma();
			 procesadorSuma.suma();
          break;
 
 default: txt= "Invalido";
          break;
		  }
		  }

public String getTxt() {
	return txt;
}

public void setTxt(String txt) {
	this.txt = txt;
}


}

