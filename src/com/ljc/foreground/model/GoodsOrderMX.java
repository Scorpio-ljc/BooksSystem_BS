package com.ljc.foreground.model;

public class GoodsOrderMX {
	private String id;
	private String goods_id;//��Ʒ���
	private String order_id;//�������
	private int amount;//���������
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goodsId) {
		goods_id = goodsId;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String orderId) {
		order_id = orderId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
