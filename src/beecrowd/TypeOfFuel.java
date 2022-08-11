package beecrowd;

import java.util.Scanner;

public class TypeOfFuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int alc = 0;
		int gas = 0;
		int die = 0;
		while (true) {
			int code = in.nextInt();
			if (code >= 1 && code <= 4) {
				if (code == 1) {
					alc++;
				} else if (code == 2) {
					gas++;
				} else if (code == 3) {
					die++;
				} else {
					break;
				}
			} else {
				continue;
			}
		}
		System.out.print("MUITO OBRIGADO\n");
		System.out.printf("Alcool: %d\n", alc);
		System.out.printf("Gasolina: %d\n", gas);
		System.out.printf("Diesel: %d\n", die);
	}

}
