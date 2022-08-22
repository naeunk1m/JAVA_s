package javabook12;

import java.util.ArrayList;

public class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("������ ������ϴ�");
			return null;
		}
		
		return(arrayStack.remove(len-1));
	}
}

