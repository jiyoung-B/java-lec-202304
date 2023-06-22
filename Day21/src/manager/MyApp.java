package manager;

import manager.repository.Repository;
import manager.repository.impl.*;

public class MyApp {

	public static void main(String[] args) throws Exception  {
		// 만약에 DBRepository를 사용하고 싶다
		Repository rep = new DBRepository(); // 왜  new 로 넣어줘야한다고 ?
		
		
		// 만약에 CollectionRepository를 사용하고 싶다.
		Repository repCollection = new CollectionRepository();
		
		System.out.println(rep.rowCount());
		System.out.println(repCollection.rowCount());

	}

}
