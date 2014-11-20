package wtf.dannyslist;

import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("findItemsByKeywordsResponse")
public class EbaySearchResponse {
	
	@XStreamAlias("ack")
	public String query;
	
	@XStreamAlias("version")
	public String sort;
	
	@XStreamAlias("timestamp")
	public String responseGroup;
	
	@XStreamAlias("searchResult")
	public EbayResponseItems items;
	
	@XStreamImplicit(itemFieldName ="paginationOutput")
	public ArrayList<Pages> pagi;
	
	@XStreamAlias("itemSearchURL")
	public String itemSearchURL;
	
	public EbayResponseItems getItemsList() {
		return items;
	}
	
	@XStreamAlias("paginationOutput")
	class Pages {
		
		@XStreamAlias("pageNumber")
		public int pageNum;
		
		@XStreamAlias("entriesPerPage")
		public int entries;
		
		@XStreamAlias("totalPages")
		public int pages;
		
		@XStreamAlias("totalEntries")
		public int total;
	}

}
