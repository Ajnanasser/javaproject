package controlstmts;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int f=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;//1*1=1 ,1*2=2,2*3=6,6*4=24
			
		}
		System.out.println("factorial of "+n+ " is "+f);
	}

}


















