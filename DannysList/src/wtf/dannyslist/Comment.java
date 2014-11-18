package wtf.dannyslist;

public class Comment{
	
	int comment_id;
	String commentString;
	String usernameString;
	public Comment() {
		
	}
	
	public Comment(String commentSting, String usernameString){
		this.commentString = commentSting;
		this.usernameString = usernameString;
	}
	
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public String getCommentString() {
		return commentString;
	}
	public void setCommentString(String commentString) {
		this.commentString = commentString;
	}
	public String getUsernameString() {
		return usernameString;
	}
	public void setUsernameString(String usernameString ) {
		this.usernameString = usernameString;
	}
	
	
}
