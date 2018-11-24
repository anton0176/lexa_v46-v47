package skolarbete;

import java.util.Scanner;

public class läxa_v47_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Skapa ett program som läser in textrader från konsolen och avslutas när texten EXIT skrivs in.
		
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
