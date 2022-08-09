package beecrowd;

import java.util.Scanner;

public class GameTimeWithMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();

		if (y > b) {
			if (a > x) {
				System.out.println("O JOGO DUROU " + (24 - a + x) + " HORA(S) E " + (y - b) + " MINUTO(S)");
			} else if (a < x) {
				System.out.println("O JOGO DUROU " + (x - a) + " HORA(S) E " + (y - b) + " MINUTO(S)");
			} else if (a == x) {
				System.out.println("O JOGO DUROU 0 HORA(S) E " + (y - b) + " MINUTO(S)");
			}
		} else if (y < b) {
			if (a > x) {
				System.out.println("O JOGO DUROU " + ((24 - a + x) - 1)+ " HORA(S) E " + (60 - (b - y)) + " MINUTO(S)");
			} else if (a < x) {
				System.out.println("O JOGO DUROU " + ((x - a) - 1) + " HORA(S) E " + (60 - (b - y)) + " MINUTO(S)");
			} else if (a == x) {
				System.out.println("O JOGO DUROU 23 HORA(S) E " + (60 - (b - y)) + " MINUTO(S)");
			}
		} else if (y == b) {
			if (a > x) {
				System.out.println("O JOGO DUROU " + (24 - a + x) + " HORA(S) E 0 MINUTO(S)");
			} else if (a < x) {
				System.out.println("O JOGO DUROU " + (x - a) + " HORA(S) E 0 MINUTO(S)");
			} else if (a == x) {
				System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
			}
		}
	}

}
