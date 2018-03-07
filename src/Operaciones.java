import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
	
		
		
		//RESTA
		System.out.println("Digite 1 si desea hacer una resta");
		Scanner localele = new Scanner(System.in);
				int l = localele.nextInt();
		
		do {		
		if (l==1) {
			Resta JResta = new Resta();
			JResta.restas();
		}
		else {
			System.out.println("Su elección no está disponible");
		}
		} while(l!=1);
		
	
		
	}

}