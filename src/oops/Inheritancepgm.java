package oops;

class Member
{
	String name;
	  int age;
	  long phoneno;
	  String address;
	  int salary;
	public void displaymember()
	{
	  System.out.println("Name="+name); 
	  System.out.println("age="+age); 
	  System.out.println("phone no="+phoneno); 
	  System.out.println("address="+address); 
	  System.out.println("Salary="+salary); 
	  
	}
}
class Employees extends Member
{
	String specialization;
	public void print()
	{
		System.out.println("Specialization="+specialization);
	}
}
class Manager extends Member
{
	String department;
	public void print1()
	{
		System.out.println("Department="+department);
	}
}
public class Inheritancepgm {
	public static void main(String[] args) {
   Employees e1=new Employees();
   e1.name="ajna";
   e1.age=26;
   e1.phoneno=95864723;
   e1.address="nandhanam";
   e1.salary=50000;
   e1.specialization="tester";
   e1.displaymember();
   e1.print();
   Manager m=new Manager();
   m.name="anu";
   m.age=25;
   m.phoneno=9548623;
   m.address="priyam";
   m.salary=6000;
   m.department="dept of software testing";
   m.displaymember();
   m.print1();
    
}
}

