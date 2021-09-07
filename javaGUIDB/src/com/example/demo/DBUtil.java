package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static final String JDBCDRV = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/javadb?useUnicode=true";
	static final String DBUSER = "javadb";
	static final String DBPASSWD = "1234";
	
	static Connection dbconn = null;
	public static void DBConnect() {
		try {
			// Step 1. driver loading
			Class.forName(JDBCDRV);
			System.out.println("JDBC Driver가 로드되었습니다.");
			// Step 2. get connection
			dbconn = DriverManager.getConnection(URL, DBUSER, DBPASSWD);
			System.out.println("DB 연결이 완료되었습니다.");
			
		}catch(ClassNotFoundException e1) {
			System.out.println("JDBC Driver 로드 실패 - " + e1.getMessage());
		}catch(SQLException e2) {
			System.out.println("DB 이름, Username 혹은 비밀번호를 확인해주세요. - " + e2.getMessage());
		}
	}//DBConnect
	
	public static void DBClose() {
		if(dbconn != null) {
			try {
				dbconn.close();
				System.out.println("DB 연결을 종료합니다.");
			}catch(Exception e) {
				System.out.println("DB가 정상적으로 종료되지 않았습니다. 어케함? - " + e.getMessage());
			}
		}
	}// DBClose

}
