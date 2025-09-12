package thread2;

import java.util.Iterator;

public class sample extends Thread {
	
	@Override
	public void run() {
		try {
			 for(int i=1; i<=10; i++) {
				 System.out.println(i);
				 Thread.sleep(1000);
			 }
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
