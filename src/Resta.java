import java.util.Scanner;

public class Resta {
public static void main(String args[]) {
	
		
		int jorney;
		System.out.println("Digite Numero uno: ");
		Scanner local = new Scanner(System.in);
				int locals = local.nextInt();
		System.out.println("Digite Numero dos: ");
		Scanner segundi= new Scanner (System.in);
				int segundis = segundi.nextInt();
		jorney= locals - segundis;
		System.out.println("La resta entre"+locals + " y "+ segundis +"es: "+ jorney);
				
	}

}
