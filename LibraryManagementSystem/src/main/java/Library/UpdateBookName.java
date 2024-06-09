package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBookName {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		
		PreparedStatement ps= con.prepareStatement("update book set Book_Name='Web' Where Book_Name='Eich'");
		ps=con.prepareStatement("update book set Book_Name='Sql' Where Book_Name='Codd'");
		ps.executeUpdate();
		con.close();
		
	}

}
