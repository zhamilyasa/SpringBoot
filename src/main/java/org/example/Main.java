package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableScheduling
public class Main {
    public static int id = 3;
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//
//        Car auto = (Car) context.getBean("BMW");
//        Client ctxDriver = (Client) context.getBean("Aru");
//        Client ctxDriver2 = (Client) context.getBean("Zhami" );
//
//        ctxDriver.setCar(auto);
//        System.out.println(ctxDriver );
//        System.out.println(ctxDriver2);
//
//        // todo
//
//        Service service = (Service) context.getBean("Service");
//        service.setCar(auto);
//        service.setClient(ctxDriver);
//        service.setClient(ctxDriver);
//        service.setName("Auto Wash");
//        service.setName("Paint protection");
//
//        // todo delete Car2 class and just use Car class
//        //ctx -> singleton Client, Car
//        // service Client -> Car | Service



    }
}

