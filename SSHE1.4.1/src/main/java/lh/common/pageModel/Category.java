package lh.common.pageModel;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import lh.common.entity.TshopGoods;
import lh.common.entity.TshopGoodsCategory;
import lh.common.entity.TshopGoodsType;

public class Category {
	private String id;
	private String typeId;
	private String note;
	private String categoryPath;
	private BigDecimal goodsCount;
	private BigDecimal categoryOrder;
	private String listShow;
	private String image;
	private String goodsIds;
	private String pid;
	private String parentName;
	private String categoryIds;
	private String categoryNames;
	private String _parentId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getCategoryPath() {
		return categoryPath;
	}
	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}
	public BigDecimal getGoodsCount() {
		return goodsCount;
	}
	public void setGoodsCount(BigDecimal goodsCount) {
		this.goodsCount = goodsCount;
	}
	public BigDecimal getCategoryOrder() {
		return categoryOrder;
	}
	public void setCategoryOrder(BigDecimal categoryOrder) {
		this.categoryOrder = categoryOrder;
	}
	public String getListShow() {
		return listShow;
	}
	public void setListShow(String listShow) {
		this.listShow = listShow;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getGoodsIds() {
		return goodsIds;
	}
	public void setGoodsIds(String goodsIds) {
		this.goodsIds = goodsIds;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(String categoryIds) {
		this.categoryIds = categoryIds;
	}
	public String getCategoryNames() {
		return categoryNames;
	}
	public void setCategoryNames(String categoryNames) {
		this.categoryNames = categoryNames;
	}
	public String get_parentId() {
		return _parentId;
	}
	public void set_parentId(String _parentId) {
		this._parentId = _parentId;
	}
	
}
