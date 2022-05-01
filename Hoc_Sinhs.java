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
					if (check (sd.getMSHS())) {
						System.out.println();
						System.out.println("Ma So Hoc Sinh Da Ton Tai !");
						System.out.println("Vui Long Nhap Lai Thong Tin!");
					}
				}while(check (sd.getMSHS()));
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
		Collections.sort(hs,new Hoc_Sinhs());
	}
	public void sortDiem_TB() {
		Hoc_Sinh t = new Hoc_Sinh();
		for(int i = 0 ;i < hs.size()-1;i++){
			for(int j = i+1; j< hs.size();j++ ){
				if(hs.elementAt(i).Tinh_DiemTB() > hs.elementAt(j).Tinh_DiemTB()){
					Collections.swap(hs, i, j);
				}
			}
		}
	}
	public static boolean check (String h){
	    for (int i = 0; i < hs.size() ; i++){
	        if (h.equals(hs.elementAt(i).getMSHS()))
	         return true;
	    }
	    return false;
	}
	public void search_MS(String h) {
		int count = 0;
		for(int i = 0 ;i < hs.size();i++){
			if(h.equals(hs.elementAt(i).getMSHS())){
				hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
				count ++;
			   	break;
			}
		}
		if (count == 0) {
			System.out.println("Khong Ton Tai Ma So " + h + " Trong Danh Sach!");
		}
	}
	public void Them_hs() {
			Hoc_Sinh sd;
				do {
					sd = new Hoc_Sinh ();
					sd.Nhap_Thong_Tin_Hoc_Sinh();
					if (check (sd.getMSHS())) {
						System.out.println();
						System.out.println("Ma So Hoc Sinh Da Ton Tai !");
						System.out.println("Vui Long Nhap Lai Thong Tin!");
					}
				}while(check (sd.getMSHS()));
				hs.add(sd);
	}
	public void Sua_hs(String h) {
		Xoa_hs(h);
		Them_hs ();
	}
	public void Xoa_hs(String h) {
		int count = 0;
		for(int i = 0 ;i < hs.size();i++){
			if (hs.elementAt(i).getMSHS().equals(h)) {
				hs.remove(hs.elementAt(i));
				count ++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Khong Ton Tai Hoc Sinh Can Xoa!");
		}
	}
	public int size() {
		return hs.size();
	}
	public Object elementAt(int i) {
		return hs.elementAt(i);
	}
public void Phan_Loai_Hoc_Sinh ()	{
		int lc = 0;
		int count = 0;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("***DANH SACH PHAN LOAI SINH VIEN***");
			System.out.println("1.DANH SACH SINH VIEN GIOI");
			System.out.println("2.DANH SACH SINH VIEN KHA");
			System.out.println("3.DANH SACH SINH VIEN TRUNG BINH");
			System.out.println("4.DANH SACH SINH VIEN YEU");
			System.out.println("NHAP LUA CHON: ");
			lc = sc.nextInt();
			switch(lc)
			{	
				case 1:
				{
					System.out.println("HOC SINH GIOI");
					for(int i =0;i< hs.size();i++)
					{
						if(hs.elementAt(i).Tinh_DiemTB() >=8)
						{
							count++;
							hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
						}
					}
					if(count == 0)
					{
						System.out.println("!!!KHONG CO HOC SINH GIOI!!!");
					}
					break;
				}
				case 2:
				{
					System.out.println("HOC SINH KHA");
					for(int i =0;i< hs.size();i++)
					{
						if(hs.elementAt(i).Tinh_DiemTB() < 8 && hs.elementAt(i).Tinh_DiemTB() >=6.5)
						{
							count++;
							hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
						}
					}
					if(count == 0)
					{
						System.out.println("!!!KHONG CO HOC SINH KHA!!!");
					}
					break;
				}
				case 3:
				{
					System.out.println("HOC SINH TRUNG BINH");
					for(int i =0;i<hs.size();i++)
					{
						if(hs.elementAt(i).Tinh_DiemTB() < 6.5 && hs.elementAt(i).Tinh_DiemTB() >=5)
						{
							count++;
							hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
						}
					}
					if(count == 0)
					{
						System.out.println("!!! KHONG CO HOC SINH TRUNG BINH!!!");
					}
					break;
				}
				case 4:
				{
					System.out.println("HOC SINH YEU");
					for(int i =0;i<hs.size();i++)
					{
						if(hs.elementAt(i).Tinh_DiemTB() < 5 && hs.elementAt(i).Tinh_DiemTB() >=3.5)
						{
							count++;
							hs.elementAt(i).Xuat_Thong_Tin_Hoc_Sinh();
	
						}
					}
					if(count == 0)
					{
						System.out.println("!!!KHONG CO HOC SINH YEU!!!");
					}
					break;
				}
				case 5:
				{
					System.out.println("BAN MUON THOAT CHUONG TRINH, NHAN ESC");
					System.exit(0); 
				}
				default: 
					System.out.println("!!!khong hop le!!!, vui long nhap lai lua chon!");
					break;
			}
			
		}while((lc < 0)||( lc > 6 ));
	}
public void connect () {
		String url = "jdbc:sqlserver://DESKTOP-LDFVOIL\\SQLEXPRESS:1433;databaseName = QUANLY_HOCSINH;user = sa;password = dung123;encrypt=false";
		
		try {
			Connection cn = DriverManager.getConnection(url);
			String sql = "select * from HOCSINH";
			Statement statement = cn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			int count = 0;
			while (result.next()) {
				count ++;
				Hoc_Sinh a = new Hoc_Sinh();
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
    public void add(Hoc_Sinh a){
        hs.add(a);
    }
}

//	public void Out_File () {
//		//E:\HKII (2021_2022)\BaiTapLon_Java\BaiTapLon_Java\src
//		FileWriter fw = new FileWriter("D:\\testout.txt");
//        fw.write("Welcome to java.");
//        fw.close();
//	}
//}