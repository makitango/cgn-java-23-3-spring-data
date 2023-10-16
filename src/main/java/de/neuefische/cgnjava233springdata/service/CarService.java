package de.neuefische.cgnjava233springdata.service;

import de.neuefische.cgnjava233springdata.exception.CarNotFoundException;
import de.neuefische.cgnjava233springdata.model.Car;
import de.neuefische.cgnjava233springdata.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

	private final CarRepository carRepository;

	public Car addCar(Car car) {
		return carRepository.save(car);
	}

	public List<Car> getAllCars(){
		return carRepository.findAll();
	}

	public Car getCarById(String id){
		return carRepository.findById(id).orElseThrow(() -> new CarNotFoundException("Car not found"));
	}

	public Car getCarByBrand(String brand){
		return carRepository.findCarByBrand(brand).orElseThrow(() -> new CarNotFoundException("Car not found"));
	}

	public Car getCarByIdOrBrand(String s){
		return carRepository.findCarByIdOrBrand(s).orElseThrow(() -> new CarNotFoundException("Car not found"));
	}

	public Car updateCar(Car car){
		return carRepository.save(car);
	}

	public void deleteCarById(String id){
		carRepository.deleteById(id);
	}

}
