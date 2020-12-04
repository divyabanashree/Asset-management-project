package com.quinnox.assetmanagement2.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.assetmanagement2.dao.AssetDAO;
import com.quinnox.assetmanagement2.entity.Assets;
import com.quinnox.assetmanagement2.entity.UserAssets;

@Service
public class AssetServiceImpl implements AssetService{

	@Autowired
	AssetDAO dao;
	
	@Override
	public List<Assets> getAssets() {
		return dao.getAssets();
	}

	@Override
	public boolean addAsset(UserAssets userAsset) {
		return dao.addAsset(userAsset);
	}

	@Override
	public List<UserAssets> getUserAssets() {
		return dao.getUserAssets();
	}

	@Override
	public boolean deleteAsset(int id) {
		return dao.deleteAsset(id);
	}

	@Override
	public boolean updateAsset(Assets assets) {
		return dao.updateAsset(assets);
	}

	@Override
	public boolean addAdminAsset(Assets assets) {
		return dao.addAdminAsset(assets);
	}

//	@Override
//	public boolean deleteUserAsset(int userId) {
//		// TODO Auto-generated method stub
//		return dao.deleteUserAsset(userId);
//	}

}

//	@Autowired
//	AssetDAO dao;
//	
//	@Override
//	public List<Assets> getAssets() {
//		return dao.getAssets();
//	}
//
//	@Override
//	public boolean addAsset(Assets asset) {
//		return dao.addAsset(asset);
//	}
//
//	@Override
//	public List<UserAssets> getUserAssets() {
//		return dao.getUserAssets();
//	}
//
//	@Override
//	public boolean deleteAsset(int id) {
//		return dao.deleteAsset(id);
//	}
//
//	@Override
//	public boolean updateAsset(Assets assets) {
//		return dao.updateAsset(assets);
//	}
//
//}
