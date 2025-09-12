package task1;

import java.util.Scanner;

public class demo extends Thread {
	
	
	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String s = sc.nextLine();
		
		try {
			for(char i=0 ; i<=s.length(); i++) {
				
				System.out.print(s.charAt(i));
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("\nString is Ended ");
		}
	}

}
