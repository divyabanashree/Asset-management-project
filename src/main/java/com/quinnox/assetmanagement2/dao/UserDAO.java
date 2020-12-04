package com.quinnox.assetmanagement2.dao;

import java.util.List;

import com.quinnox.assetmanagement2.entity.UserRegister;

public interface UserDAO{

//	public boolean register(UserRegister userRegister);
//
//	public List<UserRegister> getDetail();
//
//	public boolean updateDetails(UserRegister userRegister);
//	
//}
	public boolean register(UserRegister userRegister);

	public List<UserRegister> getDetail();

	public boolean updateDetails(UserRegister userRegister);
	
}


