package controlstmts;

import java.util.Scanner;

public class sum_n_digits {

	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit of numbers");
		n=sc.nextInt();
		while(i<=n)
		{
			
			sum=sum+i;
			i++;
		}
		System.out.println("sum is   "+sum);

	}

}
