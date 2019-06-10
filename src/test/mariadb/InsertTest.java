package test.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	
	public static void main(String[] args) {
		boolean result = insert("디자인팀");
		if(result) {
			System.out.println("성공");
		}
	}
	
	public static boolean insert(String name) {
		boolean result = false;
		
		// 	자원정리
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1. JDBC Driver(MariaDB) 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. 연결하기
			String url = "jdbc:mariadb://192.168.1.52:3307/webdb";
			conn = DriverManager.getConnection(url,"webdb","webdb");
			
			// 3. statement 객체 생성
			stmt =  conn.createStatement();
			
			// 4. SQL문 실행
			String sql = "insert into department values(null, '" + name + "')";
			
			int count = stmt.executeUpdate(sql); // 들어간 갯수만큼 return
			
			result = count == 1; // 1개 insert 성공하면 true!
			
		} catch (ClassNotFoundException e) {
			System.out.println("Fail To Driver Loading : " +  e);
		} catch (SQLException e) {
			System.out.println("Error : " + e);
		} finally{
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;

	}

	
	

}
