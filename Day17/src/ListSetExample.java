import java.util.*;

public class ListSetExample {
	
	public static void main(String args[] ) {
		
		//1.list
		List list= new ArrayList();
		
		//b. 리스트에 값 넣기
		list.add(9);
		for(int i=8; i>0;i-- ) {
			list.add(i);
		}
		
		//c.리스트 값 확인
		System.out.println(list);
		
		list.add(3,100);//3번방에 100을 넣고 싶어요
		System.out.println(list);
		
		//d.리스트에서 값을 꺼내는 방법
		//d-1:for()문 사용
		//d-2:향상된 for문
		//d-3:iterator
		//d-4:stream api

		//d-1
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//d-2 foreach
		for(Object o:list) {
			System.out.println(o);
		}
		
		//d-3 iterator
		Iterator it= list.iterator();
		while(it.hasNext()) {//--값을 꺼내고 포인터 한칸 이동 
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println("");
		System.out.println(list);
		
		//z.리스트 비우기
		list.clear();
		System.out.println(list);
		
		
	}

}
