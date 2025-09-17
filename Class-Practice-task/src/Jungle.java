import java.util.Scanner ; 

public class Jungle {
	     
	    String jungleName ; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		Animals a = new Animals();
		Birds b = new Birds();
		Jungle j = new Jungle();
		
		t.nameOfTree = "Banayan Tree";
		t.height = 108 ; 
		t.age = 66 ; 
		
		a.nameOfanimal = "Tiger ";
		a.color = "Yellowish ";
		a.type = "King ";
		
		b.nameOfbirds = " pegion"; 
		b.color = "White "; 
		b.favFood = "Rice";
		
		j.jungleName = "amazon" ; 
				
		System.out.println(j.jungleName);
		System.out.println("----------");
		System.out.println(t.nameOfTree);
		System.out.println(t.height);
		System.out.println(t.age);
		System.out.println("----------");
		System.out.println(a.nameOfanimal);
		System.out.println(a.color);
		System.out.println(a.type);
		System.out.println("----------");
		System.out.println(b.nameOfbirds);
		System.out.println(b.favFood);
		System.out.println(b.color);
	

	}

}
