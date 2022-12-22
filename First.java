//Program for first JDBC program:

import java.sql.*;
class First
{
	public static void main(String[] args)
	{
				
		try
		{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/new";
			String username = "root";
			String password = "K!sl@y07";

			Connection con = DriverManager.getConnection(url, username,password);
			
			if(con.isClosed()){
				System.out.println("Connection is still closed...");
			}
			else{
				System.out.println("Connection estalished successfully...");
			}
			//Still here lines of statement will be same in all the program.
//------------------------------------------------------------------------------------------------------------

			
			con.close();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}