package LearningSpring.spring_rest.service;

import java.util.List;

import LearningSpring.spring_rest.entities.Vehicle;

public interface VehicleService 
{
	
	List<Vehicle> findAll();
	Vehicle findOne(String vin);
	Vehicle create(Vehicle vehicle);
	Vehicle update(String vin, Vehicle vehicle);
	void delete(String vin);
	

}
