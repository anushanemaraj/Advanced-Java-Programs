<%@ page import="java.sql.*" %>
<html>
<head><title>Insert Coffee</title></head>
<body>
    <h2>Insert Coffee Product</h2>
    <form method="post" action="insertCoffee.jsp">
        ID: <input type="number" name="id" required><br/>
        Name: <input type="text" name="name" required><br/>
        Price: <input type="number" name="price" required><br/>
        <input type="submit" value="Insert">
    </form>

<%
String id = request.getParameter("id");
String name = request.getParameter("name");
String price = request.getParameter("price");

if (id != null && name != null && price != null) {
    Connection con = null;
    try {
        // Optional for old Java versions
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC", "root", "");

        PreparedStatement ps = con.prepareStatement("INSERT INTO coffee VALUES (?, ?, ?)");
        ps.setInt(1, Integer.parseInt(id));
        ps.setString(2, name);
        ps.setInt(3, Integer.parseInt(price));
        ps.executeUpdate();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM coffee");
%>
        <h3>Coffee Table</h3>
        <table border="1">
            <tr><th>ID</th><th>Name</th><th>Price</th></tr>
<%
        while (rs.next()) {
%>
            <tr>
                <td><%= rs.getInt(1) %></td>
				<td><%= rs.getString(2) %></td>
				<td><%= rs.getInt(3) %></td>

            </tr>
<%
        }
        rs.close();
        st.close();
        ps.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (con != null) try { con.close(); } catch (Exception ignore) {}
    }
}
%>
</table>
</body>
</html>