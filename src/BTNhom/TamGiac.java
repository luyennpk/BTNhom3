package BTNhom;



public class TamGiac {

	private float canh1;
	private float canh2;
	private float day;
	private float cao;
	
	
	public float getCanh1() {
		return canh1;
	}


	public void setCanh1(float canh1) {
		this.canh1 = canh1;
	}


	public float getCanh2() {
		return canh2;
	}


	public void setCanh2(float canh2) {
		this.canh2 = canh2;
	}


	public float getDay() {
		return day;
	}


	public void setDay(float day) {
		this.day = day;
	}


	public float getCao() {
		return cao;
	}


	public void setCao(float cao) {
		this.cao = cao;
	}

    public void disp() {
    	System.out.println("Tam giac co:");
    	System.out.println("Canh 1: "+getCanh1());
    	System.out.println("Canh 2: "+getCanh2());
    	System.out.println("Canh day: "+getDay());
    	System.out.println("Chieu cao: "+getCao());
    	
    }
    
    
	public TamGiac(float canh1, float canh2, float day, float cao) {
		// TODO Auto-generated constructor stub
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.day = day;
		this.cao = cao;
		disp();
	}
	
	public void tinhChuvi() {
		System.out.println("Chu vi tam giac la: " + (getCanh1() + getCanh2() + getDay()));
		System.out.println("\n");
	}
	public void tinhDienTich() {
		System.out.println("Dien tich tam giac la: " + (getDay() * getCao())/2);
	}
	
	public void ChuViTamGiac (float a, float b, float c) {
		System.out.println("Chu vi tam giac co: canh 1 " + a + " , canh 2 "+ b + " , canh 3 "+ c + " la: " + (a+b+c));		
	}
	
	public void DienTichTamGiac (float a, float b) {
		System.out.println("Dien tich tam giac co: canh day " + a + " va chieu cao " + b + " la: " + (a*b)/2);
	}
	
	public static void main(String[] args) {
		
		TamGiac obj1 = new TamGiac(5, 10, 15, 12);
		obj1.tinhChuvi();
		obj1.tinhDienTich();
		System.out.println("==========");
		System.out.println("Tinh Chu vi va Dien tich bang cahc truyen tham so");
		obj1.ChuViTamGiac(5, 10, 15);
		obj1.DienTichTamGiac(5, 10);
		
		
		

	}	

}
