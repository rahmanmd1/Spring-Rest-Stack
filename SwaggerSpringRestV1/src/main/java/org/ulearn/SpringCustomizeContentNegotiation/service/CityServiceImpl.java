package org.ulearn.SpringCustomizeContentNegotiation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.ulearn.SpringCustomizeContentNegotiation.dao.CityDao;
import org.ulearn.SpringCustomizeContentNegotiation.dao.CityDaoImpl;
import org.ulearn.SpringCustomizeContentNegotiation.model.City;
import org.ulearn.SpringCustomizeContentNegotiation.model.CityList;

public class CityServiceImpl implements CityService {

	
	//@Autowired
	CityDao  cityDao;
	
	public City getCity(String id){
		
		cityDao = new CityDaoImpl();
		return cityDao.getCity(id);
	}
	
	public CityList getCities(){
		cityDao = new CityDaoImpl();
		return cityDao.getCities();
	}
}
