package inter;

public interface Father01 extends GrandFather {
	
	default void eat() {
		System.out.println("father01 밥먹는다.");
	}

}
