import java.util.Scanner;

public class ProcesadorElegir {
public void Elegir () {
	String txt; 
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


}

