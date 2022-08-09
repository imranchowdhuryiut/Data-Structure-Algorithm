package beecrowd;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String word1 = in.nextLine();
		String word2 = in.nextLine();
		String word3 = in.nextLine();
		
		if (word1.equals("vertebrado")) {
			if (word2.equals("ave")) {
				if (word3.equals("carnivoro")) {
					System.out.print("aguia\n");
				} else {
					System.out.print("pomba\n");
				}
			} else {
				if (word3.equals("onivoro")) {
					System.out.print("homem\n");
				} else {
					System.out.print("vaca\n");
				}
			}
		} else {
			if (word2.equals("inseto")) {
				if (word3.equals("hematofago")) {
					System.out.print("pulga\n");
				} else {
					System.out.print("lagarta\n");
				}
			} else {
				if (word3.equals("hematofago")) {
					System.out.print("sanguessuga\n");
				} else {
					System.out.print("minhoca\n");
				}
			}
		}

	}

}
