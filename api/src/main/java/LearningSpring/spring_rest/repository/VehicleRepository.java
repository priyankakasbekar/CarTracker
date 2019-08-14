package LearningSpring.spring_rest.repository;


import org.springframework.data.repository.CrudRepository;

import LearningSpring.spring_rest.entities.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle,String>
{
	
	

}
