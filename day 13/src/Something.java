
public class Something {

	public class Child extends Parents {
		
	//기본생성자 정의
		public Child() {
			//자식에서, 부모의 객체를 생성하는 코드를 넣으시면 됩니다.
			//new Parents("하악하악");
			super("이종석"); //<--내 부모의 객체 먼저 생성.
			//this <--자기자신
			System.out.println("Child 객체생성");
		}
		
		void 밥먹다() {
			System.out.println("자식이 밥을 먹다");
		}
		
		//--Parent 객체의 밥먹다(); 메소드를 호출해야 합니다.
		void 부모님밥먹다() {
			super.밥먹다();
		}
	}
}
