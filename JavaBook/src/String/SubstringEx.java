package String;

public class SubstringEx {
	public static void main(String[] args) {
		String str ="{abc[def:ghi]jkl}";
		String subStr = str.substring(str.indexOf('[')+1,str.indexOf(']'));
		
		System.out.println(subStr);

	}

}
