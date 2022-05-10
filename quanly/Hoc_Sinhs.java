package quanly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import java.sql.PreparedStatement;
import quanly.Hoc_Sinh;
public class Hoc_Sinhs implements Comparator<Hoc_Sinh>{
	public static Vector<Hoc_Sinh>hs ;
	public Hoc_Sinhs () {
		super();
		hs = new Vector<Hoc_Sinh>();
	}
	public void Nhap_Nhieu_Hs() {
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhap So Luong Hoc Sinh:");
		n = sc.nextInt();
		
		for (int i = 0; i < n ;i++) {
			Hoc_Sinh sd;
				do {
					sd = new Hoc_Sinh ();
					sd.Nhap_Thong_Tin_Hoc_Sinh();
					if (checkID(sd.getMSHS())) {
						System.out.println();
						System.out.println("Ma So Hoc Sinh Da Ton Tai !");
						System.out.println("Vui Long Nhap Lai Thong Tin!");
					}
				}while(checkID(sd.getMSHS()));
				hs.add(sd);
		}
	}
	public void Xuat_Nhieu_Hs () {
		for (Hoc_Sinh i:hs) {
			i.Xuat_Thong_Tin_Hoc_Sinh();
		}
	}
	@Override
	public int compare(Hoc_Sinh o1, Hoc_Sinh o2) {
		int comp = o1.getHoTen().compareTo(o2.getHoTen());
        if (comp != 0) {    // names are different
            return comp;
        }else {
        	if ( o1.Tinh_Tuoi() > o2.Tinh_Tuoi())
        		return 1;
        	else return -1;
        }
	}
	public void sortName_HS() {
		String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
		
		try {
			Connection cn = DriverManager.getConnection(url);
			String sql = "select * from HOCSINH order by HoTen asc";
			Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Hoc_Sinh a = new Hoc_Sinh();
//                                Mon_Olympic b = new Mon_Olympic();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
            
	public void sortDiem_TB() {
		Hoc_Sinh t = new Hoc_Sinh();
		for(int i = 0 ;i < hs.size()-1;i++){
			for(int j = i+1; j< hs.size();j++ ){
				if(hs.elementAt(i).Tinh_DiemTB(t.getDiem_Toan(),t.getDiem_Ly(),t.getDiem_Hoa(),t.getDiem_Van(), t.getDiem_Su(),t.getDiem_Dia()) > hs.elementAt(j).Tinh_DiemTB(t.getDiem_Toan(),t.getDiem_Ly(),t.getDiem_Hoa(),t.getDiem_Van(), t.getDiem_Su(),t.getDiem_Dia())){
					Collections.swap(hs, i, j);
				}
			}
		}
	}
	public static boolean checkID (String h){
	    for (int i = 0; i < hs.size() ; i++){
	        if (h.equals(hs.elementAt(i).getMSHS()))
	         return true;
	    }
	    return false;
	}
        public static boolean checkDC (String h){
	    for (int i = 0; i < hs.size() ; i++){
	        if (h.equals(hs.elementAt(i).getDia_Chi()))
	         return true;
	    }
	    return false;
	}
	public static Hoc_Sinh TimKiemID(String h) {
            String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
            Hoc_Sinh hs = new Hoc_Sinh();
		try {
			Connection cn = DriverManager.getConnection(url);
			String sql = "select * from HOCSINH Where MSHS = '"+h+"' ";
			Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				hs.setMSHS(result.getString("MSHS"));
				hs.setHoTen(result.getString("HoTen"));
				hs.setLop(result.getString("Lop"));
				hs.setDia_Chi(result.getString("Dia_Chi"));
				hs.setNgay(result.getInt("Ngay"));
				hs.setThang(result.getInt("Thang"));
				hs.setNam(result.getInt("Nam"));
				hs.setDiem_Toan(result.getFloat("Diem_Toan"));
				hs.setDiem_Ly(result.getFloat("Diem_Ly"));
				hs.setDiem_Hoa(result.getFloat("Diem_Hoa"));
				hs.setDiem_Van(result.getFloat("Diem_Van"));
				hs.setDiem_Su(result.getFloat("Diem_Su"));
				hs.setDiem_Dia(result.getFloat("Diem_Dia"));
			}
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                return hs;
	}
        public void TimKiemDC(String h) {
           String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
		
		try {
			Connection cn = DriverManager.getConnection(url);
			String sql = "select * from HOCSINH where Dia_Chi = '"+h+"' ";
			Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Hoc_Sinh a = new Hoc_Sinh();
//                                Mon_Olympic b = new Mon_Olympic();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Them_hs() {
			Hoc_Sinh sd;
				do {
					sd = new Hoc_Sinh ();
					sd.Nhap_Thong_Tin_Hoc_Sinh();
					if (checkID(sd.getMSHS())) {
						System.out.println();
						System.out.println("Ma So Hoc Sinh Da Ton Tai !");
						System.out.println("Vui Long Nhap Lai Thong Tin!");
					}
				}while(checkID(sd.getMSHS()));
				hs.add(sd);
	}
	public void Sua_hs(String h) {
		Xoa_hs(h);
		Them_hs ();
	}
	public void Xoa_hs(String h) {
            String url="jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
            Connection cn;
           try{
                cn=DriverManager.getConnection(url);
                System.out.print("connect success\n");
                String sql="Delete From HOCSINH Where MSHS = '"+h+"' ";
                PreparedStatement st=cn.prepareStatement (sql); 
                int rows = st.executeUpdate();
                    cn.close();
            } catch (SQLException e){
                System.out.print("oh no.");
                e.printStackTrace();
            }
		
	}
	public int size() {
		return hs.size();
	}
	public Hoc_Sinh elementAt(int i) {
		return hs.elementAt(i);
	}

public void writeSQL (Hoc_Sinh hs) {//write data into sql
    String url="jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
    Connection cn;
   try{
        cn=DriverManager.getConnection(url);
        System.out.print("connect success\n");
        String sql="INSERT INTO HOCSINH VALUES"
                +"(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement st=cn.prepareStatement (sql);
        st.setString(1, hs.getMSHS());
        st.setString(2, hs.getHoTen());
        st.setString(3, hs.getLop());
        st.setString(4, hs.getDia_Chi());
        st.setInt(5, hs.getNgay());
        st.setInt(6, hs.getThang());
        st.setInt(7, hs.getNam());
        st.setFloat(8, hs.getDiem_Toan());
        st.setFloat(9, hs.getDiem_Ly());
        st.setFloat(10, hs.getDiem_Hoa());
        st.setFloat (11, hs.getDiem_Van());
        st.setFloat(12, hs.getDiem_Su());
        st.setFloat(13, hs.getDiem_Dia());
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
public static void UpdateHoc_Sinh(Hoc_Sinh hs, String h){
    String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
    Connection cn;
	try {
            cn = DriverManager.getConnection(url);
            String sql = "UPDATE HOCSINH SET HoTen=?,Lop =?,Dia_Chi=?,Thang=?,Ngay=?,Nam=?,Diem_Toan=?,Diem_Ly=?,Diem_Hoa=?,Diem_Van=?,Diem_Su=?,Diem_Dia=? WHERE MSHS = '"+h+"'";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, hs.getHoTen());
            st.setString(2, hs.getLop());
            st.setString(3, hs.getDia_Chi());
            st.setInt(4, hs.getThang());
            st.setInt(5, hs.getNgay());
            st.setInt(6, hs.getNam());
            st.setFloat(7, hs.getDiem_Toan());
            st.setFloat(8, hs.getDiem_Ly());
            st.setFloat(9, hs.getDiem_Hoa());
            st.setFloat(10, hs.getDiem_Van());
            st.setFloat(11, hs.getDiem_Su());
            st.setFloat(12, hs.getDiem_Dia());
            int rows = st.executeUpdate();
            if(rows > 0) {
               System.out.print("row has been updated\n");
		}
            cn.close();
	} catch (SQLException e) {
		System.out.print("oh no.");
		e.printStackTrace();
            }
}
public static Hoc_Sinh printSQL(String p) {//read data from sql
                Hoc_Sinh a = new Hoc_Sinh();
                 String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
		Connection cn;
		try {
			cn = DriverManager.getConnection(url);
			String sql = "SELECT * FROM HOCSINH WHERE MSHS = '"+p+"'" ;
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()) {
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
			}
			cn.close();
		} catch (SQLException e) {
			System.out.println("Oh no");
			e.printStackTrace();
		}
                return a;
}
public void connect () {
		String url = "jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
		
		try {
			Connection cn = DriverManager.getConnection(url);
			String sql = "select * from HOCSINH ";
//                        String sql = "select * from HOCSINH,MON_OLYMPIC where MSHS in (select DANGKY_MON.MSHS from DANGKY_MON,HOCSINH,MON_OLYMPIC where DANGKY_MON.MSHS = HOCSINH.MSHS and DANGKY_MON.TENMON= MON_OLYMPIC.TENMON)";
			Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Hoc_Sinh a = new Hoc_Sinh();
//                              Mon_Olympic b = new Mon_Olympic();
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
//                                b.setTENMON(result.getString("TENMON"));
//				b.setNGAYTHI(result.getString("NGAYTHI"));
				hs.add(a);
			}
			cn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            }
    public void add(Hoc_Sinh a){
        hs.add(a);
    }
}
