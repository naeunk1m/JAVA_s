package String;

public class SplitEx {
	public static void main(String[] args) {
		String str = "ȫ�浿a��浿b��浿c�̱浿";
		String[] names = str.split("[a-z]"); // �ܾ �ɰ� �� ���� �ɰ���
		// string �迭�� ����
		for(String name : names)System.out.println("�̸� : "+ name);
	}
}
