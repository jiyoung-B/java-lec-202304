package ext;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputProgram {

	// try ~ catch 구문없이 throw new를 통한 exception발생 시
	void haakhaak() throws NotValidNumberException {
		throw new NotValidNumberException("하악하악"); //예외를 이미 발생시킨다.
		
		// throw를 통해서 Exception을 실제로 발생시키는 코드가 있는경우는
		// 이미 발생이 되었기 때문에 try - catch를 통한 예외 처리를 하거나
		// throws를 통한 위임(남한테 미루기)를 하거나 
		// 둘 중 하나는 반드시 해야함
	}

	// --사용자의 입력을 받는다.
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // 사용자의 입력을 받는 부분

		String name = "";
		int age = 0;

		System.out.print("이름을 입력해주세요 : ");
		name = input.next();
		// --예외가 발생할 수 있는 곳
		try {
			System.out.print("나이를 입력해주세요 : ");
			age = input.nextInt(); // 여기서 exception을 던지면
			if (age > 100) {
				throw new NotValidNumberException("숫자는 100 이하여야합니다.");
			}
		} catch (NullPointerException e2) {
			System.out.println("NullPointerException");
		} catch (InputMismatchException e3) {
			System.out.println("InputMismatchException");
		} catch (Exception ex) {
			System.out.println("Exception 다잡아");
			System.out.println("예외 메세지 : " + ex.getMessage());
		} finally { // try catch 구문이 실행시 무조건 한번 실행 심지어 Exception이 발생하지않더라도 무조건 한번 실행
			System.out.println("파이널리 구문 실행");
		}

		System.out.println("저는 " + name + "이고, 나이는 " + age + "입니다.");

	}

}
