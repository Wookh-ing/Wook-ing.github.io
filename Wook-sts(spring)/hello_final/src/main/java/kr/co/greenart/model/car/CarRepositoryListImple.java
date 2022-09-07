package kr.co.greenart.model.car;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryListImple implements CarRepository {
	private List<Car> list = new ArrayList<>();
	
	@Override
	public List<Car> getAll() {
		return list;
	}
	
	@Override
	public Car getById(int id) {
		return null;
	}
	
	@Override
	public int add(Car car) {
		return list.add(car) ? 1 : 0;
	}
	
	@Override
	public int update(Car car) {
		return 0;
	}
	
	@Override
	public int delete(int id) {
		return 0;
	}
}
