package javabook3;

public class Test1 {

	public static void main(String[] args) {
		int myAge=23;
		int teacherAge=38;
		
		boolean value = (myAge>25);
		System.out.println(value);
		
		System.out.println(myAge <=25);
		System.out.println(myAge=teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T':'F';
		System.out.println(ch);
		
		
		int num;
		num=-5+3*10/2;
		System.out.println(num);
		
		int num1 =10;
		System.out.println(num1);
		System.out.println(num1++);
		System.out.println(num1);
		System.out.println(--num1);
		
		int num2 =10;
		int num3 = 20;
		boolean result;
		
		result = ((num2>10)&&(num3>10));
		System.out.println(result);
		result = ((num2>10)||(num3>10));
		System.out.println(result);
		System.out.println(!result);
		
		
		int number1 =2;
		int number2 =10;
		
		System.out.println(number1&number2);
		System.out.println(number1|number2);
		System.out.println(number1^number2);
		System.out.println(~number1);
	
		
		int number=8;
		
		System.out.println(number+=10);
		System.out.println(number-=10);
		System.out.println(number>>=2);
		
		
		int n=10;
		int n2 =20;
		
		int result2 = (n>=10) ?n2+10:n2-10;
		System.out.println(result2);
		
		

	}

}
