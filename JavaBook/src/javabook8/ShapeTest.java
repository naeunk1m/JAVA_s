package javabook8;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[]args) {
		ArrayList<Shape>list = new ArrayList<Shape>();
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
	
//		�Ϲ� for�� ��� ��		
//		for(int i=0; i<list.size();i++) {
//			Shape s = list.get(i);
//			s.draw();
//		}
		
// 		���� for�� ��� ��		
		for(Shape s : list) {
			s.draw();
		}
}
}
