package LearningSpring.spring_rest.controller;

import java.util.ArrayList;
import java.util.List;
import LearningSpring.spring_rest.entities.*;
import LearningSpring.spring_rest.service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@ResponseBody
@RequestMapping(value = "/vehicles")
public class VehicleController 
{
	@Autowired
	private VehicleService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Vehicle> findAll()
	{
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "{vid}")
	public Vehicle findOne(@PathVariable("vid")String vin)
	{
		return service.findOne(vin);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void create(@RequestBody List<Vehicle> vehicles)
	{
		for (Vehicle vehicle:vehicles)
		{
			service.create(vehicle);
		}		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value= "{vid}")
	public Vehicle update(@PathVariable("vid")String vin,@RequestBody Vehicle vehicle)
	{
		return service.update(vin, vehicle);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value= "{vid}")
	public void delete(@PathVariable("vid")String vin)
	{
		service.delete(vin);
	}
		
}
