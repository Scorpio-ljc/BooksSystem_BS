package com.ljc.foreground.service.intf;

import com.ljc.foreground.model.User;

public interface UserServiceIntf {
	public boolean register(User user);//ע��
	public User login(User user);
}
