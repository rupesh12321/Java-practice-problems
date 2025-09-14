package Employee;


public class Employee {
	
	String employeeOfId ; 
	String employeeOfName ; 
	String employeeOfAdress ; 
	int  employeeOfAge ; 
	String employeeOfGender ; 
	float employeeOfExperience ; 
	String employeeOfMobile_no ; 
	String employeeOfEmailid ; 
	double employeeOfSalary ; 
	
	public Employee(String Id ,String name , String Adress , int age ,  String gender , float experience , String mobile_no ,  String emailid , double salary ) {
		employeeOfId = Id ;
		employeeOfName = name  ; 
	    employeeOfAdress = Adress ; 
		employeeOfAge = age  ; 
		employeeOfGender = gender ; 
		employeeOfExperience = experience  ; 
		employeeOfMobile_no = mobile_no ; 
		employeeOfEmailid = emailid ; 
		employeeOfSalary = salary ; 
		
	}
	
	public Employee() {
		
		employeeOfId = "RUpesh#321" ;
		employeeOfName = "Rupesh Sharma " ; 
	    employeeOfAdress = "Ghurarikar Layout Nagpur " ; 
		employeeOfAge =  24 ; 
		employeeOfGender = "male" ; 
		employeeOfExperience = 4.5f  ; 
		employeeOfMobile_no = "7219739294" ; 
		employeeOfEmailid = "rupeshsharma066@gmail.com" ; 
		employeeOfSalary = 36500 ;
		
	}
	
	public void displayEmployeDetail() {
		System.out.println("Employee ID : "+employeeOfId);
		System.out.println("Employee Name : "+employeeOfName);
		System.out.println("Employee Adress : "+employeeOfAdress);
		System.out.println("Employee Age : "+employeeOfAge+"Years");
		System.out.println("Employee Gender : "+employeeOfGender);
		System.out.println("Employee Experience : "+employeeOfExperience+"Years");
		System.out.println("Employee Mobile-No : "+employeeOfMobile_no);
		System.out.println("Employee Mail-ID : "+employeeOfEmailid);
		System.out.println("Employee Salary : "+employeeOfSalary);
		System.out.println();
	}
  

}
