package dahinh;

public class HinhChuNhat implements Hinh {
	private double canhDai;
	private double canhNgan;
	public HinhChuNhat(double cd, double cn) {
		this.canhDai = cd;
		this.canhNgan = cn;
	}
	
	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2*(this.canhDai + this.canhNgan);
	}
	
	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.canhDai*this.canhNgan;
	}
}
