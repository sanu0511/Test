import java.io.BufferedReader;
import java.io.InputStreamReader;
import java .sql.*;

public class Insert2 {
   
    public static void main(String[] args)throws Exception {

        //Loading driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Establishing Connection
        String url = "jdbc:mysql://localhost:3306/new";
        String username = "root";
        String password = "K!sl@y07";

        Connection con = DriverManager.getConnection(url, username, password);

        if(con.isClosed()){
            System.out.println("Connection is closed...");
        }else{
            System.out.println("Connection established successfully...");
        }

        //Creating Query
        String InsertValue = "insert into Bob(EName, City, State, Mobile, Email_ID) values (?,?,?,?,?)";
        
        //Creating a statement
        PreparedStatement st = con.prepareStatement(InsertValue);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name : ");
        String name=br.readLine();

        System.out.println("Enter City : ");
        String city=br.readLine();

        System.out.println("Enter State : ");
        String state=br.readLine();

        System.out.println("Enter Mobile number : ");
        Long mobile=(long) br.read();

        System.out.println("Enter Email-ID : ");
        String email=br.readLine();

        st.setString(1, name);
        st.setString(2, city);
        st.setString(3, state);
        st.setLong(4, mobile);
        st.setString(5, email);

        //Executing Statement
        st.executeUpdate();

        System.out.println("Value Inserted Successfully...");
        con.close(); 
        
    }
    
}
