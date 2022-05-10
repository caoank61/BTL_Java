package quanly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Comparator;
import java.util.Vector;
import static quanly.Mon_Olympic.NGAYTHI;
import static quanly.Mon_Olympic.TENMON;

public class Hoc_Sinh_Olympics {
    public static Vector<Hoc_Sinh_Olympic> hsos;
    public Hoc_Sinh_Olympics () {
		super();
		hsos = new Vector<Hoc_Sinh_Olympic>();
	}
    public static Hoc_Sinh_Olympics printOlympic (String id) {
		String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
		Hoc_Sinh_Olympics a = new Hoc_Sinh_Olympics();
		try {
			Connection cn = DriverManager.getConnection(url);
                        String sql = "select HOCSINH.MSHS,HOCSINH.HoTen,HOCSINH.Lop,HOCSINH.Dia_Chi,HOCSINH.Ngay,HOCSINH.Thang,HOCSINH.Nam,MON_OLYMPIC.TENMON,MON_OLYMPIC.NGAYTHI from HOCSINH,DANGKY_MON,MON_OLYMPIC WHERE HOCSINH.MSHS = DANGKY_MON.MSHS AND MON_OLYMPIC.TENMON = DANGKY_MON.TENMON AND HOCSINH.MSHS LIKE '"+id+"'";
			Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
                        while (result.next()) {
                        Hoc_Sinh_Olympic hso = new Hoc_Sinh_Olympic();
			hso.setMSHS(result.getString("MSHS"));
                        hso.setHoTen(result.getString("HoTen"));
			hso.setLop(result.getString("Lop"));
			hso.setDia_Chi(result.getString("Dia_Chi"));
			hso.setNgay(result.getInt("Ngay"));
			hso.setThang(result.getInt("Thang"));
			hso.setNam(result.getInt("Nam"));
                        hso.setTENMON(result.getString("TENMON"));
                        hso.setNGAYTHI(result.getString("NGAYTHI"));
                        a.add(hso);
                        }
//			cn.close();	
                        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                return a;
            }
    public static Vector<String>printID(){// vector chua mshs nhung hoc sinh khong dang ky mon olympic
    String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
    Vector <String>ID = new Vector<String>();
        
		try {
			Connection cn = DriverManager.getConnection(url);
                        String sql = "SELECT HOCSINH.MSHS FROM HOCSINH EXCEPT SELECT DANGKY_MON.MSHS FROM DANGKY_MON" ;
                        Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
                        while (result.next()) {
                        String a = result.getString("MSHS");
                        ID.add(a);
                        }
// 			cn.close();
                        } catch (SQLException e) {

			e.printStackTrace();
		}
                return ID;
    }
    public static Hoc_Sinh_Olympics printresult1(Vector <String> a){
        String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";	
        Hoc_Sinh_Olympics hsos = new Hoc_Sinh_Olympics();
                    try {
			Connection cn = DriverManager.getConnection(url);
                        for(int i=0; i<a.size(); i++){
                        String sql = "SELECT MSHS, HOTEN, LOP, DIA_CHI,NGAY,THANG, NAM FROM HOCSINH WHERE MSHS LIKE '"+a.elementAt(i)+"'";
			Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
                        while (result.next()) {
                        Hoc_Sinh_Olympic hso = new Hoc_Sinh_Olympic();
			hso.setMSHS(result.getString("MSHS"));
                        hso.setHoTen(result.getString("HoTen"));
			hso.setLop(result.getString("Lop"));
			hso.setDia_Chi(result.getString("Dia_Chi"));
			hso.setNgay(result.getInt("Ngay"));
			hso.setThang(result.getInt("Thang"));
			hso.setNam(result.getInt("Nam"));
                        hso.setTENMON("");
                        hso.setNGAYTHI("");
                        hsos.add(hso);
                        }
//			cn.close();	
                        }
                        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                return hsos;
    }
    public static Hoc_Sinh_Olympic printresult2(String id){//in ra nhung hoc sinh k dang ky mon olympic
        String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";	
        Hoc_Sinh_Olympic hso = new Hoc_Sinh_Olympic();
                    try {
			Connection cn = DriverManager.getConnection(url);
                        String sql = "SELECT MSHS, HOTEN, LOP, DIA_CHI,NGAY,THANG, NAM FROM HOCSINH WHERE MSHS = '"+id+"'";
			Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
                        while (result.next()) {
			hso.setMSHS(result.getString("MSHS"));
                        hso.setHoTen(result.getString("HoTen"));
			hso.setLop(result.getString("Lop"));
			hso.setDia_Chi(result.getString("Dia_Chi"));
			hso.setNgay(result.getInt("Ngay"));
			hso.setThang(result.getInt("Thang"));
			hso.setNam(result.getInt("Nam"));
                        hso.setTENMON("");
                        hso.setNGAYTHI("");
                        hsos.add(hso);
                        }
//			cn.close();	
 
                        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                return hso;
    }
        public int size() {
		return hsos.size();
	}
	public Hoc_Sinh_Olympic elementAt(int i) {
		return hsos.elementAt(i);
	}
        public void add(Hoc_Sinh_Olympic hso){
            hsos.add(hso);
        }
}
