package beecrowd;

import java.util.Scanner;

public class Grenais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 0;
		int inter = 0;
		int gre = 0;
		int emp = 0;
		while(true) {
			count++;
			int a = in.nextInt();
			int b = in.nextInt();
			if (a > b) {
				inter++;
			} else if (a < b) {
				gre++;
			} else {
				emp++;
			}
			System.out.print("Novo grenal (1-sim 2-nao)\n");
			int input = in.nextInt();
			if (input == 1) {
				continue;
			} else if (input == 2) {
				System.out.printf("%d grenais\n", count);
				System.out.printf("Inter:%d\n", inter);
				System.out.printf("Gremio:%d\n", gre);
				System.out.printf("Empates:%d\n", emp);
				if (inter > gre) {
					System.out.print("Inter venceu mais\n");
				} else if (inter < gre) {
					System.out.print("Gremio venceu mais\n");
				} else {
					System.out.print("Nao houve vencedor\n");
				}
				break;
			}
		}
	}

}
