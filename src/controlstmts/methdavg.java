package controlstmts;

import java.util.Scanner;

public class methdavg {

	public static void main(String[] args) {
		methdavg ob=new methdavg();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 values");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		ob.avg(a,b,c);
		
		

	}
	public void avg(double a,double b,double c)
	{
		double d=(a+b+c)/3;
		System.out.println("average= "+d);
		
	}

}
