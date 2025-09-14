package OnlineOrders;
import java.util.*;

public class UserApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        FoodMenu order = new FoodMenu(name);
        order.selectCategory(sc);
        order.printBill();
    }
}
