package ru.netology.dbdaolayer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.dbdaolayer.model.Orders;

import java.io.Serial;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Customers {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 30)
    private String surname;

    @Column(nullable = false)
    private Integer age;

    @Column(length = 25)
    private String phoneNumber;

    @OneToMany(mappedBy = "customers")
    private Set<Orders> orders;
}
