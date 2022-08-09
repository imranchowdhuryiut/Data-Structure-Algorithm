package beecrowd;

import java.util.Scanner;

public class SalaryIncrease {
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salary = in.nextDouble();
		if (salary >= 0 && salary <= 400) {
			calculateIncrement(salary, 15);
		} else if (salary > 400 && salary <= 800) {
			calculateIncrement(salary, 12);
		} else if (salary > 800 && salary <= 1200) {
			calculateIncrement(salary, 10);
		} else if (salary > 1200 && salary <= 2000) {
			calculateIncrement(salary, 7);
		} else {
			calculateIncrement(salary, 4);
		}
	}

	private static void calculateIncrement(double salary, int i) {
		// TODO Auto-generated method stub
		double newSalary = ((salary * i) / 100) + salary;
		double newEarned = newSalary - salary;
		System.out.printf("Novo salario: %.2f\n"	, newSalary);
		System.out.printf("Reajuste ganho: %.2f\n"	, newEarned);
		System.out.printf("Em percentual: %d %%\n"	, i);
	}
	
}
