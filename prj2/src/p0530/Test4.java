package p0530;

public class Test4 {

	public static void main(String[] args) {
		String season = "Spring";
		
		switch(season) {
		case "Spring" : System.out.println("따뜻하당.");
			break;
		case "Summer" : System.out.println("덥당...");
			break;
		case "Fall" : System.out.println("할 말이 없당.");
			break;
		case "Winter" : System.out.println("춥당...");
			break;
		
		default : System.out.println("잘못 입력하셨습니다.");
		}

	}

}
