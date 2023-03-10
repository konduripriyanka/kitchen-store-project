<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="deleteitem">

<input type="hidden" name="ktid" value=<%=request.getParameter("ktid")%>>
<br>

<input type="submit" value="Delete">
</form>
</body>
</html>