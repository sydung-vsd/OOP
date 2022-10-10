package dahinh;

public class HinhTron implements Hinh {
	private double banKinh;
	public HinhTron (double bk) {
		this.banKinh = bk;
	}
	
	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		double PI = Math.PI;
		double chuvi;
		chuvi = PI*2*this.banKinh;
		return chuvi;
	}
	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		double PI = Math.PI;
		double dienTich;
		dienTich = Math.pow(this.banKinh, 2)*PI;
		return dienTich;
	}
}
