package pkg;

import java.util.Scanner;

public class pgmadd {

	

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		int c=a+b;
		System.out.println("sum is"+c);

	}

}
