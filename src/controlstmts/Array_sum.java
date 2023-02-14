package controlstmts;

import java.util.Scanner;

public class Array_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int sum=0;
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			 a[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum is"+sum);
		
		

	}

}
