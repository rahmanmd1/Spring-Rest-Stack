package org.ulearn.SpringCustomizeContentNegotiation.service;

import java.util.List;

import org.ulearn.SpringCustomizeContentNegotiation.model.City;
import org.ulearn.SpringCustomizeContentNegotiation.model.CityList;
// My Java doc
public interface CityService {

	public City getCity(String id);
	public CityList getCities();
}
