package com.inheritance;
class Employee{
	String empname;
	int empid;
	double empsal;
	public Employee(String empname, int empid, double empsal) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.empsal = empsal;
	}
	public void displayDetails() {
		System.out.println("Employee Name is "+this.empname);
		System.out.println("Employee Id is "+this.empid);
		System.out.println("Employee Salary is "+this.empsal);
	}
}
class Manager extends Employee{
	String department;

	public Manager(String empname, int empid, double empsal, String department) {
		super(empname, empid, empsal);
		this.department = department;
	}
	public void manageTeam() {
		System.out.println("Managing the "+this.department);
	}
	
}
public class Developer extends Employee{
	String programmingLanguage;
	
	public Developer(String empname, int empid, double empsal, String programmingLanguage) {
		super(empname, empid, empsal);
		this.programmingLanguage = programmingLanguage;
	}
	public void writeCode() {
		System.out.println("Writing code in "+this.programmingLanguage);
	}

	public static void main(String[] args) {
		Manager mg=new Manager("Mounika", 204, 25000, "Admin");
		mg.displayDetails();
		mg.manageTeam();
		Developer dp=new Developer("Mounika", 203, 20000, "java");
		dp.writeCode();
		
		
	}

}
