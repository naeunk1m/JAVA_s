package javabook11;

public class Circle implements Cloneable {
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.radius = radius;
		point = new Point(x,y);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������ "+point +"�̰�, " +"��������"+radius+"�Դϴ�.";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
