package package1;

public class ThamChieuThis {
	private int x;
	public ThamChieuThis (int y) {
		x = getX() + y;
	}
	public ThamChieuThis () {
		this(2);
	}
	public int getX() {
		return x;
	}
}
