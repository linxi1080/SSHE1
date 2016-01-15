package lh.common.pageModel;

import java.util.HashSet;
import java.util.Set;

import lh.common.entity.TshopGoods;
import lh.common.entity.TshopGoodsCategory;

public class Type {
	private String id;
	private String note;
	private String props;
	private String params;
	private String disabled;
	private String haveProp;
	private String haveParm;
	private String joinBrand;
	private String categoryIds ;
	private String goodsIds;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getProps() {
		return props;
	}
	public void setProps(String props) {
		this.props = props;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getDisabled() {
		return disabled;
	}
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}
	public String getHaveProp() {
		return haveProp;
	}
	public void setHaveProp(String haveProp) {
		this.haveProp = haveProp;
	}
	public String getHaveParm() {
		return haveParm;
	}
	public void setHaveParm(String haveParm) {
		this.haveParm = haveParm;
	}
	public String getJoinBrand() {
		return joinBrand;
	}
	public void setJoinBrand(String joinBrand) {
		this.joinBrand = joinBrand;
	}
	public String getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(String categoryIds) {
		this.categoryIds = categoryIds;
	}
	public String getGoodsIds() {
		return goodsIds;
	}
	public void setGoodsIds(String goodsIds) {
		this.goodsIds = goodsIds;
	}
	
}
