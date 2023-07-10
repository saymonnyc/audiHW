package com.example.demohw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public String getAllCars(Model model){
        List<Car> cars = service.getAllCars();
        model.addAttribute("cars",cars);
        return "cars_view";
    }
}
