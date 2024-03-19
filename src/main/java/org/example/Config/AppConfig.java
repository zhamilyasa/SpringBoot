package org.example.Config;

import org.example.entity.Car;
import org.example.entity.Client;
import org.example.entity.Service;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.example.Main.id;

@Configuration
public class AppConfig {
    @Bean("firstBean")
    Car currentHistory() {
        return new Car();
    }
    @Bean("KIA")
    Car currenHistoryForZhami(){
        return  new Car();
    }
    @Bean(name = "BMW")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Car orderHistory() {
        return new Car(id++, "BMW");
    }
    @Bean("KIA")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Car orderHistoryForZhami() {
        return new Car(id++, "KIA");
    }
    @Bean("Service")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Service service(){
        Service service = new Service();
        service.setCar(car());
        return service;
    }

    @Bean("Aru")
    public  Client clientAutoSpa() {
        Client Aru = new Client(
                "Aruzhan",
                2000,
                "visa",
                currentHistory());
        Aru.setCar(car());
        return Aru;
    }
    @Bean("Zhami")
    public Client clientAutoSpa2(){
        Client Zhami = new Client(
                "Zhamilya",
                1500,
                "cash",
                currenHistoryForZhami());
        Zhami.setCar(car2());
        return Zhami;
    }
    @Bean("Mitsubishi")
    public Car car() {
        Car car1=new Car();
        car1.setName("Mitsubishi Lanser");
        return car1;
    } private Car car2() {
        Car car2 = new Car();
        car2.setName("Range Rover");
        return car2;
    }


}
