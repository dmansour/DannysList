<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<head>
<title>Search Page</title>
<nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><font color="#428bca">DannysList</font></a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav" style="text-align: center" role="navigation">
        <li style="width: 150px"><a href="#"><font color="#428bca">Home</font></a></li>
        <li class="active" style="width: 150px"><a href="#"><font color="#428bca">Search</font></a></li>
        <li style="width: 150px"><a href="#" ><font color="#428bca">About</font></a>
        <li style="width: 150px"><a href="#"><font color="#428bca">Credits</font></a>
      </ul>
      <form class="navbar-form navbar-left" role="search" action="GetWalmartSearch">
        <div class="form-group">
          <input style="width:445px" text" class="form-control" placeholder="Search For Game..." name="search" id="search">
        </div>
        <button type="submit" class="btn btn-primary">Search</button>
      </form>
    </div>
  </div>
</nav>
</head>
<body style="background-color: #efefef;">
	<br />
	<h2><center>Search Results</center></h2>
	<br />
	<table class="table" width="100%">
		<tr style="background: #428bca; color:#FFFFFF">
			<td>Title</td>
			<td>Link</td>
			<td>Year</td>
			<td>Price</td>
		</tr>
		
		<tr class="active">
			<td>Game1</td>
			<td>http://game1link.com</td>
			<td>2012</td>
			<td>$59.00</td>
		</tr>
		
		<tr class="active">
			<td>Game2</td>
			<td>http://game2link.com</td>
			<td>2008</td>
			<td>$19.00</td>
		</tr>
		
		<tr class="active">
			<td>Game3</td>
			<td>http://game3link.com</td>
			<td>2011</td>
			<td>$29.50</td>
		</tr>
		
		<tr class="active">
			<td>Game4</td>
			<td>http://game4link.com</td>
			<td>2009</td>
			<td>$19.00</td>
		</tr>
		
		<tr class="active">
			<td>Game5</td>
			<td>http://game5link.com</td>
			<td>2014</td>
			<td>$69.00</td>
		</tr>
	</table>
</body>
</html>