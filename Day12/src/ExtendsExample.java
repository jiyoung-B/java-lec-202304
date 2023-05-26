
public class ExtendsExample {

	public static void main(String[] args) {
		Parents parents = new Parents();
		parents.밥먹다(); // 에러 안남. 왜? Human클리스에 이미 정의되어 있음. 상속.
		Child child = new Child();
		child.밥먹다();

	}

}

class Human{
	int 입개수 = 1;
	int 눈개수 = 2;
	
	void 밥먹다() {
		System.out.println("Human 밥먹다.");
	}
	
}

class Parents extends Human{
	
	
	
}

class Child extends Parents{
	
}