<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<head>
<title>The Dudes who Matter!</title>
<nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav nav-pills" style="text-align: center; padding-top: 10px; padding-bottom: 10px" role="navigation">
      	<li><a class="navbar-brand" href="index.jsp"><font color="#428bca">DannysList</font></a></li>
        <li style="width: 150px"><a href="memberpage.jsp"><font color="#428bca">Home</font></a></li>
        <li style="width: 150px"><a href="searchpage.jsp"><font color="#428bca">Search</a></font></li>
        <li style="width: 150px"><a href="about.jsp" ><font color="#428bca">About</font></a>
        <li style="width: 150px"><a href="credits.jsp"><font color="#428bca">Credits</font></a>
        <li>
        <form class="navbar-form navbar-right" role="search" action="GetWalmartSearch">
        <input style="width:445px" text" class="form-control" placeholder="Search For Game..." name="search" id="search">
        <button type="submit" class="btn btn-primary">Search</button>
      </form>
      </li>
      </ul>
    </div>
  </div>
</nav>
</head>
<body>
The Dudes who Matter!
</body>
</html>