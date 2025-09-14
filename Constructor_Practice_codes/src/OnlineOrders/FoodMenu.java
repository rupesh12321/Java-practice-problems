package OnlineOrders;
import java.util.*;

public class FoodMenu {
    String customerName;
    String category;
    String item;
    int quantity;
    double pricePerItem;
    double total;
    String customerId;

    public FoodMenu(String customerName) {
        this.customerName = customerName;
        this.customerId = "CUST" + (int)(Math.random() * 10000);
    }

    public void selectCategory(Scanner sc) {
        System.out.println("Select Food Category:");
        System.out.println("1. Fast Food\n2. Breakfast\n3. Lunch");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1 -> category = "Fast Food";
            case 2 -> category = "Breakfast";
            case 3 -> category = "Lunch";
            default -> {
                System.out.println("Invalid choice");
                return;
            }
        }

        showItems(sc);
    }

    private void showItems(Scanner sc) {
        System.out.println("Items in " + category + ":");

        if (category.equals("Fast Food")) {
        	
            System.out.println("1. Burger - ₹80\n2. Pizza - ₹150");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) { 
            	item = "Burger"; 
            	pricePerItem = 80;
            	}
            else if (ch == 2) { 
            	item = "Pizza"; 
            	pricePerItem = 150;
            	}
        } else if (category.equals("Breakfast")) {
        	
            System.out.println("1. Poha - ₹40\n2. Idli - ₹60");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) { 
            	item = "Poha";
            	pricePerItem = 40;
            	}
            else if (ch == 2) {
            	item = "Idli";
            	pricePerItem = 60;
            	}
            
        } else if (category.equals("Lunch")) {
        	
            System.out.println("1. Thali - ₹120\n2. Biryani - ₹200");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) { 
            	item = "Thali"; 
            	pricePerItem = 120; 
            	}
            else if (ch == 2) {
            	item = "Biryani";
            	pricePerItem = 200;
            	}
        }

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        sc.nextLine();

        total = quantity * pricePerItem;
    }

    public void printBill() {
        System.out.println("\n----- Bill -----");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Category: " + category);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: ₹" + total);
        System.out.println("----------------");
    }
}
