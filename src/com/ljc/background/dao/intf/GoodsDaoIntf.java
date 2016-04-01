package com.ljc.background.dao.intf;

import com.ljc.background.model.Goods;
import com.ljc.util.PageBean;

public interface GoodsDaoIntf {
	public boolean add(Goods goods);
	public boolean deleGoods(Goods goods);
	public boolean updateGoods(Goods goods);
	public PageBean<Goods> query(PageBean<Goods> pageBean,Goods goods);
	public int getCounts(Goods goods);
	public Goods getGoodsByID(Goods goods);
}
