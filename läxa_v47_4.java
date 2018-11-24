package skolarbete;

public class läxa_v47_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int summa = 0;
		for (int i = 1; i < 10000; i++) {
			if (i % 7 == 0) {
				summa += i;
			}
		}

		System.out.println("Summa: " + summa);

	}

}

