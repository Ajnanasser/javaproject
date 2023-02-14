package oops;


public class Employeeconstructor {
	int empid;
	String empname;
	String designation;
	public Employeeconstructor(int empid,String empname,String designation) {
		this.empid=empid;
		this.empname=empname;
		this.designation=designation;
	}
	public static void main(String[] args) {
		Employeeconstructor e=new Employeeconstructor(101,"ajna","tester");
		e.display();

	}
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(designation);
	}

}
