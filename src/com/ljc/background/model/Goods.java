package com.ljc.background.model;
/**
 * ��Ʒ����
 * @author scxh
 *
 */
public class Goods {
	private String id;
	private String name;
	private String type_id;
	private double price;
	private int amount;//����
	private String remark;//����
	private String small_pic;//��ƷСͼ
	private String big_pic;//��Ʒ��ͼ
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType_id() {
		return type_id;
	}
	public void setType_id(String typeId) {
		type_id = typeId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSmall_pic() {
		return small_pic;
	}
	public void setSmall_pic(String smallPic) {
		small_pic = smallPic;
	}
	public String getBig_pic() {
		return big_pic;
	}
	public void setBig_pic(String bigPic) {
		big_pic = bigPic;
	}
	
}
