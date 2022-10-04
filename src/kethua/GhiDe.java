package kethua;

public class GhiDe {
	 public static void main(
			String[] args) {
		A1 a = new A1();
		a.show();
		B1 b = new B1();
		b.show();
		
		A2 a2 = new B2();
		a2.show();
	}
}

class A1 {
	private String getName() {
		return "A";
	}
	public void show() {
		System.out
				.println(this.getName());
	}
}

class B1 extends A1 {
	public String getName() {
		return "B";
	}
}

/*
 *  khi chạy b.show() nó sẽ tìm coi class B có không, vì không có và được kế thừa class A nên có chạy của A, mà trong A có cái this.getName(), nếu getName được overriding ở classB thì nó sẽ chạy của B, không thì nó sẽ chạy của A (trong đoạn code trên getName() của A là private nên ở B không overriding vì thế getName của A và getName của B là hoàn toàn khác nhau, vì thế chạy của A)
 */



class C {
	protected final void show() {
		System.out
				.println("C");
	}
}

class D extends C {
	// vì show ở trên C là final nên cố overriding nó chương trình sẽ báo lỗi, nêu để là private thì chương trình không lỗi vì đó là 2 phương thức khác nhau
	public void show () {
		System.out
				.println("B");
	}
}


//-----Ghi đè với phương thức tĩnh-----
class A2 {
	public static void show() {
		System.out
				.println("A2");
	}
}
class B2 extends A2 {
	public static void show() {
		System.out
				.println("B");
	}
}

// ==> những phương thức tĩnh vẫn được kế thừa ở lớp con nhưng không cho phép overriding, do đó 2 phương thức show() ở A2 và B2 là hoàn toàn khác nhau





