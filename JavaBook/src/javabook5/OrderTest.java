package javabook5;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.setOrderid(2018031200);
		//201803120001
		order.setCustomerid("abc123");
		order.setOrderdate("2018�� 3�� 12��");
		order.setCustomername("ȫ���");
		order.setProductnumber("PD0345-12");
		order.setAddress("����� �������� ���ǵ��� 20����");
		
		System.out.println("�ֹ���ȣ: "+order.getOrderid());
		System.out.println("�ֹ��� ���̵�: "+order.getCustomerid());
		System.out.println("�ֹ�����: "+order.getOrderdate());
		System.out.println("�ֹ���: "+order.getCustomername());
		System.out.println("��ǰ ��ȣ: "+order.getProductnumber());
		System.out.println("��� �ּ�: "+order.getAddress());
		
		
	}

}
