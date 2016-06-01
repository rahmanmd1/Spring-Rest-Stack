package org.ulearn.SpringCustomizeContentNegotiation.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "city")
@XmlAccessorType(XmlAccessType.NONE)
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlAttribute
	private String id;

	@XmlElement
	private String name;

	@XmlElement
	private String description;

	@XmlElement
	private String mayor;

	@XmlElement
	private double area;

	public City() {
		
	}
	
	public City(String id, String name, String description, String mayor, double area) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.mayor = mayor;
		this.area = area;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMayor() {
		return mayor;
	}

	public void setMayor(String mayor) {
		this.mayor = mayor;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "city [id=" + id + ", name=" + name + ", description=" + description + ", mayor=" + mayor + ", area="
				+ area + "]";
	}
}
