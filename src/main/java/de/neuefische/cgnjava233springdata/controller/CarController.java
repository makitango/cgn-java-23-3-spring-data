package de.neuefische.cgnjava233springdata.controller;

import de.neuefische.cgnjava233springdata.model.Car;
import de.neuefische.cgnjava233springdata.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {

	private final CarService carService;

	@GetMapping
	public List<Car> getAllCars(){
		return carService.getAllCars();
	}

	@GetMapping("/{s}")
	public Car getCarById(@PathVariable String s){
		/*if(id == null && brand != null){
			return carService.getCarByBrand(brand);
		}
		return carService.getCarById(id);*/
		return carService.getCarByIdOrBrand(s);
	}

	@PostMapping
	public Car addCar(@RequestBody Car car){
		return carService.addCar(car);
	}

}
