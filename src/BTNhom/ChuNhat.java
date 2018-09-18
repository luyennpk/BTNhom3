package BTNhom;

public class ChuNhat {
	
	private int canh1;
	private int canh2;
	

	public ChuNhat(int canh1, int canh2) {
		// TODO Auto-generated constructor stub
		this.canh1 = canh1;
		this.canh2 = canh2;
	}
	
	public ChuNhat(int canh1) {
		// TODO Auto-generated constructor stub
		this.canh1 = canh1;
	}

	public int tinhChuvi (int canh1, int canh2) {
		return (canh1 + canh2)*2;
	}
	
	public int tinhDientich (int canh1, int canh2) {
		return (canh1 * canh2);
	}
}
