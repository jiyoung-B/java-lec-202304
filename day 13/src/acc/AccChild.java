package acc;
import acc.data.Parent;

public class AccChild extends Parent{

	public AccChild() {
		
		this.publicName= "이종석";//접근가능/상속받음(에러아님)
		this.defaultName="이종석";//접근불가능/상속안받음(에러)
		this.protectedName="이종석";//접근가능/상속받음(에러아님)
		this.privateName="이종석";//접근불가능/상속안받음(에러)
		

	}
}


//--상속에서의 접근제한자
//1.public은 모두 상속받음(제한없음)
//2.private은 모두 상속받지않음(제한없음)

//if(같은패키지==true{
//3. default/protected 상속가능
//}else { //--다른패키지일때
//3.default 상속 불가
//4.protected 상속 가능
//}