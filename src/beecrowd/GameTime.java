package beecrowd;

import java.util.Scanner;

public class GameTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		if (a > b) {
            System.out.println("O JOGO DUROU " + (24 - a + b) + " HORA(S)");
        } else if (a < b) {
            System.out.println("O JOGO DUROU " + (b - a) + " HORA(S)");
        } else if (a == b) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
	}

}
