package controlstmts;

import java.util.Scanner;

public class multiarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[][]=new int[size][size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				 a[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				 System.out.print(a[i][j]+"  ");
				
			}
			System.out.println();
		}

	}

}
