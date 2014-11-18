package wtf.dannyslist;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Community")
public class Community extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		//super.doGet(req, resp);
		Statement stmt = null;	
		
		String insertQuery = "INSERT INTO "+FinalStaticDatabaseInfo.comments_table+" ("+FinalStaticDatabaseInfo.Comments.username+", "+FinalStaticDatabaseInfo.Comments.comment+") VALUES ('" + req.getParameter("username") +"','"+ req.getParameter("comment") +"')";
		
		Connection connection = ConnectionManager.getConnection();
		
		try {
			stmt = connection.createStatement();
			stmt.executeUpdate(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("community.jsp");
	}
	
}
