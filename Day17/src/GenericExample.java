import java.util.*;

public class GenericExample {

	public static void main(String args[]) {
		
		//List list = new ArrayList
		List<Integer>list= new ArrayList<Integer>();
		//integer객체만 받는 LIST로 선언합니다.
		//list.add("1");//String Error
	    //list.add("a");//String Error
		list.add(1);
		list.add(20);
		
	    for(Object o: list) {
		System.out.println(o);
			    }
	    Map<String,Integer>pointMap= new HashMap<String, Integer>();
	    pointMap.put("name",1);
	    
	    List<Map<String, Integer>>dataList
	    = new ArrayList<Map<String,Integer>>();
		}
}
