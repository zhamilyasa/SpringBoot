package org.example.entity;

public class Service {
    private Client client;
    private Car car;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
        car.addServices(this);
    }
    public void performService(String serviceName) {
        System.out.println("Performing service: " + serviceName);
    }
}