package javabook12;

import java.util.ArrayList;

public class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("ť�� ������ϴ�");
			return null;
		}
		
		return(arrayQueue.remove(0));
	}
}
