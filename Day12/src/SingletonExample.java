
public class SingletonExample {
	
	void get출근시간() {
		관리자 a = 관리자.getInstance();// new 관리자();
		a.출근시간알림();
		
		System.out.println(System.identityHashCode(a));
	}
	
	void get퇴근시간() {
		관리자 b = 관리자.getInstance();// new 관리자();
		 b = 관리자.getInstance();// 
		 b = 관리자.getInstance();// 
		 b = 관리자.getInstance();// 
		 b = 관리자.getInstance();// 
		 b = 관리자.getInstance();// 
		 b = 관리자.getInstance();// 
		 b = 관리자.getInstance();// 
		 b = 관리자.getInstance();// 여러번 호출하더라도 해쉬값은 변함이 없다!
		b.퇴근시간알림();
		System.out.println(System.identityHashCode(b));
		
	}
	
	public static void main(String args[]) {
		
		SingletonExample ex = new SingletonExample();
		ex.get출근시간();
		ex.get퇴근시간();
		
	}
	

}

class 관리자{
	String name = "관리자";
	
	private static 관리자 obj;
	
	public static 관리자 getInstance() {
		if(obj == null) {
			obj = new 관리자(); // 부를때마다 똑같이 생성하므로 다른 객체임 그래서 if로 준다~ 있으면 obj 그대로 반환
		}
		
		return obj;
	}
	void 출근시간알림() {
		System.out.println("출근시간은 9시야.");
	}
	
	void 퇴근시간알림() {
		System.out.println("퇴근시간은 오후 6시야.");
	}
}