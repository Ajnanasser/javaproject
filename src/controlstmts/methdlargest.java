package controlstmts;

import java.util.Scanner;

public class methdlargest {

	public static void main(String[] args) {
		methdlargest ob=new methdlargest();
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter 3 values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		ob.largest(a, b, c);

	}
	public void largest(int a,int b,int c)
	{
		if(a>b && a>c)
			System.out.println(a+" is greater");
		else if(b>a && b>c)
			System.out.println(b+" is greater");
		else 
			System.out.println(c+" is greater");
		
	}

}
