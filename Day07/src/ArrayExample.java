
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] odd4 = new int[10];
		int idx =0;
		for(int x = 1; x <= 100; x++) {
			if(idx > 9) {
				break;
			}
			if( x % 2 == 0) {
				continue;
			}
			
			
			System.out.println
				("배열의 idx(호실) : " + idx + " 들어간 값 : " +x);
			odd4[idx++] = x;
		}
				

	}

}
