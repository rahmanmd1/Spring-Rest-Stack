package org.ulearn.SpringCustomizeContentNegotiation.model;


import java.util.ArrayList;
import java.util.List;
 
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement (name="cities")
public class CityList
{
    private List<City> cities = new ArrayList<City>();
 
    public List<City> getCities() {
        return cities;
    }
 
    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
