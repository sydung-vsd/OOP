package dahinh;

public class HinhVuong implements Hinh {
	private double canh;
	public HinhVuong (double c) {
		this.canh = c;
	}
	
	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 4*this.canh;
	}
	
	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.pow(this.canh, 2);
	}
}
