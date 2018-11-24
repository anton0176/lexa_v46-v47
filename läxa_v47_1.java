package skolarbete;

import java.util.Scanner;

public class läxa_v47_1 {

	public static void main(String[] args) {
	boolean exit = false;
	double tal = 0;
	double summa = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("skriv dina tal");
	
	while(!exit) {
		tal = input.nextDouble();
		summa = summa * tal;
		if (tal == 0) {
			System.out.println(summa);
			exit = true;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
