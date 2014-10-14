
<%@ page import="wtf.dannyslist.GameBean" %>
<%@ page import="java.util.ArrayList"  %>
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
<p>&nbsp;
Search Results 
<br>
<%
        ArrayList<GameBean> gameBeanArrayList = (ArrayList<GameBean>) request.getSession().getAttribute("gameBeanArrayList");
		if (gameBeanArrayList.size() > 0){
			for(GameBean gameBean: gameBeanArrayList){
				out.println("Game Name : "+gameBean.getNameString() + "<br>");
				out.println("Link : <a href=\""+gameBean.getLinkString()+ "\" target=\"_blank\">buy it here</a><br>");
				out.println("Year : "+gameBean.getYearInt()+ "<br>");
				out.println("Cost : $"+gameBean.getCostDouble()+ "<br><br>");
			}
		}else{
			out.println("No games found: try searching got \"Dr. Im\" ");
		}

    %>
    
<!-- Congratulations <%= session.getAttribute("username") %>, welcome to the Member's Page! 
-->
</body>
</html>