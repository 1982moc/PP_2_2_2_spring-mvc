package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Lada Samara", "Вишня", 2108));
        cars.add(new Car("Lada Riva", "Охра золотистая", 2105));
        cars.add(new Car("Lada Niva", "Такси", 2121));
        cars.add(new Car("Lada 1200", "Липа зеленая", 2101));
        cars.add(new Car("Lada 1600", "Светло-коричневая", 2106));
    }

    @Override
    public List<Car> showCarsList(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}