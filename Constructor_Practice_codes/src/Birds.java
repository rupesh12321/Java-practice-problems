
public class Birds {
	
	String nameOfBird ; 
	String color ; 
	String favFood;
	
	public Birds(String name , String color ,String favfood) {
		nameOfBird = name;
		this.color=color;
		this.favFood=favfood;
		
	}
	public Birds() {
		nameOfBird = "Parrot" ;
		this.color= "Green";
		this.favFood= "Guva";
		
	}
	public void showBirdsInfo(){
		System.out.println(nameOfBird);
		System.out.println(color);
		System.out.println(favFood);
		
	}

}
