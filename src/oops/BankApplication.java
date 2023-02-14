package oops;

import java.util.Scanner;

interface Bank
{
	public void accountdetails();
	public void display();
	public void deposit();
	public void withdrawal();
}

class Bankdetails implements Bank
{
	long account_no;
	String name;
	String account_type;
	double balance=0;
	double amount;
	double withdraw_amount;
	Scanner sc=new Scanner(System.in);
	@Override
	public void accountdetails() {
		
		
		System.out.println("Enter account number");
		account_no=sc.nextLong();
		System.out.println("Enter account name");
		 name=sc.next();
		System.out.println("Enter account type(savings/current)");
		 account_type=sc.next();
		System.out.println("Enter balance amount");
		 balance=sc.nextDouble();
		
	
	}

	@Override
	public void display() {
		System.out.println("Account number: "+account_no);
		System.out.println("Account name: "+name);
		System.out.println("Account type: "+account_type);
		System.out.println("Account balance: "+balance);
		System.out.println("Recent Deposit amount: "+amount);
		System.out.println("Recent withdraw amount: "+withdraw_amount);
		
	}
	@Override
	public void deposit() {

		System.out.println("Enter the deposit amount");
		amount=sc.nextDouble();
		balance=balance+amount;
		System.out.println("Deposite amount:  "+amount);
		System.out.println( "Total amount: "+balance);
		
	}

	@Override
	public void withdrawal() {
		System.out.println("Enter the amount do you want to withdraw");
		withdraw_amount=sc.nextDouble();
		balance=balance-withdraw_amount;
		System.out.println("Withdraw amount: "+withdraw_amount);
		System.out.println("Total amount: "+balance);
		
	}


	
	
}
public class BankApplication {

	public static void main(String[] args) {
			Bankdetails ob=new Bankdetails();
			
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
		System.out.println("*****Banking Application Sytem*****");
		System.out.println("Enter the choice:");
		System.out.println("1. Do you want to add account details?");
		System.out.println("2. Do you want to display account details?");
		System.out.println("3. Do you want to deposit amount?");
		System.out.println("4. Do you want to withdraw the money?");
		System.out.println("5. EXIT");
		
		choice=sc.nextInt();
		
		switch(choice)
			{
			case 1:
			ob.accountdetails();
			break;
			case 2:
			ob.display();
			break;
			case 3:
			ob.deposit();
			break;
			case 4:
			ob.withdrawal();
			break;
			default:
				System.out.println("Invalid choice");
				break;
			}
	
		}
	
	while(choice!=4);
	
	}
}


