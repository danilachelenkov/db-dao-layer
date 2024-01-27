package ru.netology.dbdaolayer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Orders {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, insertable = false,updatable = false)
    private Customers customers;

    @Column(nullable = false, name = "product_name")
    private String productName;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(nullable = false)
    private Double amount;
}

