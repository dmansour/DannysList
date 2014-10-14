package wtf.dannyslist;

import java.io.Serializable;

/**GameBean 
 * This class is an object representation of a game that is also a java been
 * 
 * @author Aflynch
 *
 */
public class GameBean implements Serializable {
	private String nameString , platformIDInt, linkString;
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
	public String getLinkString() {
		return linkString;
	}
	public void setLinkString(String linkString) {
		this.linkString = linkString;
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
