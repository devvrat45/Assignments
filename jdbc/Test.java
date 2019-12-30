package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	static Connection con =null;
	static Map<String, String> map = new HashMap();
	

	public static void listEmployeeBeforeDate(String date) {
		int count = 0;
		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		con = connector.getConnection();
		String Sql ="select first_name,to_char(hire_date)as hiredate from employees where hire_date<=?";
		try {
			PreparedStatement pst = con.prepareStatement(Sql);
			
			pst.setString(1, date);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				count++;
				map.put(rs.getString(1),rs.getString(2));
				System.out.println(rs.getString(1)+":"+rs.getString(2));
			}
			System.out.println(count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		
	}
	
	public static void listEmployeeAfterDate() {
		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		con = connector.getConnection();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1= new Test();
		t1.listEmployeeBeforeDate("17-JUN-10");
		
		Set<String> set= map.keySet();
		Iterator<String> it =set.iterator();
		
		while(it.hasNext()) {
			String key= it.next();
			String value=map.get(key);
			System.out.println(key+":"+ value);
		}	
		

	}

}
