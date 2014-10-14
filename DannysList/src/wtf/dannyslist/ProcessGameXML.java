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
			Game game = (Game) it.next();
			System.out.println(game.getTitle() + ": " + game.gamePrice().trim());
		}
		
		
	}

}
