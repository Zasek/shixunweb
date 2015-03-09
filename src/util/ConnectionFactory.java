package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

public class ConnectionFactory {
	private static String driver = null;
	private static String url = null;
	private static String userName = null;
	private static String passwd = null;
	
	public static void main(String[] args) {
		
		System.out.println(driver);
		System.out.println(url);
		getConnection();
	}
	
	static{
		try{
			Properties pro = new Properties();
			pro.load(new FileInputStream(".//src//util//config.properties"));
			driver = pro.getProperty("driver");
			url = pro.getProperty("url");
			Class.forName(driver);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection con = null;
		try{
			con = DriverManager.getConnection(url,"root","");
			if(con != null){
				System.out.println("Success");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return con;
		}
	}
}
