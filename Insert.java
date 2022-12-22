import java.sql.*;
class Insert{

    public static void main(String[] args){

        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/new";
            String username = "root";
            String password = "K!sl@y07";

            Connection con = DriverManager.getConnection(url, username, password);

            if(con.isClosed()){
                System.out.println("Connection is closed...");
            }else{
                System.out.println("Connection established successfully...");
            }

            // create a query

            String CreateTable = "create table Bob(EID int(5) primary key auto_increment, EName Varchar(40) Not Null, City Varchar(15) Not Null, State Varchar(10) Not Null, Mobile int(15) Not Null, Email_ID Varchar(50))";
            
            //Create a statement
            Statement st = con.createStatement();

            st.executeUpdate(CreateTable);

            System.out.println("Table created in  database successfully...");

            con.close();
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}