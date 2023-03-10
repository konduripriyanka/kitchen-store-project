<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="inserttokitem" method="post" enctype="multipart/form-data">

Item Name<input type="text" name="ktname"><br>
<br>
Item Price<input type="text" name="ktprice"><br>
<br>
fileupload<input type="file" name="file"><br>
<br>
<input type="submit" value="Add">
</form>

<h1><i>Item details</i></h1>

<form action="getallkitchenitemsadmin">
<input type="submit" value="Details of all items">

</form>
</center>
</body>
</html>