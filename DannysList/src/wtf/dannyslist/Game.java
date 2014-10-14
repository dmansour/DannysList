package wtf.dannyslist;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("item")
public class Game {
	
	
	
	@XStreamAlias("guid isPermaLink=\"false\"")
	private String guid;
	
	@XStreamAlias("link")
	private String link;

	@XStreamAlias("category")
	private String category;
	
	@XStreamAlias("title")
	private String title;
	
	@XStreamAlias("description")
	private String description;
	
	@XStreamAlias("pubDate")
	private String pubDate;
	
	public String getTitle() {
		return title;
	}
	
	public String gamePrice() {
		String price = description.substring(description.indexOf("Price") + 11, description.indexOf("<b>ETA:</b>")-1);
		
		return price;
	}

}
