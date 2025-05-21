<%@ page import="java.sql.*" %>
<html>
<head><title>Update Coffee</title></head>
<body>
    <h2>Update Coffee Record</h2>  
    <form method="post" action="updateCoffee.jsp">
        ID (to update): <input type="number" name="id" required><br/>
        New Name: <input type="text" name="name" required><br/>
        New Price: <input type="number" name="price" required><br/>
        <input type="submit" value="Update">
    </form>

<%
String id = request.getParameter("id");
String name = request.getParameter("name");
String price = request.getParameter("price");

if (id != null && name != null && price != null) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        PreparedStatement ps = con.prepareStatement("UPDATE coffee SET coffee_name=?, priced=? WHERE id=?");
        ps.setString(1, name);
        ps.setInt(2, Integer.parseInt(price));
        ps.setInt(3, Integer.parseInt(id));
        int count = ps.executeUpdate();

        if (count > 0) {
            out.println("<p style='color:green;'>Record updated successfully!</p>");
        } else {
            out.println("<p style='color:red;'>No record found with ID: " + id + "</p>");
        }

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM coffee");
%>
        <h3>Updated Coffee Table</h3>
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
        rs.close();
        st.close();
        ps.close();
        con.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
}
%>
</table>
</body>
</html>
