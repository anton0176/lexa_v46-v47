package skolarbete;

import java.util.Scanner;

public class l�xa_v47_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Skapa ett program som l�ser in textrader fr�n konsolen och avslutas n�r texten EXIT skrivs in.
		
		String ord = "";
		
		Scanner input=new Scanner(System.in);
		System.out.println("skriv en text rad");
	
		boolean exit = false;
		while (!exit) {
			ord =input.nextLine();
			
			if (ord.equals("Exit")) {

				exit = true;
			} 
			
			else {
				System.out.println(ord);
			}
		}
		
		
		
		
		
		
	}

}
