package override;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		SanPham sp = new SanPham();
//		sp.nhap(scanner);
//		sp.xuat();
//		System.out
//				.println(sp);
		
		//---------------
		
//		SanPham sp1 = new SanPham ("masp1", "sp1", 123);
//		SanPham sp2 =new SanPham ("masp1", "sp2", 456);
//		if(sp1.equals(sp2)) {
//			System.out
//					.println("True");
//		} else {
//			System.out
//					.println("False");
//		}
//		System.out
//				.println(sp1.hashCode());
//		System.out
//				.println(sp2.hashCode());
		
		//---------------
		
		SanPham s1 = new Sach ("ma1","sp1", 123, 130);
		SanPham s2 = new Sach ("ma1","sp2", 153, 130);
		if(s1.equals(s2)) {
			System.out
					.println("True");
		} else {
			System.out
					.println("False");
		}
	}
}
