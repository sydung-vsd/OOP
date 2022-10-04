package package1;

public class PhanSo {
	private static int demPhanSo = 0;
	private int tuSo;
	private int mauSo;
	// initialization block
	{
		demPhanSo = getDemPhanSo() + 1;
	}
	
	/*
	 * phương thức cộng 2 phân số, cái thằng nào gọi phương thức thì thằng đó là this
	 */
	public PhanSo congPhanSo (PhanSo p) {
		int t = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
		int m = this.mauSo * p.mauSo;
		return new PhanSo(t,m);
	}	
	
	public PhanSo rutGonPhanSo () {
		int ucln = PhanSo.timUcln(this.tuSo, this.mauSo);
		int t = this.tuSo/ucln;
		int m = this.mauSo/ucln;
		return new PhanSo(t,m);		
	}
	
	public static int timUcln (int a, int b) {
		while (a != b) {
			if(a > b) 
				a-=b;
			 else 
				b-=a; 
			
		}
		return a;
	}
	/**
	 * phương thức khởi tạo không tham sô với tuso = 0, mauso=1
	 */
	public PhanSo () {
		mauSo = 1;
		tuSo = 0;
	}
	/**
	 * phương thức khởi tạo phân số với mauso = 1
	 */
	public PhanSo (int t) {
		mauSo = 1;
		tuSo = t;
	}
	/**
	 * phương thức khởi tạo phân số hai tham số
	 * @param t: tuSo
	 * @param m: mauSo
	 */
	public PhanSo (int t, int m) {
		this.tuSo = t;
		this.mauSo = m;
	}
	
	public int getTuSo() {
		return tuSo;
	}
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	public int getMauSo() {
		return this.mauSo;
	}
	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	public void hienThi() {
		System.out
				.printf("%d/%d",tuSo,mauSo);
		System.out
				.println();
	}

	public static int getDemPhanSo() {
		return demPhanSo;
	}
}
