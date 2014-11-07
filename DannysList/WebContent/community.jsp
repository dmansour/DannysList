<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<button style="text-align: center" type="button" onClick="myFunction()">You should click me!!</button>
<p id="demo" style="text-align: center">this is an awesome demo son!! <p>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"s></script>
<script src="res/loader.jsp"></script>
<script>
function myFunction() {
	document.getElementById("demo").innerHTML = "New text!! ";
	//document.getElementById("boss").innerHTML = "I guess you are a boss";

}
</script>
</body>
</html>