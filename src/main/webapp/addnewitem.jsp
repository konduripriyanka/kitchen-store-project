<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.nio.file.Files" %>
    <%@page import="java.io.File" %>
    
<!DOCTYPE html>
<html>
<head>

 <style>
    body {
      background-color: lightblue;
      text-align: center;
      font-size: 20px;
    }
    input[type=submit]{
     background-color: #04AA6D;
     font-size: 25px;
    }
    
    </style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="inserttokitem" method="post" enctype="multipart/form-data">

Item Name<input type="text" name="ktname"><br>
<br>
Item Price<input type="text" name="ktprice"><br>
<br>
fileupload<input type="file" name="file"><br>
<br>
<input type="submit" value="Add">
</form>


</body>
</html>