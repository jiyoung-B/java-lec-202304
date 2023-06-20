package ext;

public class ThrowsTest {
	
	int divide(int x, int y)throws Exception {
		int result = x/y;
		return result;
	}
	
	void showDivide(int x , int y) {
		int result = 0;
		try {
		 result = this.divide(x,y);
		}catch(Exception ex) {
			System.out.println("예외발생");
			System.out.println(ex.getMessage());
		}
		 System.out.println(x + "/" + y + " = " + result);
	}

	//예외를 던지는 방식 (니가해라)
	public static void main(String[] args) {
		
		ThrowsTest test = new ThrowsTest();
		test.showDivide(10, 2);
		test.showDivide(10, 2);
		
		Calculator cal = new SamsungCalculator();
		cal.divided(10, 2);
	
		
		
	}

}
