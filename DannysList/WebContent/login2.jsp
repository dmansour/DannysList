<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<head>
<title>Login Page</title>
</head>
<body>
    <form action="checklogin.jsp" method="post">
        Username:
        <input type="text" name="username" size=30><br/>
        Password:
        <input type="password" name="password" size=30><br/>
        <input type="submit" value="Login">
    </form>
</body>
</html>