package Company_Employee;

public class Employee {
	
	String empId;
	String name;
	double baseSalary;
	double bonus; 
	
	
	public Employee(String empId, String name, double baseSalary, double bonus) {
		super();
		this.empId = empId;
		this.name = name;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}

	public void employeeInfo() {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+baseSalary);
		System.out.println("Employee Bonus : "+bonus);
		System.out.println();
	}
	
	public void claculateTotalSalary() {
		System.out.println("Total Salary : "+(baseSalary+bonus));
		System.out.println();
	}
	
	public void displaySlip() {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+baseSalary);
		System.out.println("Employee Bonus : "+bonus);
		System.out.println("Total Salary : "+(baseSalary+bonus));
		System.out.println();
	}
	

}
