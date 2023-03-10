<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     
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
    input[type=text], select {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type="password"]
{
   width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type="email"]
{
   width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type="Dob"]
{
   width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
    </style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="getallkitchenitemsuser">

Firstname<input type="text" name="ufname"><br><br>
Lastname<input type="text" name="ulname"><br><br>
password<input type="password" name="upassword"><br><br>
Email<input type="email" name="uemail"><br><br>
Dob<input type="date" name="udob"><br><br>

<br>
<input type="submit" value="login">

</form>


</body>
</html>