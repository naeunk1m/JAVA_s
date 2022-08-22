package GUI;

import javax.swing.JFrame;

public class ListenerSample extends JFrame{

	ListenerSample(){
		setTitle("샘플테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenerSample();
	}

}
