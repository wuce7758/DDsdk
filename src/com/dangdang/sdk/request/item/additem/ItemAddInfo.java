package com.dangdang.sdk.request.item.additem;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemAddInfo")
public class ItemAddInfo {

	private String itemBarcode;
	private String itemName;
	private String itemSubhead;
	private String ClassificationCode1;
	private String ClassificationCode2;
	private String brand;
	private String model;
	private String attribute;
	private String itemDetail;
	private String stockPrice;
	private String marketPrice;
	private String vipPriceType;
	private String shopCategoryID1;
	private String shopCategoryID2;
	private String shopCategoryID3;
	private String shopCategoryID4;
	private String shopCategoryID5;
	private String itemState;
	private String is_cod;
	private String postage;
	private String outerItemID;
	private String unitPrice;
	private String stockCount;
	private String bestPartnerList;
	private String isSubsidy;
	private String subsidyAmount;
	private String volume;
	private String weight;
	private String templateName;
	private List<ItemSkuAddInfo> itemSkuAddInfos;

	@XmlElement(name = "SpecilaItemInfo")
	public List<ItemSkuAddInfo> getItemSkuAddInfos() {
		return itemSkuAddInfos;
	}

	public void setItemSkuAddInfos(List<ItemSkuAddInfo> itemSkuAddInfos) {
		this.itemSkuAddInfos = itemSkuAddInfos;
	}

	public String getItemBarcode() {
		return itemBarcode;
	}

	public void setItemBarcode(String itemBarcode) {
		this.itemBarcode = itemBarcode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemSubhead() {
		return itemSubhead;
	}

	public void setItemSubhead(String itemSubhead) {
		this.itemSubhead = itemSubhead;
	}

	public String getClassificationCode1() {
		return ClassificationCode1;
	}

	public void setClassificationCode1(String classificationCode1) {
		ClassificationCode1 = classificationCode1;
	}

	public String getClassificationCode2() {
		return ClassificationCode2;
	}

	public void setClassificationCode2(String classificationCode2) {
		ClassificationCode2 = classificationCode2;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}

	public String getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getVipPriceType() {
		return vipPriceType;
	}

	public void setVipPriceType(String vipPriceType) {
		this.vipPriceType = vipPriceType;
	}

	public String getShopCategoryID1() {
		return shopCategoryID1;
	}

	public void setShopCategoryID1(String shopCategoryID1) {
		this.shopCategoryID1 = shopCategoryID1;
	}

	public String getShopCategoryID2() {
		return shopCategoryID2;
	}

	public void setShopCategoryID2(String shopCategoryID2) {
		this.shopCategoryID2 = shopCategoryID2;
	}

	public String getShopCategoryID3() {
		return shopCategoryID3;
	}

	public void setShopCategoryID3(String shopCategoryID3) {
		this.shopCategoryID3 = shopCategoryID3;
	}

	public String getShopCategoryID4() {
		return shopCategoryID4;
	}

	public void setShopCategoryID4(String shopCategoryID4) {
		this.shopCategoryID4 = shopCategoryID4;
	}

	public String getShopCategoryID5() {
		return shopCategoryID5;
	}

	public void setShopCategoryID5(String shopCategoryID5) {
		this.shopCategoryID5 = shopCategoryID5;
	}

	public String getItemState() {
		return itemState;
	}

	public void setItemState(String itemState) {
		this.itemState = itemState;
	}

	public String getIs_cod() {
		return is_cod;
	}

	public void setIs_cod(String is_cod) {
		this.is_cod = is_cod;
	}

	public String getPostage() {
		return postage;
	}

	public void setPostage(String postage) {
		this.postage = postage;
	}

	public String getOuterItemID() {
		return outerItemID;
	}

	public void setOuterItemID(String outerItemID) {
		this.outerItemID = outerItemID;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getStockCount() {
		return stockCount;
	}

	public void setStockCount(String stockCount) {
		this.stockCount = stockCount;
	}

	public String getBestPartnerList() {
		return bestPartnerList;
	}

	public void setBestPartnerList(String bestPartnerList) {
		this.bestPartnerList = bestPartnerList;
	}

	public String getIsSubsidy() {
		return isSubsidy;
	}

	public void setIsSubsidy(String isSubsidy) {
		this.isSubsidy = isSubsidy;
	}

	public String getSubsidyAmount() {
		return subsidyAmount;
	}

	public void setSubsidyAmount(String subsidyAmount) {
		this.subsidyAmount = subsidyAmount;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
