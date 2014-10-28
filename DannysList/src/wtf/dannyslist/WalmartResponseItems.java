package wtf.dannyslist;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("items")
public class WalmartResponseItems {
	

	
	@XStreamImplicit(itemFieldName="item")
	public List<WalmartGame> items;
	
	
	public List<WalmartGame> getWalmartList() {
		return items;
	}

}
