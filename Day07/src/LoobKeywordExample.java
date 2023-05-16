
public class LoobKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break
		// 1부터 100까지의 합이 400을 넘으면 출력하지 않도록
		
		int sum = 0;
		/*
		 * for(int i = 1; i<=100; i ++) { sum += i; if(sum > 400) { break; } }
		 */

		
		int i = 0;
		sum = 0;
		while(i<=100) {
			sum += i;
			i ++; 
		}
		System.out.println(sum);

	}

}
