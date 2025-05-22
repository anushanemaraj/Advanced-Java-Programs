//7a. Build a Session Management using JSP program set with one minute session expiry time to get
//your name through text box and press submit to display the message by greeting Hello your name!.
//Check the expiry of the session after one minute.

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>designation

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Display the session value on this page</h1>
<%
String name=(String)session.getAttribute("user");
if(name==null)
out.print("Sorry the session has ended");
else
out.print("Hello "+name);
%>
</body>
</html>
