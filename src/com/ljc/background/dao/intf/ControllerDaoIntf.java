package com.ljc.background.dao.intf;

import com.ljc.background.model.Controller;
import com.ljc.util.PageBean;

public interface ControllerDaoIntf {
	public boolean addUser(Controller ntroller);
	public boolean deleUser(String id);
	public boolean UpdatUser(Controller controller);
	public PageBean<Controller> query(Controller controller);
	public int getAllCounts(Controller controller);//��ȡ���������Ĺ���Ա��������
	public Controller getByNameAndPWD(Controller controller);
}
