package javabook7;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog [5];
		String [] dogNames = {"港港1","港港2","港港3","港港4","港港5"};
		String[] types = {"柳稻俺","摹客客","倾胶虐","器皋扼聪救","厚减"};
//		dogs[0] = new Dog("港港1","柳稻俺");
//		dogs[1] = new Dog("港港2","摹客客");
//		dogs[2] = new Dog("港港3","倾胶虐");
//		dogs[3] = new Dog("港港4","器皋扼聪救");
//		dogs[4] = new Dog("港港5","厚减");
		
		
		for(int i = 0; i<dogs.length;i++) {
			dogs[i] = new Dog(dogNames[i],types[i]);
		}

		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}



		