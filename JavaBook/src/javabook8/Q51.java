package javabook8;

public class Q51 {
	class Shape {
		public void draw( ) {
			System.out.println("Shape");
		}
	}
	class Circle extends Shape {
		public void draw( ) {
			System.out.println("Circle");
		}
	}
	class Triangle extends Shape {
		public void draw( ) {
			System.out.println("Triangle");
		}
	}

}
