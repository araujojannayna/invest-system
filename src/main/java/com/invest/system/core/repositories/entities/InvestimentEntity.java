package com.invest.system.core.repositories.entities;

import com.invest.system.core.domain.investiment.InvestimentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "investiment")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvestimentEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    private InvestimentType type;

    private String name;

    private Double value;
}
