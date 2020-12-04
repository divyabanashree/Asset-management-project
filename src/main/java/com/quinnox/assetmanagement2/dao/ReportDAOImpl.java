package com.quinnox.assetmanagement2.dao;

import java.util.List;


import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.assetmanagement2.entity.Reports;

//import antlr.collections.List;

@Repository
public class ReportDAOImpl implements ReportDAO {


//	@Autowired
//	EntityManager entityManager;
//
//	@Override
//	@Transactional
//	public boolean addReport(Reports reports) {
//		Reports reports1 = new Reports();
//		BeanUtils.copyProperties(reports, reports1);
//		entityManager.persist(reports1);
//		return true;
//	}
//}
	@Autowired
	EntityManager entityManager;

	@Override
	@Transactional
	public boolean addReport(Reports reports) {
//		Reports reports1 = new Reports();
//		BeanUtils.copyProperties(reports, reports1);
		entityManager.persist(reports);
		return true;
	}

	@Override
	@Transactional
	public List<Reports> getReport() {
															
		TypedQuery<Reports> report = entityManager.createQuery("FROM Reports r", Reports.class);
		return report.getResultList();
//		return false;
	}

}

