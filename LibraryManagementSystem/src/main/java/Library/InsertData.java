package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		
		PreparedStatement ps=con.prepareStatement("insert into book values(?,?,?,?)");
		
		//Take input from user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows to be entered");
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter Book_id");
			int Book_id=sc.nextInt();
			
			System.out.println("Enter Book_name");
			String Book_Name=sc.next();
			
			System.out.println("Enter Book_Price");
			double Book_Price=sc.nextDouble();
			
			System.out.println("Enter Book_Author");
			String Book_Author=sc.next();
			
			ps.setInt(1, Book_id);
			ps.setString(2, Book_Name);
			ps.setDouble(3, Book_Price);
			ps.setString(4, Book_Author);
			ps.executeUpdate();
			
		}
		
		con.close();
		
	}

}
