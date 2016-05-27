package org.ulearn.SpringCustomizeContentNegotiation.dao;

import java.util.ArrayList;
import java.util.List;

import org.ulearn.SpringCustomizeContentNegotiation.model.City;
import org.ulearn.SpringCustomizeContentNegotiation.model.CityList;

public class CityDaoImpl implements CityDao {
	
	List<City> cities;
	
	public CityDaoImpl(){
		cities = new ArrayList<City>();
		City city1  = new City("1", "Kansas city", "Midwest", "abc", 123124);
		City city2  = new City("2", "St Luis", "Midwest", "qwewq", 345453);
		City city3  = new City("3", "Dallas", "Cnter", "asdasd", 234234324);
		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		
		
	}
	public City getCity(String id){
		
		return cities.get(0);
	}
	
	public CityList getCities(){
		return null;
		
	}
}
