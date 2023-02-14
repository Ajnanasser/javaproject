package pkg;

public class Employeedetails {
int empid;//instance variable or global
String empname;
static String companyname="luminar";//static variable:-only one time memory space location allocated
public void empdetails(){
	int a=10;//local variable
	System.out.println("Enter empdetails");
}
	public static void main(String[] args) {
		Employeedetails emp1=new Employeedetails();
		emp1.empid=101;
		emp1.empname="ajna";
		emp1.empdetails();
		System.out.println(companyname);
		
				

	}

}
