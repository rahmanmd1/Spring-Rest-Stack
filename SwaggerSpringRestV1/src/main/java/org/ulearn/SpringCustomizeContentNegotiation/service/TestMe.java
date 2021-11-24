package org.ulearn.SpringCustomizeContentNegotiation.service;

import java.util.List;

import org.ulearn.SpringCustomizeContentNegotiation.model.City;
import org.ulearn.SpringCustomizeContentNegotiation.model.CityList;

public interface TestMe {

	public City getCity(String id);
	public CityList getCities();
}
