
package quanly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import quanly.Hoc_Sinhs;
public class Mon_Olympic{
	public static String TENMON;
	public static String NGAYTHI;
	public  Mon_Olympic() {
		super();
		TENMON = "";
		NGAYTHI = "";
	}
//        connect();
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

        public static void insertMonSQL (String TENMON, String MSHS) {//write data into sql
    String url="jdbc:sqlserver://DESKTOP-2GMLG4V\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = 14072002;encrypt=false";
    Connection cn;
   try{
        cn=DriverManager.getConnection(url);
        System.out.print("connect success\n");
        String sql="INSERT INTO DANGKY_MON VALUES"
                +"(?,?)";
        PreparedStatement st=cn.prepareStatement (sql);
        st.setString(1, TENMON);
        st.setString(2, MSHS);
        
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
        
}
