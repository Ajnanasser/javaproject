package oops;
/* wrapping for data together into a single  unit.eg:class.
 * To achieve encapsulation in JAVA
 * 1.declare variable as private
 * 2.view  and modify  variables values through public getter(read only)and setter(write only)methods
 * advantages:-data security,reusability,increase readability and flexibility
  */
 class emp
 {
	 private String Empname;
	 private int empid;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	 
 }
public class Encapsulationpgm {

	public static void main(String[] args) {
		emp ob=new emp();
		ob.setEmpid(100);
		ob.setEmpname("ajna");
		System.out.println(ob.getEmpid());
		System.out.println(ob.getEmpname());

	}

}
