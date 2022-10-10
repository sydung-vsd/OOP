package override;

import java.util.Objects;
import java.util.Scanner;

public class SanPham {
	private String maSp;
	private String tenSp;
	private double giaSp;
	
	public SanPham() {
		
	}
	
	public SanPham(String maSp, String tenSp, double gia ) {
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.giaSp = gia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sản phẩm " + this.tenSp + " có giá " + this.giaSp;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		SanPham sp = (SanPham) obj;
		return this.maSp.toLowerCase().equals(sp.maSp);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash = 5;
		hash = 97 * hash + Objects.hashCode(this.maSp);
		return hash;
	}
	
	
	public void nhap(Scanner scanner) {
		System.out
				.println("Nhập mã Sp: ");
		this.maSp = scanner.nextLine();
		System.out
				.println("Nhập tên Sp: ");
		this.tenSp = scanner.nextLine();
		System.out
				.println("Nhập giá Sp: ");
		this.giaSp = scanner.nextDouble();
	}
	
	public void xuat() {
		System.out
				.println("Tên Sản Phẩm: " + this.tenSp);
		System.out
				.println("Mã Sản Phẩm: " + this.maSp);
		System.out
				.println("Giá Sản Phẩm: " + this.giaSp);
	}
	
	/**
	 * @return the maSp
	 */
	private String getMaSp() {
		return maSp;
	}
	/*
	 * set maSp
	 */
	private void setMaSp(String maSp) {
		this.maSp = maSp;
	}
	/**
	 * @return the ten Sp
	 */
	private String getTenSp() {
		return tenSp;
	}
	/*
	 * set ten Sp
	 */
	private void setTenSp(
			String tenSp) {
		this.tenSp = tenSp;
	}
	/*
	 * @return the gia Sp
	 */
	private double getGiaSp() {
		return giaSp;
	}
	/*
	 * set gia Sp
	 */
	private void setGiaSp(double giaSp) {
		this.giaSp = giaSp;
	}
	
}
