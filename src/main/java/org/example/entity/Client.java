package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ssr_client")
@Data
public class Client{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "bonus")
    private int bonus;
    @Column(name = "paymentMethod")
    private String paymentMethod ;
    @Column (name = "car")
    private Car auto;
    List<Car> cars = new ArrayList<>();

    public Client() {


    }
//    @OneToMany(mappedBy = "client")
    public List<Car> carList;
    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Car getAuto() {
        return auto;
    }

    public void setAuto(Car auto) {
        this.auto = auto;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int age) {
        this.bonus = bonus;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public Car getCar() {
        return auto;
    }

    public void setCar(Car auto) {
        this.auto = auto;
        cars.add(auto);
    }
    public Client(String name, int bonus, String paymentMethod, Car auto) {
        this.name = name;
        this.bonus = bonus;
        this.paymentMethod = paymentMethod;
        setCar(auto);
    }
    @Override
    public String toString() {
        return "\nClient{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                ", paymentMethod=" + paymentMethod +
                ", \n current order  = " + auto +
                ", \n order history = " + cars +
                ",\n  service "+ auto.getServiceAsString()+
                '}';
    }
}