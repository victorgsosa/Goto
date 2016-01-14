package com.go.to.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection="sites")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Site {

	@Id
	private String id;
	private Venue venue;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	
	@Override
	public String toString() {
		return "Site [id=" + id + ", venue=" + venue + "]";
	}

}
