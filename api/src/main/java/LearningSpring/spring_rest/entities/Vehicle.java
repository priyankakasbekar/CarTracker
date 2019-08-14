package LearningSpring.spring_rest.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="Vehicle.findall",query="SELECT vehicle from Vehicle vehicle")
	
})
public class Vehicle {
	
	@Id
	@Column(columnDefinition = "VARCHAR(50)")
	private String vin;
	@Column(columnDefinition = "VARCHAR(50)")
	private String make;
	@Column(columnDefinition = "VARCHAR(50)")
	private String model;
	private int year; 
	private int redlinerpm;
	private int maxfuelvolume;
	private Date lastservicedate;
	
	
	public Vehicle()
	{
		
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRedlinerpm() {
		return redlinerpm;
	}
	public void setRedlinerpm(int redlinerpm) {
		this.redlinerpm = redlinerpm;
	}
	public int getMaxfuelvolume() {
		return maxfuelvolume;
	}
	public void setMaxfuelvolume(int maxfuelvolume) {
		this.maxfuelvolume = maxfuelvolume;
	}
	public Date getLastservicedate() {
		return lastservicedate;
	}
	public void setLastservicedate(Date lastservicedate) {
		this.lastservicedate = lastservicedate;
	}
}
