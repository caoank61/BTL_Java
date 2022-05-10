//Dang ky mon thi Olympic
package quanly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quanly.Hoc_Sinh;
import quanly.Mon_Olympic;
import static quanly.Hoc_Sinhs.hs;

public class DangKy {
    private String MonThi, NgayThi;
    public String getMonThi() {
		return MonThi;
	}
	public void setMonThi(String monthi) {
		MonThi = monthi;
	}
        public String getNgayThi() {
		return NgayThi;
	}
	public void setNgayThi(String ngaythi) {
		MonThi = ngaythi;
	}
    public void insert(){   //insert du lieu ngay thi va mon thi vao sql
        String url="jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
        Connection cn;
        DangKy a = new DangKy();
   try{
        cn=DriverManager.getConnection(url);
        System.out.print("connect success\n");
        String sql="INSERT INTO DANGKY_MON VALUES"
                +"(?,?)";
        PreparedStatement st=cn.prepareStatement (sql);
        st.setString(1, a.getMonThi());
        st.setString(2, a.getNgayThi());
            int rows = st.executeUpdate();
            if(rows>0){
                 System.out.print("row has been inserted\n");
            } 
            cn.close();
    } catch (SQLException e){
        System.out.print("oh no.");
        e.printStackTrace();
    }
}
    public void connect () {    //Lay du lieu cua HocSinh khi nhan nut check o frame DangKy
		String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
                try {
			Connection cn = DriverManager.getConnection(url);
                        String sql = "select * from HOCSINH,MON_OLYMPIC where MSHS in (select DANGKY_MON.MSHS from DANGKY_MON,HOCSINH,MON_OLYMPIC where DANGKY_MON.MSHS = HOCSINH.MSHS and DANGKY_MON.TENMON= MON_OLYMPIC.TENMON)";
			Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Hoc_Sinh a = new Hoc_Sinh();
                                Mon_Olympic b = new Mon_Olympic();
				a.setMSHS(result.getString("MSHS"));
				a.setHoTen(result.getString("HoTen"));
				a.setLop(result.getString("Lop"));
				a.setDia_Chi(result.getString("Dia_Chi"));
				a.setNgay(result.getInt("Ngay"));
				a.setThang(result.getInt("Thang"));
				a.setNam(result.getInt("Nam"));
				a.setDiem_Toan(result.getFloat("Diem_Toan"));
				a.setDiem_Ly(result.getFloat("Diem_Ly"));
				a.setDiem_Hoa(result.getFloat("Diem_Hoa"));
				a.setDiem_Van(result.getFloat("Diem_Van"));
				a.setDiem_Su(result.getFloat("Diem_Su"));
				a.setDiem_Dia(result.getFloat("Diem_Dia"));
				hs.add(a);
			}
			cn.close();
			
		} catch (SQLException e) {
            e.printStackTrace();
	}
    }
    public static String checkMon(String TENMON, String MSHS){ // check mon dangky da ton tai chua 
        String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
        String a = "";
        try {
			Connection cn = DriverManager.getConnection(url);
                        String sql = "select DANGKY_MON.TENMON from DANGKY_MON WHERE MSHS='"+MSHS+"' AND TENMON='"+TENMON+"'";
			Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
                        while (result.next()) {
                        a= result.getString("TENMON");
                        }
			cn.close();
		} catch (SQLException e) {
            e.printStackTrace();    
        }
        return a;
    }
}

