package wtf.dannyslist;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("item")
public class WalmartGame {
	
	@XStreamAlias("itemId")
	public String itemId;
	
	@XStreamAlias("parentItemId")
	public String parentItemId;
	
	@XStreamAlias("name")
	public String name;
	
	@XStreamAlias("msrp")
	public Double msrp;
	
	@XStreamAlias("salePrice")
	public Double salePrice;
	
	@XStreamAlias("upc")
	public String upc;
	
	@XStreamAlias("categoryPath")
	public String categoryPath;
	
	@XStreamAlias("shortDescription")
	public String shortDescription;
	
	@XStreamAlias("longDescription")
	public String longDescription;
	
	@XStreamAlias("thumbnailImage")
	public String thumbnailImage;
	
	@XStreamAlias("productTracingUrl")
	public String productTrackingUrl;
	
	@XStreamAlias("standardShipRate")
	public Double standardShipRate;
	
	@XStreamAlias("marketplace")
	public Boolean marketplace;
	
	@XStreamAlias("modelNumber")
	public String modelNumber;
	
	@XStreamAlias("productUrl")
	public String productUrl;
	
	@XStreamAlias("customerRating")
	public Double customerRating;
	
	@XStreamAlias("numReviews")
	public int numReviews;
	
	@XStreamAlias("customerRatingImage")
	public String customerRatingImage;
	
	@XStreamAlias("categoryNode")
	public String categoryNode;
	
	@XStreamAlias("bundle")
	public Boolean bundle;
	
	@XStreamAlias("addToCartUrl")
	public String addToCartUrl;
	
	@XStreamAlias("affiliateAddToCartUrl")
	public String affiliateAddToCartUrl;
	
	@XStreamAlias("availableOnline")
	public Boolean availableOnline;

	public String getName() {
		return name;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

}
