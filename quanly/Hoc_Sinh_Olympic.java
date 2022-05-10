
package quanly;

public class Hoc_Sinh_Olympic {
    public String HoTen;
    private String Lop;
    private String MSHS;
    private String Dia_Chi;
    private int Ngay;
    private int Thang;
    private int Nam;
    private String TENMON;
    private String NGAYTHI;  
    public Hoc_Sinh_Olympic () {
		super ();
		HoTen = "";
		Lop = "";
		MSHS = "";
		Dia_Chi = "";
		Ngay = 1;
		Thang = 1;
		Nam = 2006;
                TENMON="";
                NGAYTHI="";
    }
    public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	public String getMSHS() {
		return MSHS;
	}
	public void setMSHS(String mSHS) {
		MSHS = mSHS;
	}
	public String getDia_Chi() {
		return Dia_Chi;
	}
	public void setDia_Chi(String dia_Chi) {
		Dia_Chi = dia_Chi;
	}
	public int getNgay() {
		return Ngay;
	}
	public void setNgay(int ngay) {
		Ngay = ngay;
	}
	public int getThang() {
		return Thang;
	}
	public void setThang(int thang) {
		Thang = thang;
	}
	public int getNam() {
		return Nam;
	}
	public void setNam(int nam) {
		Nam = nam;
	}
        public String getTENMON() {
		return TENMON;
	}
	public void setTENMON(String tenmon) {
		TENMON = tenmon;
	}
	public String getNGAYTHI() {
		return NGAYTHI;
	}
	public void setNGAYTHI(String ngaythi) {
		NGAYTHI = ngaythi;
	}
}


