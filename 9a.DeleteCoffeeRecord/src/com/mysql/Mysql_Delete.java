//9a. Read all the existing records from the table coffee which is from the database test and delete
//an existing coffee product from the table with its id and display the rest of the records using
//HTML and JSP to get the field and display the results respectively

package com.mysql;
import java.sql.*;
import java.util.Properties;

public class Mysql_Delete {

public static void main(String[] args)
{
try
{
Connection dbConnection = null;
String url = "jdbc:mysql://localhost/test";
Properties info = new Properties();
info.put("user", "root");
info.put("password", "");
dbConnection = DriverManager.getConnection(url, info);
if (dbConnection != null)
{
System.out.println("Successfully connected to MySQL database test");
}

//SQL SELECT query.
// if you only need a few columns, specify them by name instead of using "*"
String query = "SELECT * FROM coffee";
// create the java statement
Statement st = dbConnection.createStatement();
// execute the query, and get a java resultset
ResultSet rs = st.executeQuery(query);
// iterate through the java resultset
while (rs.next())
{

int id = rs.getInt("id");
String coffee_name = rs.getString("coffee_name");
int priced= rs.getInt("priced");
// print the results
System.out.format("\n%d, %s, %d", id,coffee_name,priced);
}

// Deleting records
String query3 = "delete from coffee where id=264";
PreparedStatement preparedStmt2 = dbConnection.prepareStatement(query3);
preparedStmt2.execute();
dbConnection.close();

preparedStmt2.close();

}
catch (Exception e)
{
System.err.println("Got an exception! ");
System.err.println(e.getMessage());
}
}
}
