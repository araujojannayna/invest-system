package com.invest.system.core.repositories.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "income")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IncomeEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "income_date")
    private String date;

    @Column(name = "income_value")
    private Double value;
}
