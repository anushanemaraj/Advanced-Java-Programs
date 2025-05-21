<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Salary Report - Filter by Starting Letter</title>
    <style>
        body {
            font-family: monospace;
        }
    </style>
</head>
<body>
    <h2>Enter Starting Letter of Employee Name</h2>
    <form method="post">
        <input type="text" name="letter" maxlength="1" required />
        <input type="submit" value="Generate Report" />
    </form>

<%
    String letter = request.getParameter("letter");

    if (letter != null && !letter.isEmpty()) {
        int grandTotal = 0;
%>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Emp WHERE Emp_Name LIKE ?");
            stmt.setString(1, letter + "%");

            ResultSet rs = stmt.executeQuery();

            boolean found = false;
            while (rs.next()) {
                found = true;
                int no = rs.getInt("Emp_NO");
                String name = rs.getString("Emp_Name");
                int salary = rs.getInt("Basicsalary");
                grandTotal += salary;
%>
Emp_No    : <%= no %>  
Emp_Name  : <%= name %>  
Basic     : <%= salary %>  
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
            }

            if (!found) {
%>
No records found starting with '<%= letter %>'
<%
            } else {
%>
Grand Total Salary = <%= grandTotal %>  
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
            }
            conn.close();
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
%>
</pre>
</body>
</html>