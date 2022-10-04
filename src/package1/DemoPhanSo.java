package package1;

public class DemoPhanSo {
	public static void main(String[] args) {
		PhanSo  p1 = new PhanSo(2, 3);
//		p1.hienThi();
		PhanSo p2 = new PhanSo(4,7);
		p1.congPhanSo(p2).hienThi();
		
		PhanSo p3 = new PhanSo(4,12);
		p3.rutGonPhanSo().hienThi();
		System.out
				.println(PhanSo.getDemPhanSo());
	}
}
