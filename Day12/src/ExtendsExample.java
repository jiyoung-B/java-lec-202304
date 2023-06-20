
public class ExtendsExample {

	public static void main(String[] args) {
		Parents parents = new Parents();
		parents.밥먹다(); // 에러 안남. 왜? Human클리스에 이미 정의되어 있음. 상속.
		Child child = new Child();
		child.밥먹다();
		
		Human human = new Parents();
		human.밥먹다();
		//human.담배피다(); 안돼. 왜? parants에는 있지만 human은 없어. 못 찾아감.
		// 이럴 때 쓰는게 데이터의 typecasting 형변환을 해줘야한다.
		((Parents)human).담배를피다(); // 더 큰 개넘으로 묶을 수 있어
		Object object = new Child();
		//object.밥먹다(); 에러 child에는 있지만 human에는 없음
		((Child)object).밥먹다(); // 타입캐스팅을 해준다.

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
	void 담배를피다() {
		System.out.println("에헴");
	}
	
}

class Child extends Parents{
	
}