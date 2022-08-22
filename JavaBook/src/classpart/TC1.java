package classpart;

import java.util.Scanner;

public class TC1 {

	public static void main(String[] args) {
		TC calc = new TC();
		Scanner scan = new Scanner(System.in);
	
		System.out.print("숫자 입력: ");
		int su1 = scan.nextInt(); 
		int su2 = scan.nextInt();
		
		System.out.print("+ - / * : ");
		String str = scan.next();
		
		switch(str){
		case "+" : calc.add(su1, su2);break;
		case "-" : calc.sub(su1, su2);break;
		case "*" : calc.mul(su1, su2);break;
		case "/" : calc.div(su1, su2);break;
		default : System.out.println("오류입니다.");	
		}
		

	}

}
