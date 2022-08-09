package beecrowd;

import java.util.Scanner;

public class Taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double salary = in.nextDouble();
		double totalTax = 0.0;
		
		if (salary >= 0.0 && salary <= 2000.0) {
			System.out.print("Isento\n");
		} else if (salary > 2000.00 && salary <= 3000.00) {
			double temSalary = salary - 2000.00;
			totalTax = (8 * temSalary) / 100;
			System.out.printf("R$ %.2f\n", totalTax);
		} else if (salary > 3000.00 && salary <= 4500.00) {
			double temSalary = salary - 2000.00;
			double firstCom = temSalary - 1000.00;
			totalTax = ((8 * 1000) / 100) + ((firstCom * 18) / 100);
			System.out.printf("R$ %.2f\n", totalTax);
		} else if (salary > 4500.00) {
			double temSalary = salary - 2000.00;
			double firstCom = temSalary - 1000.00;
			double secondCom = firstCom - 1500.00;
			totalTax = ((8 * 1000) / 100) + ((1500 * 18) / 100) + ((secondCom * 28) / 100);
			System.out.printf("R$ %.2f\n", totalTax);
		}
		
	}

}
