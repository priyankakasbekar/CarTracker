package LearningSpring.spring_rest.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Readings {
	@Id
	private int readingid;
	@Column(columnDefinition = "VARCHAR(50)")
	private String latitude;
	@Column(columnDefinition = "VARCHAR(50)")
	private String longitude;
	private Timestamp timestamp;
	private double fuelvolume;
	private int speed;
	private int enginehp;
	private boolean checkenginelighton;
	private boolean enginecoolantlow;
	private boolean cruisecontrolon;
	private int enginerpm;
	@OneToOne
	private TireReadings tirereading;
	@ManyToOne
	private Vehicle vehicle;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public double getFuelvolume() {
		return fuelvolume;
	}
	public void setFuelvolume(double fuelvolume) {
		this.fuelvolume = fuelvolume;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isCheckenginelighton() {
		return checkenginelighton;
	}
	public void setCheckenginelighton(boolean checkenginelighton) {
		this.checkenginelighton = checkenginelighton;
	}
	public int getEnginehp() {
		return enginehp;
	}
	public void setEnginehp(int enginehp) {
		this.enginehp = enginehp;
	}
	public boolean isEnginecoolantlow() {
		return enginecoolantlow;
	}
	public void setEnginecoolantlow(boolean enginecoolantlow) {
		this.enginecoolantlow = enginecoolantlow;
	}
	public boolean isCruisecontrolon() {
		return cruisecontrolon;
	}
	public void setCruisecontrolon(boolean cruisecontrolon) {
		this.cruisecontrolon = cruisecontrolon;
	}
	public int getEnginerpm() {
		return enginerpm;
	}
	public void setEnginerpm(int enginerpm) {
		this.enginerpm = enginerpm;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
