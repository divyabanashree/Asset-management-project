package com.quinnox.assetmanagement2.dao;

import java.util.List;

//import com.quinnox.assetmanagement.entity.Assets;
import com.quinnox.assetmanagement2.entity.UserAssets;
import com.quinnox.assetmanagement2.entity.Assets;

public interface AssetDAO {

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
//
public List<UserAssets> getUserAssets();
	
	public List<Assets> getAssets();

	public boolean addAsset(UserAssets userAsset);
	
	public boolean deleteAsset(int id);
	
	public boolean updateAsset(Assets assets);
	
//	public boolean deleteUserAsset(int userId);
	
	public boolean addAdminAsset(Assets assets);
	
}
