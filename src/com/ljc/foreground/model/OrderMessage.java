package com.ljc.foreground.model;

public class OrderMessage {
	private String id;//����id��ӦGoodsOrderMX��id
	private String goodsID;//��Ʒ��ID
	private String goodsName;
	private double price;//��Ʒ�ĵ���
	private String remark;//��Ʒ������
	private String small_pic;//��ƷͼƬ
	private int count;//�����������
	private double totalPrice;//�����Ʒ���ܼ۸�
	public OrderMessage(String goodsName, double price, String remark,
			String smallPic, int count, double totalPrice) {
		super();
		this.goodsName = goodsName;
		this.price = price;
		this.remark = remark;
		small_pic = smallPic;
		this.count = count;
		this.totalPrice = totalPrice;
	}
	
	
}
