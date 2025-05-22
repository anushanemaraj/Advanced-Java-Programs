//9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database
//Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
//follows using HTML and JSP to get the field and display the results respectively


<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Employee</title>
</head>
<body>

<%
    String empIdStr = request.getParameter("empId");
    if (empIdStr == null) {
%>
    <form method="get" >
        <label for="empId">Enter Employee ID to delete:</label>
        <input type="number" name="empId" required />
        <input type="submit" value="Delete" />
    </form>
<%
    } else {
        int empId = Integer.parseInt(empIdStr);
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        Connection conn = null;
        PreparedStatement delStmt = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            String deleteQuery = "DELETE FROM Emp WHERE Emp_NO = ?";
            delStmt = conn.prepareStatement(deleteQuery);
            delStmt.setInt(1, empId);
            int deleted = delStmt.executeUpdate();

            if (deleted > 0) {
%>
                <p>✅ Employee with ID <b><%= empId %></b> deleted successfully.</p>
<%
            } else {
%>
                <p>⚠ No employee found with ID <b><%= empId %></b>.</p>
<%
            }

            String selectQuery = "SELECT * FROM Emp";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(selectQuery);
%>

    <h2>Salary Report</h2>
    <hr/>
<%
            while (rs.next()) {
%>
        <div style="margin-bottom:10px;">
            <strong>Emp_No:</strong> <%= rs.getInt("Emp_NO") %><br/>
            <strong>Emp_Name:</strong> <%= rs.getString("Emp_Name") %><br/>
            <strong>Basic:</strong> <%= rs.getInt("Basicsalary") %><br/>
            <hr/>
        </div>
<%
            }

        } catch (Exception e) {
%>
            <p style="color:red;">❌ Error: <%= e.getMessage() %></p>
<%
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (delStmt != null) delStmt.close();
            if (conn != null) conn.close();
        }
    }
%>

</body>
</html>
