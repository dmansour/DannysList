package wtf.dannyslist;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CommentDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;
	
	public static void addComment(CommentBean commentBean){
		
		String commentString = commentBean.getCommentString();
		String usernameString = commentBean.getUsernameString();
		
		Statement stmt = null;
		
		String insertQuery = "INSERT INTO "+FinalStaticDatabaseInfo.comments_table+" ("+FinalStaticDatabaseInfo.Comments.username+","+ FinalStaticDatabaseInfo.Comments.comment+") VALUES ('" + usernameString + "','" + commentString +"');";
		
		Connection connection = ConnectionManager.getConnection();
		
		try {
			stmt = connection.createStatement();
			stmt.executeUpdate(insertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getAllComments(ArrayList<CommentBean> commentBeanArrayList){
		String queryString = "SELECT "
		+ FinalStaticDatabaseInfo.Comments.comment + ","
		+ FinalStaticDatabaseInfo.Comments.comment_id + ","
		+ FinalStaticDatabaseInfo.Comments.username 
		+ " FROM " 
		+ FinalStaticDatabaseInfo.comments_table
		+ " ORDER BY "+FinalStaticDatabaseInfo.Comments.comment_id+" DESC;";
		
		Connection connection = ConnectionManager.getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(queryString);
			while(resultSet.next()){
				CommentBean resultCommentBean = new CommentBean();
				resultCommentBean.setComment_id(Integer.parseInt(resultSet.getString(FinalStaticDatabaseInfo.Comments.comment_id)));
				resultCommentBean.setCommentString(resultSet.getString(FinalStaticDatabaseInfo.Comments.comment));
				resultCommentBean.setUsernameString(resultSet.getString(FinalStaticDatabaseInfo.Comments.username));
				commentBeanArrayList.add(resultCommentBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
