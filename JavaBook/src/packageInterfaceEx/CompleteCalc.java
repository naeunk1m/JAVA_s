package packageInterfaceEx;

public class CompleteCalc extends Calculator{
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}
	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2 != 0)
			return num1/num2;
		else
			return Calc.ERROR;
	}
	@Override
	public int square(int num) {
		// TODO Auto-generated method stub
		return num*num;
	}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

}
