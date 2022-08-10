package beecrowd;

import java.util.Scanner;

public class FixedPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true) {
			int pass = in.nextInt();
			if (pass == 2002) {
				System.out.print("Acesso Permitido\n");
				break;
			} else {
				System.out.print("Senha Invalida\n");
			}
		}
	}

}
