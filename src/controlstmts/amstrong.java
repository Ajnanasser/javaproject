package controlstmts;

import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
		int r,n,s=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
			
		}
		
		if(s==temp)
		{
			System.out.println("number is amstrong");
		}
		else
		{
			System.out.println("number is not amstrong");
		}

	}

}
