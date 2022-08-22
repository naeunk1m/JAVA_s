package javabook8;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[]args) {
		ArrayList<Shape>list = new ArrayList<Shape>();
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
	
//		일반 for문 사용 시		
//		for(int i=0; i<list.size();i++) {
//			Shape s = list.get(i);
//			s.draw();
//		}
		
// 		향상된 for문 사용 시		
		for(Shape s : list) {
			s.draw();
		}
}
}
