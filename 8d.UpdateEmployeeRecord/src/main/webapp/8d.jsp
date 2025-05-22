//8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
//the table Emp of the database Employee using HTML and JSP to get the fields and display the
//results respectively


<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Update Employee</title>
</head>
<body>
    <h2>Update Employee Details</h2>

    <form method="post">
        <label>Emp No:</label>
        <input type="text" name="empno" required /><br/><br/>

        <label>Emp Name:</label>
        <input type="text" name="empname" required /><br/><br/>

        <label>Basic Salary:</label>
        <input type="text" name="basicsalary" required /><br/><br/>

        <input type="submit" value="Update Employee" />
    </form>

    <hr/>

<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    if (empno != null && empname != null && basicsalary != null) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC", "root", "");

            String sql = "UPDATE Emp SET Emp_Name = ?, basicsalary = ? WHERE Emp_no = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, empname);
            ps.setDouble(2, Double.parseDouble(basicsalary));
            ps.setInt(3, Integer.parseInt(empno));

            int rows = ps.executeUpdate();

            if (rows > 0) {
                out.println("<p style='color:green;'>Employee updated successfully.</p>");
            } else {
                out.println("<p style='color:red;'>Employee with empno " + empno + " not found.</p>");
            }

        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if (ps != null) ps.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }
%>

</body>
</html>
