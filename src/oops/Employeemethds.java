package oops;

public class Employeemethds {
	int empid;
	String empname;
	String designation;
	public static void main(String[] args) {
		Employeemethds e=new Employeemethds();
		e.setvalues(101, "anil", "tester");
		e.display();
		

	}
	public void setvalues(int empid,String empname,String designation)
	{
		this.empid=empid;
		this.empname=empname;
		this.designation=designation;
	}
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(designation);
	}

}
