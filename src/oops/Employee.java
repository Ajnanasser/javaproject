package oops;

public class Employee {
	int empid;
	String empname;
	String designation;

	public static void main(String[] args) {
		Employee e=new Employee();
		e.empid=101;
		e.empname="ajna";
		e.designation="tester";
		e.display();

	}
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(designation);
	}

}
