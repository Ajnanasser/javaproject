package controlstmts;

import java.util.Scanner;

public class numberpattern {

	public static void main(String[] args) {
		int l,i,j,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		l=sc.nextInt();
		for(i=1;i<=l;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
		
			System.out.println();
		}
		

	}

}
