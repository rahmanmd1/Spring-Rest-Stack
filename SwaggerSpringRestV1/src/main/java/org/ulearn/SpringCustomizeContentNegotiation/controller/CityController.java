package org.ulearn.SpringCustomizeContentNegotiation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.ulearn.SpringCustomizeContentNegotiation.dao.CityDao;
import org.ulearn.SpringCustomizeContentNegotiation.dao.CityDaoImpl;
import org.ulearn.SpringCustomizeContentNegotiation.model.City;
import org.ulearn.SpringCustomizeContentNegotiation.model.CityList;

@RestController
public class CityController {

	CityDao cityDao;
	
	@RequestMapping(value = "/city/{id}")
	@ResponseBody
	public ResponseEntity<City> getCityById(@PathVariable("id") String id) {
		
		cityDao = new CityDaoImpl();
		City city = cityDao.getCity(id);
	
		if (city.getId() != null && city.getId().length() > 0) {
			return new ResponseEntity<City>(city, HttpStatus.OK);
		}
		
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value = "/cities")
	public CityList getCities() {
		cityDao = new CityDaoImpl();
		return cityDao.getCities();
	}

}
