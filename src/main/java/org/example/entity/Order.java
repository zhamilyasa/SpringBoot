//package org.example.Objects;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity
//@Table(name = "ssr_order")
//public class Order {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "id")
//    private Long id;
//    @Column(name = "client")
//    private Client client;
//    @OneToMany(mappedBy = "order")
//    private List<Client> clientList;
//
//
//
//    public Order() {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Client getClient() {
//        return client;
//    }
//
//    public void setClient(Client client) {
//        this.client = client;
//    }
//}
