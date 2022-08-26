package threadex;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class FlickeringLabelEx extends JFrame {
	// ������1.pdf => ������ 3 ����
	
	FlickeringLabelEx(){
		setTitle("myLabel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(new flikeringLabel1("����"));
		add(new JLabel("�����"));
		add(new flikeringLabel1("���⵵"));
		
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}

class flikeringLabel1 extends JLabel implements Runnable {
	// �θ� �̹� JLabel�� �����ϱ� ������ �θ�� 1, �ڽ��� ���� �� ����.
	
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
		// ������ �ݵ�� while�� ���� 
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