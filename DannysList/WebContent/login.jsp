<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>DannysList Portal</title>
<style>
a {

	text-decoraton: none;
	color:#F96;
	
}
</style>
</head>

<body style="background-color: #efefef; background-image: url('Naer_Wallpaper_by_Gravideo_Interactive.jpg');
    background-repeat: no-repeat; background-attachment:fixed; background-position: center">
<p>&nbsp;</p>
<table style="margin:0px auto; width:400px" align="center">
  <tr>
    <th width="33%" align="center" scope="row"><h2><center>Welcome To DannysList!</center></h2></th>
  </tr>
  <tr style="margin: 0">
    <td align="center" valign="top"><p>
    <form action="Login" name="mainform" method="post">
<!--     	<a class="btn btn-primary btn-lg" style="width:200px" id="login" href="checklogin.jsp">Login</a> -->
<!-- 		<p>&nbsp;</p> -->
<!-- 		<a class="btn btn-primary btn-lg" style="width:200px" id="register" href="#">Register</a> -->
<!-- 		<p>&nbsp;</p> -->
<!-- 		<a class="btn btn-primary btn-lg" style="width:200px" id="credits" href="#">Credits</a> -->
<!-- 		<p>&nbsp;</p> -->
<!-- 		<a class="btn btn-primary btn-lg" style="width:200px" id="about" href="#">About</a> -->
		<div class="input-group">
		<span class="input-group-addon">Username:</span>
  		<input type="text" class="form-control" name="username" id="username"><br />
  		</div>
		<br />
		<div class="input-group">
		<span class="input-group-addon">Password:</span>
  		<input type="password" class="form-control" name="password" id="password"><br />
  		</div>
  		<br />
  		<!-- http://met.guc.edu.eg/OnlineTutorials/JSP%20-%20Servlets/Full%20Login%20Example.aspx -->

  		<input type="submit" class="btn btn-primary btn-default" style="width:100px" id="login" value="Login" ></input>
		<a class="btn btn-primary btn-default" style="width:100px" id="register" href="registration.jsp">Register</a>
	</div>
	</form>
	</td>
</tr>
</table>
</body>
</html>