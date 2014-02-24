package uk.ac.glasgow.bookingSystem.components.course;

import com.javadocmd.simplelatlng.LatLng;

public class Location {

	public String name;
	public LatLng geoCoordinates;
	public String buildingName;
	public String campus;
	public int ID;
	
	public Location() {
		name = null;
		geoCoordinates = null;
		buildingName = null;
		campus = null;
		ID = 0;
	}

	public Location(String name, LatLng geoCoordinates, String buildingName,
			String campus, int iD) {
		super();
		this.name = name;
		this.geoCoordinates = geoCoordinates;
		this.buildingName = buildingName;
		this.campus = campus;
		ID = iD;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LatLng getGeoCoordinates() {
		return geoCoordinates;
	}

	public void setGeoCoordinates(LatLng geoCoordinates) {
		this.geoCoordinates = geoCoordinates;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
}
