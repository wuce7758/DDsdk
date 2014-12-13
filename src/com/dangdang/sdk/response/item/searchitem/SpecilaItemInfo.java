package com.dangdang.sdk.response.item.searchitem;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SpecilaItemInfo")
public class SpecilaItemInfo {

	private String specialAttributeClass;
	private String specialAttribute;
	private String specialAttributeSeq;
	private String stockCount;
	private String unitPrice;
	private String outerItemID;
	private String subItemID;
	private String itemPic;

	public String getSpecialAttributeClass() {
		return specialAttributeClass;
	}

	public void setSpecialAttributeClass(String specialAttributeClass) {
		this.specialAttributeClass = specialAttributeClass;
	}

	public String getSpecialAttribute() {
		return specialAttribute;
	}

	public void setSpecialAttribute(String specialAttribute) {
		this.specialAttribute = specialAttribute;
	}

	public String getSpecialAttributeSeq() {
		return specialAttributeSeq;
	}

	public void setSpecialAttributeSeq(String specialAttributeSeq) {
		this.specialAttributeSeq = specialAttributeSeq;
	}

	public String getStockCount() {
		return stockCount;
	}

	public void setStockCount(String stockCount) {
		this.stockCount = stockCount;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getOuterItemID() {
		return outerItemID;
	}

	public void setOuterItemID(String outerItemID) {
		this.outerItemID = outerItemID;
	}

	public String getSubItemID() {
		return subItemID;
	}

	public void setSubItemID(String subItemID) {
		this.subItemID = subItemID;
	}

	public String getItemPic() {
		return itemPic;
	}

	public void setItemPic(String itemPic) {
		this.itemPic = itemPic;
	}

}
