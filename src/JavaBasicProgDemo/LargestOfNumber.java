package JavaBasicProgDemo;

import java.util.Scanner;

public class LargestOfNumber {

	public static void main(String[] args) {
		// largest of three number

		int a, b, c;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter 1st number ");
		a = s.nextInt();

		System.out.println("Enter 2st number ");
		b = s.nextInt();

		System.out.println("Enter 3rd number ");
		c = s.nextInt();

		if (a > b && a > c) {

			System.out.println("  a is largest number");
		}

		else if (b > a && b > c) {

			System.out.println("  b is largest number");
		}

		else {
			System.out.println("c is larget number");
		}
		

	}
}
