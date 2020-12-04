package com.quinnox.assetmanagement2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.assetmanagement2.dao.UserDAO;
import com.quinnox.assetmanagement2.entity.UserRegister;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO dao;
	
	@Override
	public boolean register(UserRegister userRegister) {
		return dao.register(userRegister);
	}

	@Override
	public List<UserRegister> getDetail() {
		return dao.getDetail();
	}

	@Override
	public boolean updateDetails(UserRegister userRegister) {
		return dao.updateDetails(userRegister);
	}

}

	
//	@Autowired
//	UserDAO dao;
//	
//	@Override
//	public boolean register(UserRegister userRegister) {
//		return dao.register(userRegister);
//	}
//
//	@Override
//	public List<UserRegister> getDetail() {
//		return dao.getDetail();
//	}
//
//	@Override
//	public boolean updateDetails(UserRegister userRegister) {
//		return dao.updateDetails(userRegister);
//	}
//
//}
