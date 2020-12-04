package com.quinnox.assetmanagement2.dao;

import java.util.List;


import com.quinnox.assetmanagement2.entity.Reports;
//import com.quinnox.assetmanagement2.entity.Reports;
public interface ReportDAO {

//	public boolean addReport(Reports reports);
//
//}
	public boolean addReport(Reports reports);

//	@Query("SUM(totalprice) FROM Reports")
	public List<Reports> getReport();

}