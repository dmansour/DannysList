package wtf.dannyslist;

import java.text.*;
import java.util.*;
import java.sql.*;
/**GameDAO
 * This class helps with database access related to the Game table. 
 * @author Aflynch
 *
 */
public class GameDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;
	
	/**findGame
	 * This method searches for games with the same name as the name 
	 * given to in the GameBean object that is passed into this method as
	 * an argument. 
	 * 
	 * @param gameBeanArrayList
	 * This variable acts as a pointer to the ArrayList<GameBean> that will hold the 
	 * result of the search.
 	 * @param gameBean
 	 * This variable holds the name of the game that will be searched for.
	 * @return void 
	 */
	public static void findGame(ArrayList<GameBean> gameBeanArrayList, GameBean gameBean){
			String queryString = "SELECT "
			+FinalStaticDatabaseInfo.Games.name +" , "
			+ FinalStaticDatabaseInfo.Games.genres + " , " 
			+ FinalStaticDatabaseInfo.Games.year + " , "
			+ FinalStaticDatabaseInfo.Games.cost + " "
			+ " FROM "+FinalStaticDatabaseInfo.games_table+ 
			" WHERE "+FinalStaticDatabaseInfo.Games.name + " = \""+  gameBean.getNameString() + "\";";		
			
		Connection connection = ConnectionManager.getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(queryString);
			while(resultSet.next()){
				GameBean resultGameBean = new GameBean();
				resultGameBean.setNameString(resultSet.getString(FinalStaticDatabaseInfo.Games.name));
				resultGameBean.setGengreString(resultSet.getString(FinalStaticDatabaseInfo.Games.genres));
				resultGameBean.setYearInt(Integer.parseInt(resultSet.getString(FinalStaticDatabaseInfo.Games.year)));
				resultGameBean.setCostDouble(Double.parseDouble(resultSet.getString(FinalStaticDatabaseInfo.Games.cost)));
				gameBeanArrayList.add(resultGameBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
