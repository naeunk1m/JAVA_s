package threadex;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class FlickeringLabelEx extends JFrame {
	// 스레드1.pdf => 페이지 3 참조
	
	FlickeringLabelEx(){
		setTitle("myLabel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(new flikeringLabel1("깜빡"));
		add(new JLabel("노깜빡"));
		add(new flikeringLabel1("여기도"));
		
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}

class flikeringLabel1 extends JLabel implements Runnable {
	// 부모가 이미 JLabel로 존재하기 때문에 부모는 1, 자식은 여러 명 가능.
	
	flikeringLabel1(String text){
		super(text);
		setOpaque(true);
		Thread t1 = new Thread(this);
		t1.start();
	}
	
	@Override
	public void run() {
		int n=0;
		Random rand = new Random();
		// 랜덤은 반드시 while문 위에 
		while(true){
			int r = rand.nextInt(256);
			int g = rand.nextInt(256);
			int b = rand.nextInt(256);
			
			if(n==0) {
			setBackground(new Color(r,g,b));
			n=1;
			}
			else {
			setBackground(new Color(r,g,b));
			n=0;
			}
			try {
				Thread.sleep(200);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}