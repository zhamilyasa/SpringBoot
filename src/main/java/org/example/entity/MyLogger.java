package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "request_logger")
public class MyLogger {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private Long id;
    private String request;
    private String responce;
    private LocalDateTime createdAat;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
