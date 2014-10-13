package wtf.dannyslist;

import java.io.Serializable;


public class GameBean implements Serializable {
	private String nameString , platformIDInt, gengreString;
	private int yearInt;
	private double costDouble;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getPlatformIDInt() {
		return platformIDInt;
	}
	public void setPlatformIDInt(String platformIDInt) {
		this.platformIDInt = platformIDInt;
	}
	public String getGengreString() {
		return gengreString;
	}
	public void setGengreString(String gengreString) {
		this.gengreString = gengreString;
	}
	public int getYearInt() {
		return yearInt;
	}
	public void setYearInt(int yearInt) {
		this.yearInt = yearInt;
	}
	public double getCostDouble() {
		return costDouble;
	}
	public void setCostDouble(double costDouble) {
		this.costDouble = costDouble;
	}
}
