
public class GenExample {

	
	public static void main(String args[]) {
		StudentA<String, Integer> stdA
		=new StudentA<String, Integer>();
		
		stdA.set("name", 100);
		//stdA.set("name", "100");
		
		System.out.println(stdA.getKey());
		stdA.isObject(new String("a"));// object타입으로 쓰는거랑 같음
		//isObject(Object t1)
		stdA.<Integer>isObject(1);
		
		Genesis<? extends Gen2>genesis= new Genesis<Gen2>();
	
		Genesis<?super Gen2>genesis2= new Genesis<Gen1>();
		
	}
}
//class정의시 Generic사용

class StudentA<K,V> {
	
	K key;
	V value;
	
	void set(K key, V value) {
		this.key=key;
		this.value=value;
	}
	
	K getKey() {return this. key;}
	V getvalue() {return this.value;}
	
	//메서드에서도 사용가능
	public<T> boolean isObject(T t1) {
		System.out.println(t1.toString());
		return false;
	}
}


class Gen1{void sayMyName(){}}
class Gen2 extends Gen1{void sayMyName(){}}
class Gen3 extends Gen2{void sayMyName(){}}
class Genesis<T>{
	T obj;
	T getObj() {
		return this.obj;
	}
}