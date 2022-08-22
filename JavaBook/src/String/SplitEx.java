package String;

public class SplitEx {
	public static void main(String[] args) {
		String str = "홍길동a김길동b고길동c이길동";
		String[] names = str.split("[a-z]"); // 단어를 쪼갤 때 뭘로 쪼개냐
		// string 배열로 리턴
		for(String name : names)System.out.println("이름 : "+ name);
	}
}
