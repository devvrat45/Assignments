package test2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import collection.Student;

public class ReadDataBase  {

	static ArrayList<Books> bk = new ArrayList<>();
	static ArrayList<Author> au = new ArrayList<>();
	static ArrayList<Publisher> pu = new ArrayList<>();
	Connection con=null;
	
	// Task 1
	public  void PrintDataBase () { 
		
		for (Books b: bk ) {
			System.out.println(b.getIsbn()+" "+b.getTitle()+" "+b.getPages()+" "+b.getAuth().getName()+" "+b.getPub().getName()+" "+b.getPub().getCity());
		}
	}
	//Task 2
	public void sortAuthor() {
		
		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select b.isbn,b.title,b.pages,b.pub_year, b.type,b.author_id,b.publisher_id,a.name,a.nationality,p.name, p.city from books b join authors a on b.author_id=a.author_id join publisher p on b.publisher_id=p.publisher_id order by a.name";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
			    System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getInt(6)+":"+rs.getInt(7)+":"+rs.getString(8)+":"+rs.getString(9)+":"+rs.getString(10)+":"+rs.getString(11));
			}
		}catch (SQLException e)
		{
			System.out.println(e);
		}
	}
	// Task 3
	public void listBooksByYear(int year) {
		
		for (Books b: bk) {
			int y = Integer.parseInt(b.getPub_year());
			if( y > year) {
				System.out.println(b.getTitle());
			}
		}
	}
	// task 4
	public void bookPoemInCity(String poem, String city) {
		
		for (Books b: bk) {
		
			if( b.getType().equalsIgnoreCase(poem)) {
				if(b.getPub().getCity().equalsIgnoreCase(city)) {
					System.out.println(b.getTitle());
				}
				else {
					System.out.println(b.getTitle()+" book poem is not in the CITY");
				}
				
			}
			else {
				System.out.println(b.getTitle()+" It is not a book POEM");
			}
		}
		
	}
    //Task 5
	public void booksbyauthor(String name) {
		
		for (Books b: bk) {
			
			if( b.getAuth().getName().equalsIgnoreCase(name)) {
				
				System.out.println(b.getTitle());
			}
				
			
		}
	}
	

	public void getData () {
		DBConnector connector = new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select b.isbn,b.title,b.pages,b.pub_year, b.type,b.author_id,b.publisher_id,a.name,a.nationality,p.name, p.city from books b join authors a on b.author_id=a.author_id join publisher p on b.publisher_id=p.publisher_id";
		int count =0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
			    Publisher p = new Publisher(rs.getInt(7),rs.getString(10),rs.getString(11));
			    Author a = new Author(rs.getInt(6),rs.getString(8),rs.getString(9));
			    Books b = new Books(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),a,p);
				bk.add(b);
				au.add(a);
				pu.add(p);
			    //System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getInt(6)+":"+rs.getInt(7)+":"+rs.getString(8)+":"+rs.getString(9)+":"+rs.getString(10)+":"+rs.getString(11));
			}
		}catch (SQLException e)
		{
			System.out.println(e);
		}
		
	}

	public static void main (String [] args)
	{
		ReadDataBase list = new ReadDataBase();
		list.getData();
		//list.PrintDataBase();
		//list.sortAuthor();
		//list.listBooksByYear(2015);
		//list.bookPoemInCity("poems", "Delhi");
		list.booksbyauthor("devvrat");
		}
	}



