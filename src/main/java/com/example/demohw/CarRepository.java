package com.example.demohw;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CarRepository {
    private static List<Car>list = new ArrayList<>(
            List.of(new Car("Audi","HE3223AE"),
                    new Car("Audi","A4 `DR 4234`"),
                    new Car("Audi","BR3242"),
                    new Car("Audi", "MG4323"),
                    new Car("Audi", "LP4322")
            ));
    public List<Car>findAll(){
        return list;
    }
    public Optional<Car> findById(Long id){
        return list.stream().filter(car->car.getId().equals(id)).findFirst();
    }
}
