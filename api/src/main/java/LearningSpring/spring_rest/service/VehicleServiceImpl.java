package LearningSpring.spring_rest.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import LearningSpring.spring_rest.entities.Vehicle;
import LearningSpring.spring_rest.exceptions.BadRequestException;
import LearningSpring.spring_rest.exceptions.VehicleNotFoundException;
import LearningSpring.spring_rest.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService
{
	
	@Autowired
	private VehicleRepository repository;

	@Override
	@Transactional
	public Vehicle create(Vehicle vehicle) {
		
		Optional<Vehicle> existing = repository.findById(vehicle.getVin());
		
		if (existing.isPresent())
		{
			throw new BadRequestException("The vehicle with vin "+ vehicle.getVin()+ " already exists");
		}
		
		return repository.save(vehicle);
	
	}

	@Override
	@Transactional
	public Vehicle update(String vin, Vehicle vehicle) {
		Optional<Vehicle> existing = repository.findById(vin);
		
		if (!existing.isPresent())
		{
			throw new VehicleNotFoundException("Vehicle with vin = " + vin + "is not found");
		}
		
		return repository.save(vehicle);
	}

	@Override
	@Transactional
	public void delete(String vin) {
		
		Optional<Vehicle> vehicle = repository.findById(vin);
		
		if (!vehicle.isPresent())
		{
			throw new VehicleNotFoundException("Vehicle with vin = " + vin + "is not found");
		}
		
		repository.delete(vehicle.get());
	}

	@Override
	public List<Vehicle> findAll() {
		
		return (List<Vehicle>) repository.findAll();
	}

	@Override
	public Vehicle findOne(String vin) {
		
		Optional<Vehicle> vehicle = repository.findById(vin);
		
		if (!vehicle.isPresent())
		{
			throw new VehicleNotFoundException("Vehicle with vin = " + vin + "is not found");
		}
		
		else
		{
			return vehicle.get();
		}
	}
		

}
