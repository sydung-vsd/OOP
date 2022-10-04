package kethua;

public class KeThua1 {
	public KeThua1() {
		System.out
				.println("KeThua1");
	}
}

class KeThua2 extends KeThua1{
	public KeThua2() {
		System.out
				.println("KeThua2");
	}
}

class KeThua3 extends KeThua2 {
	public KeThua3() {
		System.out
				.println("KeThua3");
	}
	
}

//------------------

class A {
	public A(String s) {
		System.out
				.println(s);
	}
}

class B extends A {
	public B (String name) {
		super(name);
		name = "Hello" + name;
		System.out
				.println(name);
	} 
}

//---------------
//---------------overriding
class GhiDe1 {
	public void hienThi () {
		System.out
				.println("A");
	}
}
class GhiDe2 extends GhiDe1 {
	public void hienThi () {
		System.out
				.println("B");
	}
}








