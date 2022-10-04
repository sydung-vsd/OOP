package package1;

public class TamGiac {
	public double tinhDienTichTG(double canh, double chieucao) {
		return 0.5*canh*chieucao;
	}
	public double tinhDienTichTG(double a, double b, double c) {
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
}
