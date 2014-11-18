package wtf.dannyslist;

/** FinalStaticDatabaseInfo
 *  This class is a representation of the database. It is good for accessing the database 
 *  without an ORM e.g. String sqlQueryString  = "SELECT "+ FinalStaticDatabaseInfe.Games.year + " FROM "
 *  + FinalStaticDataBaseInfo.games_table; 
 *  
 *  Or for using your IDE to see quickly what tables and fields are in your database.
 */
public class FinalStaticDatabaseInfo {
	public final static String database = "dannyslist";
	public final static String users_table = "Users";
	public final static String platforms_table = "Platforms";
	public final static String games_table = "Games";
	public final static String comments = "Comments";
	
	public static class UsersTable{
		public final static String username = "username";
		public final static String password = "password";
	}
	
	public static class Platforms{
		public final static String platformID = "platform_id";
		public final static String platform = "platform";
	}
	
	public static class Games{
		public final static String name = "name";
		public final static String platformID = "platform_id";
		public final static String link = "link";
		public final static String year = "year";
		public final static String cost = "cost";
	}
	
	public static class Comments{
		public final static String comment_id = "comment_id";
		public final static String comment = "comment";
		public final static String username = "username";
	}
}