package com.quinnox.assetmanagement2.service;

import java.util.List;

import com.quinnox.assetmanagement2.entity.UserRegister;

public interface UserService {


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
