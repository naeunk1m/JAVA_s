package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerMouseEx extends JFrame {
	
	ListenerMouseEx(){
		setTitle("test1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("마우스 이벤트 테스트 버튼");
		btn1.setBackground(Color.cyan);
		btn1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setBackground(Color.BLUE);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBackground(Color.cyan );
			}
			
		});
		add(btn1);
		
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListenerMouseEx();
	}

}


