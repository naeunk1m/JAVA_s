package threadex;

import java.util.Random;

import javax.swing.JOptionPane;

public class ThreadEx1 {
	public static void main(String[ ] args) {
		Random rand = new Random();
		int num1 = rand.nextInt(9)+1;
		int num2 = rand.nextInt(9)+1;
		
		for(int i=10; i>0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		String result = 
		JOptionPane.showInputDialog(num1 + "*" + num2 + "= ?");
		System.out.println(result);
	}
}
