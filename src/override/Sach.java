package override;

public class Sach extends SanPham {
	private int soTrang;
	
	public Sach (String maSp, String tenSp, double gia, int soTrang) {
		super( maSp, tenSp, gia );
		this.soTrang = soTrang;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean s1 = super.equals(obj);
		Sach sach = (Sach) obj;
		boolean s2 = this.soTrang == sach.soTrang;
		
		return s1 && s2;
	} 

	/**
	 * @return số trang
	 */
	private int getSoTrang() {
		return soTrang;
	}

	private void setSoTrang(
			int soTrang) {
		this.soTrang = soTrang;
	}
	
}
