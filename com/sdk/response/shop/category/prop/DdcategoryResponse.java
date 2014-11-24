package com.dangdang.sdk.response.shop.category.prop;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.dangdang.sdk.response.shop.BaseResponse;

@XmlRootElement(name = "response")
public class DdcategoryResponse extends BaseResponse {

	private List<CategoryInfo> categoryInfos;

	@XmlElementWrapper(name = "DDCategory")
	@XmlElement(name = "CategoryInfo")
	public List<CategoryInfo> getCategoryInfos() {
		return categoryInfos;
	}

	public void setCategoryInfos(List<CategoryInfo> categoryInfos) {
		this.categoryInfos = categoryInfos;
	}

}
