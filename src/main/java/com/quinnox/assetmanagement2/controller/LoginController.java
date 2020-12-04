package com.quinnox.assetmanagement2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.assetmanagement2.entity.UserRegister;
import com.quinnox.assetmanagement2.response.ResponseData;
import com.quinnox.assetmanagement2.service.LoginServiceImpl;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class LoginController {
	
	@Autowired
	LoginServiceImpl service;

	@GetMapping("/login")
	public ResponseData userEmailAndPassword(String email, String password) {
		ResponseData responseData = new ResponseData();

		UserRegister user = service.userLogin(email, password);
		if (user != null) {
			responseData.setMessage("User Login successfully");
			responseData.setData(service.userLogin(email, password));
			return responseData;
		} else {
			responseData.setMessage("User failed to login successfully");
			responseData.setData(service.userLogin(email, password));
			return responseData;
		}

	}

}

//	@Autowired
//	LoginServiceImpl service;
//
//	@GetMapping("/login")
//	public ResponseData userEmailAndPassword(String email, String password) {
//		ResponseData responseData = new ResponseData();
//		responseData.setMessage("User Login successfully");
//		responseData.setData(service.userLogin(email, password));
//		UserRegister user = service.userLogin(email, password);
//		if (user != null) {
//			return responseData;
//		} else {
//			return null;
//		}
//
//	}
//
//}