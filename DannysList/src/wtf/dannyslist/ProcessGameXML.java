package wtf.dannyslist;

import java.io.File;
import java.util.List;
 

import com.thoughtworks.xstream.XStream;

public class ProcessGameXML {
	
	public static void main(String[] args) {
		XStream xstream = new XStream();
		xstream.processAnnotations(GameList.class);
		
		Object obj = xstream.fromXML(new File("gamelistfeed.xml"));
		
		GameList gs = (GameList) obj;
		
		List<Game> games = gs.getGames();
		Game game1 = games.get(1);
		
		System.out.println(game1.getTitle());
	}

}
