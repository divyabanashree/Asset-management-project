package com.quinnox.assetmanagement2.service;

import java.util.List;


import com.quinnox.assetmanagement2.entity.Assets;
import com.quinnox.assetmanagement2.entity.UserAssets;

public interface AssetService {
	
public List<UserAssets> getUserAssets();
	
	public List<Assets> getAssets();

	public boolean addAsset(UserAssets userAsset);
	
	public boolean deleteAsset(int id);
	
	public boolean updateAsset(Assets assets);
	
//	public boolean deleteUserAsset(int userId);
	
	public boolean addAdminAsset(Assets assets);
	
}

	
//public List<UserAssets> getUserAssets();
//	
//	public List<Assets> getAssets();
//
//	public boolean addAsset(Assets asset);
//	
//	public boolean deleteAsset(int id);
//	
//	public boolean updateAsset(Assets assets);
//	
//}
