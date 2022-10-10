package dahinh;

public interface Hinh {
	// các phương thức trừu tượng
	double tinhDienTich();
	double tinhChuVi();
	// các phương thức mặc định (nếu không khia báo defaut thì phương thức là trừu tượng và không thể viết phần thân được) 
	default void hienThi () {
		String s = "Chi vi: %.2f\nDien tich: %.2f\n";
		s = String.format(s, this.tinhChuVi(), this.tinhDienTich());
		System.out
				.println(s);
	}
}
