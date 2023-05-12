public class Control01 {

	public static void main(String[] args) throws InterruptedException {
		// 1. if
		int age = 20;
		age = 40;

		System.out.println("신청자 나이 : " +age);
		System.out.println("심사중.....");
		// 청년저축가입 나이 제한
		if(age < 40) {
			System.out.println("청년저축 가입 가능합니다.");
		}
		
		// 청년저축 가입 나이는 19세 이상, 39세 이하인 사람만 가입할 수 있다.
		// 19 <= age <= 39
		
		if(age >=19 && age <=39) {
			System.out.println("19세 이상, 39세 이하인 분이시군요");
			System.out.println("진행시켜");
		}
		
		if(age >39 || age <19) {
			System.out.println("당신은 가입대상이 아닙니다.");
		}
		
		
		// 2. if ~ else
		Thread.sleep(2000);
		System.out.println("if ~ else 문");
		if( age >= 19 && age <= 39) { // 조건식이 참이면 실행
			System.out.println("나이 : " + age);
			System.out.println("진행시켜.");
		}else { // 조건식이 거짓이면 실행
			System.out.println("집에가.");
		}
		System.out.println("프로그램 종료.");
	}
}
