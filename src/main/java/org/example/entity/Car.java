package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Table(name= "ssr_car")
@Entity
@Data
public class Car {
//    @Id
//    @GeneratedValue
//    @Column(name = "number")
    private int number;

//    @Column(name ="name")
    private String name;

//    @Column(name = "service")
    private ArrayList<String> services = new ArrayList<>();
//    @ManyToOne
//    @JoinColumn(name = "client_id")
    private Client  client;

    public ArrayList<String> getServices() {
        return services;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServices(String services) {
        return services;
    }

    public void setServices(ArrayList<String> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "\n Car{" +
                "number=" + number +
                ", name='" + name + '\'' +
                "} " + Integer.toHexString(hashCode()) + " ! ";
    }
    public void addServices(Service service) {
        services.add(service.getName());
    }
    public String getServiceAsString() {
        return services.stream().collect(Collectors.joining(", "));
    }
    public Car() {
//        number = id++;
        name = " GT-R r35 ";
        services.add("color change");
    }

    public Car(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public void Car2(int number, String name){
        this.number = number;
        this.name = name;
    }


}