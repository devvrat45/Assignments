package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserDAO {
	 
	Connection con;
	ArrayList<User> usr = new ArrayList<>();
	 
	public UserDAO(){
		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		con = connector.getConnection();
		
	}
	public Role getRoleFromDataBase(int role_id)
	{

		String sql = "select * from roles where role_id="+role_id;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs =pst.executeQuery(sql);
			while(rs.next()) {
				Role r =new Role(rs.getInt(1),rs.getString(2),rs.getString(3));
				return r;
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		return null;
	}
	
	
	public  void getUsersFromDataBase() {
	
		String Sql ="select * from users";
		
		try {
			PreparedStatement pst = con.prepareStatement(Sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				User e = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getInt(6), getRoleFromDataBase(rs.getInt(6)),rs.getString(7));
				usr.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void getUser()
	{
		Iterator<User> itr = usr.iterator();
		
		while(itr.hasNext()) {
			User usr1 = itr.next();
			System.out.println(usr1);
		}
		
	}
	public void getUserRole(String name) {
		Iterator<User> itr = usr.iterator();
		while(itr.hasNext()) {
			User usr1 = itr.next();
			if(usr1.getName().equalsIgnoreCase(name)) {
				System.out.println(usr1.getRoles().getName());
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDAO ud = new UserDAO();
		ud.getUsersFromDataBase();
		//ud.getUser();
		ud.getUserRole("devv");
	}
	
	

}
