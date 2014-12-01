package wtf.dannyslist;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("searchresponse")
public class WalmartSearchResponse {
	
	@XStreamAlias("query")
	public String query;
	
	@XStreamAlias("sort")
	public String sort;
	
	@XStreamAlias("responseGroup")
	public String responseGroup;
	
	@XStreamAlias("totalResults")
	public int totalResults;
	
	@XStreamAlias("start")
	public int start;
	
	@XStreamAlias("numItems")
	public int numItems;
	
	@XStreamAlias("facets")
	public String facets;
	
	@XStreamAlias("message")
	public String message;
	
	@XStreamAlias("items")
	public WalmartResponseItems items;
	
	public WalmartResponseItems getItemsList() {
		return items;
	}

}
