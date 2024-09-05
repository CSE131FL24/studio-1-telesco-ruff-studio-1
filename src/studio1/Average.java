package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("First number: ");
		double n1 = in.nextInt();
		System.out.println("Second number: ");
		double n2 = in.nextInt();
		
		double average = (n1 + n2) / 2;
		System.out.println(average);

	}

}
