package beecrowd;

import java.util.Scanner;

public class DDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int code = in.nextInt();
		if (code == 61) {	
			System.out.print("Brasilia\n");
		} else if (code == 71) {
			System.out.print("Salvador\n");
		} else if (code == 11) {
			System.out.print("Sao Paulo\n");
		} else if (code == 21) {
			System.out.print("Rio de Janeiro\n");
		} else if (code == 32) {
			System.out.print("Juiz de Fora\n");
		} else if (code == 19) {
			System.out.print("Campinas\n");
		} else if (code == 27) {
			System.out.print("Vitoria\n");
		} else if (code == 31) {
			System.out.print("Belo Horizonte\n");
		} else {
			System.out.print("DDD nao cadastrado\n");
		}
	}

}
