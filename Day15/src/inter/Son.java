package inter;

public class Son implements Father01, Father02 {
	
	@Override
	public void sayMyName() {
		System.out.println("이름 이름");
	}
	
	@Override
	public void eat() {
		System.out.println("son이 먹는다.");
	}

	public static void main(String[] args) {
		Son son = new Son();
		son.eat();
		son.father01Eat();
	}
	
	public void father01Eat() {
		//--인터페이스01의 default메소드인 eat()을 호출하겠다.
		Father01.super.eat();
	}
	
	
}
