package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateBookPrice {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		
		Statement st=con.createStatement();
		
		st.executeUpdate("Update book set Book_Price=1000 where Book_Author='Gosling'");
		
		con.close();		
		
	}

}
