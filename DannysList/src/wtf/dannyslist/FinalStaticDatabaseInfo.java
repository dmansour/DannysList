package wtf.dannyslist;

/** FinalStaticDatabaseInfo
 *  This class is a representation of the database. It is good for accessing the database 
 *  without an ORM e.g. String sqlQueryString  = "SELECT "+ FinalStaticDatabaseInfe.Games.year + " FROM "
 *  + FinalStaticDataBaseInfo.games_table; 
 *  
 *  Or for using your IDE to see quickly what tables and fields are in your database.
 */
public class FinalStaticDatabaseInfo {
	final static String database = "dannyslist";
	final static String users_table = "Users";
	final static String platforms_table = "Platforms";
	final static String games_table = "games";
	
	class UsersTable{
		final static String username = "username";
		final static String password = "password";
	}
	
	class Platforms{
		final static String platformID = "platform_id";
		final static String platform = "platform";
	}
	
	class Games{
		final static String name = "name";
		final static String platformID = "platform_id";
		final static String genres = "genres";
		final static String year = "year";
		final static String cost = "cost";
	}
}