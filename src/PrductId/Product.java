package PrductId;


public class Product {
	
	private String productid;
	private String name;
	private String discription;
	private Double price ;
	private float quantity ;
	private String category;
	
	
	public Product() {
		
	}


	public Product(String productid, String name, String discription, Double price, float quantity, String category) {
		this.productid = productid;
		this.name = name;
		this.discription = discription;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	public String getProductID() {
		return productid;
	}
	public void setProductID(String productID) {
		this.productid = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription= discription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price= price;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity ) {
		this.quantity=quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category= category;
	}


	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", discription=" + discription + ", price="
				+ price + ", quantity=" + quantity + ", category=" + category + "]";
	}
	
    
}
