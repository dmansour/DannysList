package wtf.dannyslist;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class ProcessGameXML {
	
	public static void main(String[] args) {
		XStream xstream = new XStream();
		xstream.processAnnotations(GameList.class);
		
		Object obj = xstream.fromXML(new File("gamelistfeed.xml"));
		
		GameList gs = (GameList) obj;
		
		List<Game> games = gs.getGames();
		Iterator it = games.iterator();
		while(it.hasNext()){
			GameBean gb = new GameBean();
			
			Game game = (Game) it.next();
			gb.setCostDouble(Double.parseDouble(game.gamePrice().trim().substring(1)));
			gb.setLinkString(game.getLink());
			gb.setPlatformIDInt("1");
			gb.setNameString(game.getTitle());
			gb.setYearInt(game.getYear());
			GameDAO.addGame(gb);
			//System.out.println(gb.getCostDouble());
		}
		
		
	}

}
