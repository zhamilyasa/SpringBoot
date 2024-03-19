//package org.example.controller;
//
//import org.example.model.entity.Car;
//import org.example.service.impl.CarServiceImpl;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/home")
//public class HomeController {
//    private final CarServiceImpl carServiceLogic;
//
//    public HomeController(CarServiceImpl carServiceLogic) {
//        this.carServiceLogic = carServiceLogic;
//    }
//
//    @GetMapping
//    public String getHome(){
//        return "Some Text";
//    }
//    @GetMapping("/{name}")
//    public String greetingToUser(@PathVariable String name){
//        return "hi" + name + "!";
//    }
//    @PostMapping("/car")
//    public String addCar(@RequestBody Car car){
//        return carServiceLogic.addCar(car);
//    }
//
//    @GetMapping ("/car")
//    public List<Car> getAllCars(){
//        return carServiceLogic.getAllCar();
//    }
//
//
////    @GetMapping("/client")
////    public String addClient(@RequestBody ClientDto clientDto){return clientDto;  }
//}