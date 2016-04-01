package com.ljc.foreground.service.intf;

import java.util.List;

import com.ljc.foreground.model.GoodsOrder;
import com.ljc.foreground.model.GoodsOrderMX;
import com.ljc.foreground.model.OrderMessage;
import com.ljc.foreground.model.User;
import com.ljc.util.PageBean;

public interface GoodsOrderServiceIntf {
	public boolean addOrder(GoodsOrder goodsOrder);
	public boolean deleteOrder(GoodsOrder goodsOrder);
	public boolean updateOrder(GoodsOrder goodsOrder);
	//�����û��������Ҷ�Ӧ�Ķ���
	public List<GoodsOrder> query(User user);
}
