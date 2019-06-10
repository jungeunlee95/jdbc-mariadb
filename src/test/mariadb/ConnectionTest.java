package test.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			// 1. JDBC Driver(MariaDB) 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. 연결하기
			String url = "jdbc:mariadb://192.168.1.52:3307/webdb";
			conn = DriverManager.getConnection(url,"webdb","webdb");
			
			System.out.println("연결 성공!!!!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Fail To Driver Loading : " +  e);
		} catch (SQLException e) {
			System.out.println("Error : " + e);
		} finally{
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
