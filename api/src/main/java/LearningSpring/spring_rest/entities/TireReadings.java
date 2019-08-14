package LearningSpring.spring_rest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TireReadings {
	
	@Id
	private int tire_reading_id;
	private int frontleft;
	private int frontright;
	private int rearleft;
	private int rearright;
	
	
	
	public int getFrontleft() {
		return frontleft;
	}
	public void setFrontleft(int frontleft) {
		this.frontleft = frontleft;
	}
	public int getFrontright() {
		return frontright;
	}
	public void setFrontright(int frontright) {
		this.frontright = frontright;
	}
	public int getRearleft() {
		return rearleft;
	}
	public void setRearleft(int rearleft) {
		this.rearleft = rearleft;
	}
	public int getRearright() {
		return rearright;
	}
	public void setRearright(int rearright) {
		this.rearright = rearright;
	}

}

