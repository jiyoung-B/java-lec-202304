
public class ThisClass {
	
	void sayMyName() {
		System.out.println("나는 ThisClass야");
	}
	public static void main(String args[]) {
		//this.sayMyName();
		//sayMyName(); => 메모리영역이 다르기 때문에 불러올 수 없고
	    ThisClass tc = new ThisClass();
	    tc.sayMyName();
	    
		AClass a = new AClass("이종석", 44);
		a.introduceMySelf();
		AClass b = new AClass("박은진", 40);
		b.introduceMySelf();
		
		
	}

}

class AClass{
	
	String name;
	int age;
	
	public AClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	void introduceMySelf() {
		
		String name = "김진수";
		
		String message = String.format("제 이름은 %s고 제 나이는 %d입니다.", this.name, this.age);
		
		System.out.println(message);
	}
	
	void test() {
		introduceMySelf();
		this.introduceMySelf();
	}
}

