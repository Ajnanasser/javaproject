package controlstmts;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		double c=0;
		int n;
		do
		{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		System.out.println("Enter the choice\n1.add\n2.subtraction\n3.multiplication\n4.division\n5.modulus");
		 n=sc.nextInt();
		switch(n)
		{
		case 1:c=a+b;
			
			break;
		case 2:c=a-b;
		System.out.println(a-b);
		break;
		case 3:c=a*b;
		
		break;
		case 4:c=a/b;
		
		break;
		case 5:c=a%b;

		break;
		default:System.out.println("Invalid choice");
			
		}
		System.out.println("result="+c);
	}
	while(n>=0);

}
}
