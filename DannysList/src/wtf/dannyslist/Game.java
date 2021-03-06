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
	
	public String getGuid() {
		return guid;
	}

	public String getLink() {
		return link;
	}

	public String getCategory() {
		return category;
	}
	
	public int getYear() {
		return Integer.parseInt(pubDate.substring(12,16));
	}

	public String gamePrice() {
		String price = description.substring(description.indexOf("Price") + 11, description.indexOf("<b>ETA:</b>")-1);
		
		return price;
	}

}
