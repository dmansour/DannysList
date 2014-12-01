package wtf.dannyslist;

import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("item")
public class EbayGame {
	
	
	@XStreamAlias("itemId")
	public String itemId;
	
	@XStreamAlias("title")
	public String title;
	
	@XStreamAlias("globalId")
	public String name;
	
	@XStreamAlias("subtitle")
	public String msrp;
	
	@XStreamImplicit(itemFieldName = "primaryCategory")
	public ArrayList<PrimaryCategory> salePrice;
	
	@XStreamAlias("galleryURL")
	public String upc;
	
	@XStreamAlias("viewItemURL")
	public String viewItemURL;
	
	@XStreamAlias("productId")
	public String productId;
	
	//@XStreamAlias("paymentMethod")
	//public String shortDescription;
	
	@XStreamImplicit(itemFieldName="paymentMethod")
	public ArrayList<String> shorts;
	
	@XStreamAlias("autoPay")
	public Boolean longDescription;
	
	@XStreamAlias("postalCode")
	public String postalCode;
	
	@XStreamAlias("location")
	public String thumbnailImage;
	
	@XStreamAlias("country")
	public String productTrackingUrl;
	
	@XStreamImplicit(itemFieldName = "shippingInfo")
	public ArrayList<ShippingInfo> standardShipRate;
	
	@XStreamImplicit(itemFieldName = "sellingStatus")
	public ArrayList<SellingStatus> sss;
	
	@XStreamImplicit(itemFieldName = "listingInfo")
	public ArrayList<ListingInfo> modelNumber;
	
	@XStreamAlias("returnsAccepted")
	public Boolean returnsAccepted;
	
	@XStreamImplicit(itemFieldName ="condition")
	public ArrayList<Condition> customerRating;
	
	@XStreamAlias("isMultiVariationListing")
	public Boolean numReviews;
	
	@XStreamImplicit(itemFieldName = "discountPriceInfo")
	public ArrayList<Discounted> customerRatingImage;
	
	@XStreamAlias("topRatedListing")
	public Boolean topRatedListing;
	
	@XStreamAlias("galleryPlusPictureURL")
	public String gppurl;
	
	public String getURL() {
		return viewItemURL;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Double getPrice() {
		return sss.get(0).getCurrentPrice();
	}
	
	class PrimaryCategory {
		
		@XStreamAlias("categoryId")
		public String catId;
		
		@XStreamAlias("categoryName")
		public String categoryName;
	}
	
	
	
	@XStreamAlias("sellingStatus")
	class SellingStatus {
		
		@XStreamAlias("currentPrice")
		public Double currentPrice;
		
		@XStreamAlias("convertedCurrentPrice")
		public Double convertedCurrentPrice;
		
		@XStreamAlias("sellingState")
		public String sellingState;
		
		@XStreamAlias("timeLeft")
		public String timeLeft;
		
		@XStreamAlias("bidCount")
		public int bidCount;
		
		public Double getCurrentPrice() {
			return currentPrice;
		}
		
	}
	
	@XStreamAlias("shippingInfo")
	class ShippingInfo {
		
		@XStreamAlias("shippingServiceCost")
		private Double shippingServiceCost;
		
		@XStreamAlias("shippingType")
		private String shippingType;
		
		@XStreamImplicit(itemFieldName = "shipToLocations")
		private ArrayList<String> shipto;
		
		@XStreamAlias("expeditedShipping")
		private String expedi;
		
		@XStreamAlias("oneDayShippingAvailable")
		public Boolean oneday;
		
		
		@XStreamAlias("handlingTime")
		private int handling;
		
		
	}
	
	@XStreamAlias("listingInfo")
	class ListingInfo {
		
		@XStreamAlias("bestOfferEnabled")
		public Boolean bestOffer;
		
		@XStreamAlias("buyItNowAvailable")
		public Boolean buyitnow;
		
		@XStreamAlias("buyItNowPrice")
		public double buyitnowprice;
		
		@XStreamAlias("startTime")
		public String start;
		
		@XStreamAlias("endTime")
		public String end;
		
		@XStreamAlias("listingType")
		public String type;
		
		@XStreamAlias("gift")
		public Boolean gift;
	}
	
	@XStreamAlias("condition")
	class Condition {
		
		@XStreamAlias("conditionId")
		public int conId;
		
		@XStreamAlias("conditionDisplayName")
		public String conName;
	}
	
	@XStreamAlias("discountedPriceInfo")
	class Discounted {
		
		@XStreamAlias("originalRetailPrice")
		public Double retail;
		
		@XStreamAlias("pricingTreatment")
		public String treatment;
		
		@XStreamAlias("soldOnEbay")
		public Boolean onEbay;
		
		@XStreamAlias("soldOffEbay")
		public Boolean offEbay;
	}

}
