<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>DannysList Portal</title>
</head>
<style>
a {
	text-decoraton: none;
	color:#F96;
}
</style>
<body style="background-color: #efefef; background-image: url('Naer_Wallpaper_by_Gravideo_Interactive.jpg');
    background-repeat: no-repeat; background-attachment:fixed; background-position: center">
<p>&nbsp;</p>
<!--
Congratulations <%= session.getAttribute("username") %>, search for something... Now!! -->
<br> 
	<form method="get" action="SearchEngine">
	<p> Search for a game <br>
	<p> Hint try "Dr. Im" <br>
	name <input type="text" name="name"/>
	<br>
	<input type="submit" value="submit"/>
	</form>
</body>
</html>