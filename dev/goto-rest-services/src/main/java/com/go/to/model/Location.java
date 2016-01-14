package com.go.to.model;

import static org.springframework.data.mongodb.core.index.GeoSpatialIndexType.*;

import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

	private String address;
	private String cc;
	private String city;
	private String country;
	private @GeoSpatialIndexed(type = GEO_2DSPHERE) GeoJsonPoint position;
	private String state;

	public Location(String address, String cc, String city, String country, String state, GeoJsonPoint position) {
		super();
		this.address = address;
		this.cc = cc;
		this.city = city;
		this.country = country;
		this.position = position;
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public GeoJsonPoint getLocation() {
		return position;
	}

	public void setLocation(GeoJsonPoint position) {
		this.position = position;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Location [address=" + address + ", cc=" + cc + ", city=" + city + ", country=" + country + ", position="
				+ position + ", state=" + state + "]";
	}

}
