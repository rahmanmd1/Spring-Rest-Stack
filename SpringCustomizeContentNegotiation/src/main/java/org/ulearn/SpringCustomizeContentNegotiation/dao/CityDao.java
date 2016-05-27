package org.ulearn.SpringCustomizeContentNegotiation.dao;

import java.util.List;

import org.ulearn.SpringCustomizeContentNegotiation.model.City;
import org.ulearn.SpringCustomizeContentNegotiation.model.CityList;

public interface CityDao {
	public City getCity(String id);
	public CityList getCities();
}
