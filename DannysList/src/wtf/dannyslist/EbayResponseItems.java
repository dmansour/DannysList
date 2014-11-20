package wtf.dannyslist;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("searchResult")
public class EbayResponseItems {
	

	
	@XStreamImplicit(itemFieldName="item")
	public List<EbayGame> items;
	
	
	public List<EbayGame> getWalmartList() {
		return items;
	}

}
