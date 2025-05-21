<%@ page import="java.sql.*" %>
<html>
<head><title>Delete Coffee</title></head>
<body>
<h2>Delete Coffee Record</h2>
<form method="post">
    Enter Coffee ID to Delete: <input type="text" name="cid" required>
    <input type="submit" value="Delete">
</form>

<%
String cid = request.getParameter("cid");
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
    if (cid != null && !cid.isEmpty()) {
        PreparedStatement ps = con.prepareStatement("DELETE FROM coffee WHERE id=?");
        ps.setInt(1, Integer.parseInt(cid));
        ps.executeUpdate();
        out.println("<p style='color:green;'>Record deleted.</p>");
    }

    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM coffee");
%>
    <h3>Current Coffee Records</h3>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Price</th></tr>
<%
    while (rs.next()) {
%>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("coffee_name") %></td>
            <td><%= rs.getInt("priced") %></td>
        </tr>
<%
    }
    con.close();
} catch (Exception e) {
    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
}
%>
    </table>
</body>
</html>
