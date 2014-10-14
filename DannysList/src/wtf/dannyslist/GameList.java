package wtf.dannyslist;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("channel")
public class GameList {
	
	
	
	@XStreamImplicit(itemFieldName="item")
	private List<Game> gameslist;
	
	
	public List<Game> getGames() {
		return gameslist;
	}

}
