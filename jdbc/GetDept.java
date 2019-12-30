package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class GetDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//load the driver
		Connection con =null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found"+e.getMessage());
		}
		
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="hr";
		String password="hr";
		// 2. Get connection
		try {
			con =DriverManager.getConnection(url,username,password);
			DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			System.out.println("Connection failed"+e.getMessage());
		}
		
		
		// database metadata
		try {
			DatabaseMetaData dbmeta = con.getMetaData();
			System.out.println(dbmeta.toString());
			System.out.println(dbmeta.getDatabaseMajorVersion());
			System.out.println(dbmeta.getDatabaseProductName());
			}catch(SQLException e) {
				e.printStackTrace();
			}
		// Create statement object
		String sql="select employee_id, first_name, last_name from employees";
		try {
			Statement st =con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			
			ResultSetMetaData rsmd =rs.getMetaData();
			int colcount =rsmd.getColumnCount();
			System.out.println("Colcount:"+colcount);
			int count=0;
			int type = rsmd.getColumnType(2);
			if(type == Types.INTEGER) {
				System.out.println("Col has Intehger type");
			}
			else if(type == Types.VARCHAR) {
				System.out.println("col is a string (varchar)");
			}else if (type == Types.NUMERIC) {
				System.out.println("Col is type numeric");
			}
			
			System.out.println(rsmd.getColumnTypeName(1));
			while(rs.next()) {
				
				//String fname =rs.getString("first_name");
				
				//System.out.println(fname);
				count++;
			}
			System.out.println(count);
			rs.close();
			st.close();
			con.close();

		} catch(SQLException sqle) {
			System.out.println(sqle.getMessage());
		}

	}

}
