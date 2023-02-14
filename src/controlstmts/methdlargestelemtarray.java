package controlstmts;

import java.util.Scanner;

public class methdlargestelemtarray {

	public static void main(String[] args) {
		methdlargestelemtarray ob=new methdlargestelemtarray();
		ob.largest();

	}
	public void largest()
	{
		int a[]=new int[4];
		int large=a[0];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println(large+"  is greater");
	}

}
