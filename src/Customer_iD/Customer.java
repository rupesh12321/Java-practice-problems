package Customer_iD;

public class Customer {
	
	private String customerID;
	private String name;
	private String email;
	private String mobile_no;
	private String adress;
	private double balance;
	
	public Customer() {
		
	}
	
	public Customer(String customerID, String name, String email, String mobile_no, String adress, double balance) {
		this.customerID = customerID;
		this.name = name;
		this.email = email;
		this.mobile_no = mobile_no;
		this.adress = adress;
		this.balance = balance;
	}
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "\ncustomerID=" + customerID + "\n name=" + name + "\nemail=" + email + ",\n mobile_no=" + mobile_no
				+ " \nadress=" + adress + "\nbalance=" + balance + "]";
	}
	
	
	
	

}
