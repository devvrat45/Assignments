package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		// Create statement object
		String sql="select * from departments";
		try {
			Statement st =con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			int count=0;
			while(rs.next()) {
				
				String fname =rs.getString("DEPARTMENT_NAME");
				
				System.out.println(fname);
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
