<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.example.demo.*" %>
    <%@page import="java.util.*" %>
     <%@page import="java.nio.file.Files" %>
    <%@page import="java.io.File" %>
     <%@page import="java.util.Base64.*" %>
     
     <style>
body {
  background-color:0% 	#b3b3b3	rgb(179, 179, 179);
  background: #F0F0F0;
}
h1 {
  text-align:left;
  color: rose;
  text-align: center;
  font-size: 40px;
  margin-left: 0px;
}
button {
  background-color: black; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: left;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin-left: 0px;
}
a:link, a:visited {
  background-color: blue;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: blue;
}
table {
  width: 75%;
}

th {
 background-color: #04AA6D;
  color: white;
  height: 70px;
}
td {
  text-align: center;
}
</style>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="addnewitem.jsp">
<button type="text" name="add">Add Item</button>
</form>
<form>
<h1><i>List Of all Items in the Store</i></h1>
<%List<Kitchenitems> list=(List<Kitchenitems>)request.getAttribute("list");%>

<table border="2">
<tr><th>Item_Id</th><th>Item_Name</th><th>Item_Price</th><th>Image</th><th>Actions</th></tr>

<%for(Kitchenitems kti:list){ %>

<tr><td><%=kti.getKid()%></td><td><%=kti.getName()%></td><td><%=kti.getKtprice()%></td>
<td><%String path=kti.getFilepath();
byte[] images=Files.readAllBytes(new File(path).toPath());
byte[] encodeBase64 = Base64.getEncoder().encode(images);
String base64Encoded = new String(encodeBase64, "UTF-8");%>
<img alt="img" src="data:image/png;base64,<%=base64Encoded%>" width="100" height="50"/>
</td>
<td><a href="update.jsp">Update</a></td>
<td><a href="delete.jsp?ktid=<%=kti.getKid()%>">Delete</a></td> 
</tr>

<%} %>
</table>

</form>
</center>
</body>
</html>