<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<html>
<body>
<h2>Enter Employee Details</h2>
<form method="post">
  Emp No: <input type="text" name="empno"/><br/>
  Name: <input type="text" name="empname"/><br/>
  Basic Salary: <input type="text" name="salary"/><br/>
  <input type="submit" value="Insert"/>
</form>

<%
Connection con = null;
try {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

    if(request.getParameter("empno") != null) {
        int empno = Integer.parseInt(request.getParameter("empno"));
        String empname = request.getParameter("empname");
        int salary = Integer.parseInt(request.getParameter("salary"));

        PreparedStatement ps = con.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
        ps.setInt(1, empno);
        ps.setString(2, empname);
        ps.setInt(3, salary);

        int i = ps.executeUpdate();
        if(i > 0) out.println("<p style='color:green;'>Employee inserted successfully.</p>");
    }

    // Generate Salary Report
    out.println("<hr/>");
    out.println("<h3>Salary Report</h3>");
    out.println("<pre>");
    out.println("---------------------------------------------");

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

    int total = 0;
    while(rs.next()) {
        int eno = rs.getInt("Emp_NO");
        String ename = rs.getString("Emp_Name");
        int basic = rs.getInt("Basicsalary");
        total += basic;

        out.println("Emp_No   : " + eno);
        out.println("Emp_Name : " + ename);
        out.println("Basic    : " + basic);
        out.println("---------------------------------------------");
    }

    out.println("Grand Salary : " + total);
    out.println("---------------------------------------------");
    out.println("</pre>");

} catch(Exception e) {
    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
} finally {
    if(con != null) con.close();
}
%>
</body>
</html>