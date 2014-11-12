<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="wtf.dannyslist.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<title>DannysList</title>
<head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"s></script>
<script src="res/loader.jsp"></script>
</head>

<body style="background-color: #efefef;">
		
		<% 
	
		String queryString = "SELECT * FROM users";
		Connection connection = ConnectionManager.getConnection();
		
		String query = "SELECT "
				+FinalStaticDatabaseInfo.Games.name +" , "
				+ FinalStaticDatabaseInfo.Games.link + " , " 
				+ FinalStaticDatabaseInfo.Games.year + " , "
				+ FinalStaticDatabaseInfo.Games.cost + " "
				+ " FROM "+FinalStaticDatabaseInfo.games_table + 
				" LIMIT " + " 5 " + " ;";
				
				
		Statement statement = connection.createStatement();
		
		ResultSet results = statement.executeQuery(query);
		
		ArrayList<GameBean> gameBeanArrayList = new ArrayList<GameBean>();
		
		while (results.next()) {
			GameBean resultGameBean = new GameBean();
			resultGameBean.setNameString(results.getString(FinalStaticDatabaseInfo.Games.name));
			resultGameBean.setLinkString(results.getString(FinalStaticDatabaseInfo.Games.link));
			resultGameBean.setYearInt(Integer.parseInt(results.getString(FinalStaticDatabaseInfo.Games.year)));
			resultGameBean.setCostDouble(Double.parseDouble(results.getString(FinalStaticDatabaseInfo.Games.cost)));
			gameBeanArrayList.add(resultGameBean);
		}
			
		%>
		
		<div class="jumbotron" style="background-color: #428bca; color: #FFF"; margin:0px">
			
		<div class="right-bar" style="float: right">
			<a href="login.jsp" style="color: #FFF; padding: 30px">Login</a>
			<a href="registration.jsp" style="color: #FFF; padding: 30px">Register</a>
		</div>
			<br /><br />
  			<center><h1>Welcome To DannysList!</h1></center>
  			<br />
  			<center><p>This is sample text. The text will be added here later...</p></center>
  		</div>
  			<h2><center>Awesome Deals!!!</center></h2>
  			<p><center>Check out the latest deals on our website below!</center></p>
  			<br />
  		<div class="index_table" style="width: 50%; margin: auto">
  				<table class="table table-bordered">
  					<tr style="background-color: #FFF; color: #428bca">
						<th style="text-align: center">Name</th>
						<th style="text-align: center">Description</th>
						<th style="text-align: center">Price</th>
					</tr>
					<% for (int i = 0; i < gameBeanArrayList.size(); i++) { %>
					<tr>
						<td><center>
							<% out.print(gameBeanArrayList.get(i).getNameString()); %>
						</center></td>
						<td><center>
							<% out.print(gameBeanArrayList.get(i).getLinkString()); %></center></td>
						<td><center><% out.print("$" + gameBeanArrayList.get(i).getCostDouble()); %></center></td>
					</tr>
					<%} %>
				</table>
			</div>
<!-- 				<table class="table table-bordered" style="margin-left: auto; margin-right: auto"> -->
<!-- 					<tr style="background-color: #FFF; color: #428bca"> -->
<!-- 						<th style="text-align: center">Walmart</th> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 1</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 2</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 3</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 4</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 5</center></td> -->
<!-- 					</tr> -->
<!-- 				</table> -->
<!-- 			</div> -->
			
<!-- 			<div class
="col-md-4"> -->
<!-- 				<table class="table table-bordered" style="margin-left: auto; margin-right: auto"> -->
<!-- 					<tr style="background-color: #FFF; color: #428bca"> -->
<!-- 						<th style="text-align: center">GameStop</th> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 1</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 2</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 3</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 4</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 5</center></td> -->
<!-- 					</tr> -->
<!-- 				</table> -->
<!-- 			</div> -->
			
<!-- 			<div class="col-md-4"> -->
<!-- 				<table class="table table-bordered" style="margin-left: auto; margin-right: auto"> -->
<!-- 					<tr style="background-color: #FFF; color: #428bca"> -->
<!-- 						<th style="text-align: center">Other</th> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 1</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 2</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 3</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 4</center></td> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<td><center>Game 5</center></td> -->
<!-- 					</tr> -->
<!-- 				</table> -->
<!-- 			</div> -->
		</div>
</body>
</html>