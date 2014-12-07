<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ page import="wtf.dannyslist.*"%>
<%@ page session="true"%>
<%@ page import="javax.servlet.http.HttpSession" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<head>
<title>Search Page</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"s></script>
<script src="res/loader.jsp"></script>
</head>
<body style="background-color: #efefef;">

	<% 
		DecimalFormat df = new DecimalFormat("###.##");
		String queryString = "SELECT * FROM users";
		Connection connection = ConnectionManager.getConnection();
		
		String query = "SELECT "
				+ FinalStaticDatabaseInfo.Games.name +" , "
				+ FinalStaticDatabaseInfo.Games.link + " , " 
				+ "source" + " , "
				+ "newest_order" + " , "
				+ FinalStaticDatabaseInfo.Games.cost
				+ " FROM " + FinalStaticDatabaseInfo.games_table
				+ " ORDER BY " + " newest_order DESC LIMIT 6;";
				
		Statement statement = connection.createStatement();
		
		ResultSet results = statement.executeQuery(query);
		
		ArrayList<GameBean> gbal = (ArrayList<GameBean>) session.getAttribute("search_array");
		if(gbal == null){
			
		
		ArrayList<GameBean> gameBeanArrayList = new ArrayList<GameBean>();
		
		while (results.next()) {
			GameBean resultGameBean = new GameBean();
			resultGameBean.setNameString(results.getString(FinalStaticDatabaseInfo.Games.name));
			resultGameBean.setLinkString(results.getString(FinalStaticDatabaseInfo.Games.link));
			resultGameBean.setSource(results.getString("source"));
			resultGameBean.setCostDouble(Double.parseDouble(results.getString(FinalStaticDatabaseInfo.Games.cost)));
			gameBeanArrayList.add(resultGameBean);
		}
		
		%>
		
		<div class="index_table" style="width: 75%; margin: auto">
		<table class="table table-bordered">
			<tr style="background-color: #FFF; color: #428bca">
				<th style="text-align: center">Name</th>
				<th style="text-align: center">Source</th>
				<th style="text-align: center">Price</th>
			</tr>
			<% for (int i = 0; i < gameBeanArrayList.size(); i++) { %>
			<tr>
				<td><center>
						<a
							href=" <% out.print(gameBeanArrayList.get(i).getLinkString()); %> "
							target="_blank">
							<% out.print(gameBeanArrayList.get(i).getNameString()); %>
						</a>
					</center></td>
				<td><center>
						<% out.print(gameBeanArrayList.get(i).getSource()); %>
					</center></td>
				<td><center>
						<% out.print("$" + df.format(gameBeanArrayList.get(i).getCostDouble())); %>
					</center></td>
			</tr>
			<%} } else {%>
				<div class="index_table" style="width: 75%; margin: auto">
		<table class="table table-bordered">
			<tr style="background-color: #FFF; color: #428bca">
				<th style="text-align: center">Name</th>
				<th style="text-align: center">Source</th>
				<th style="text-align: center">Price</th>
			</tr>
			<% for (int i = 0; i < gbal.size(); i++) { %>
			<tr>
				<td><center>
						<a
							href=" <% out.print(gbal.get(i).getLinkString()); %> "
							target="_blank">
							<% out.print(gbal.get(i).getNameString()); %>
						</a>
					</center></td>
				<td><center>
						<% out.print(gbal.get(i).getSource()); %>
					</center></td>
				<td><center>
						<% out.print("$" + df.format(gbal.get(i).getCostDouble())); %>
					</center></td>
			</tr>
			<%} }%>
		</table>
	</div>
</body>
</html>