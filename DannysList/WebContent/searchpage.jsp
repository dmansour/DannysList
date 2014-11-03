<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<head>
<title>Search Page</title>
<nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav nav-pills" style="text-align: center; padding-top: 10px; padding-bottom: 10px" role="navigation">
      	<li><a class="navbar-brand" href="#"><font color="#428bca">DannysList</font></a></li>
        <li style="width: 150px"><a href="#"><font color="#428bca">Home</font></a></li>
        <li style="width: 150px"><a href="#"><font color="#428bca">Search</font></a></li>
        <li style="width: 150px"><a href="/DannysList/about.jsp" ><font color="#428bca">About</font></a>
        <li style="width: 150px"><a href="#"><font color="#428bca">Credits</font></a>
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
<body style="background-color: #efefff;">
<div id="container" style="width: 1024px; margin: auto; margin-top: 0px">
	<div style="float: left; width: 864px; margin: auto; background-color: #efeffff">
	<h2><center>Search Results</center></h2>
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
		<tr>
		<td colspan="4"><div class="" style="text-align: center">  
<script type='text/javascript'>
 amzn_assoc_ad_type = 'banner';
 amzn_assoc_tracking_id = 'danslis-20';
 amzn_assoc_marketplace = 'amazon';
 amzn_assoc_region = 'US';
 amzn_assoc_placement = 'assoc_banner_placement_default';
 amzn_assoc_linkid = 'TKW7QXG3QZZC67DQ';
 amzn_assoc_campaigns = 'videogames';
 amzn_assoc_p = '48';
 amzn_assoc_banner_type = 'category';
 amzn_assoc_isresponsive = 'false';
 amzn_assoc_banner_id = '03XX10Q1NZN7VPMSY702';
 amzn_assoc_width = '728';
 amzn_assoc_height = '90';
</script>
<script src='//z-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&Operation=GetScript&ID=OneJS&WS=1'></script>
</div>
</tr>
	</table>
	</div>
	<div id="rightside" style="float: left; width: 160px; background-color: #ef8f8f">
	<script charset="utf-8" type="text/javascript">
amzn_assoc_ad_type = "responsive_search_widget";
amzn_assoc_tracking_id = "danslis-20";
amzn_assoc_link_id = "BHZ5KG2DGHAVJHIA";
amzn_assoc_marketplace = "amazon";
amzn_assoc_region = "US";
amzn_assoc_placement = "";
amzn_assoc_search_type = "search_widget";
amzn_assoc_width = 160;
amzn_assoc_height = 600;
amzn_assoc_default_search_category = "VideoGames";
amzn_assoc_default_search_key = "";
amzn_assoc_theme = "light";
amzn_assoc_bg_color = "FFFFFF";
</script>
<script src="//z-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&Operation=GetScript&ID=OneJS&WS=1&MarketPlace=US"></script>
	</div>
</div>
</body>
</html>