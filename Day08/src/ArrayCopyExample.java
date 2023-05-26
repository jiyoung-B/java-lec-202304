
public class ArrayCopyExample {

	public static void main(String[] args) {
		
		// -- 배열 복사가 없을때.
		int a[] = {1, 2};
		int b[] = a;
		b[1]= 100;
		System.out.println("a[1] = " + a[1]);
		
		// -- 1. for문을 활용한 복사
		int a1[] = {1,2,3};
		int b1[] = new int[a1.length];
		
		for(int x = 0; x< a1.length; x ++) {
			b1[x] = a1[x];
		}
		
		// --2. System.arraycopy();
		int a2[] = {1, 2, 3};
		int b2[] = new int[3];
		System.arraycopy(a2, 0, b2, 0, a2.length);
		System.out.println("arrayCopy로 복사");
		for(int x = 0; x < b2.length; x ++) {
			System.out.println(b2[x]);
		}

	}

}
