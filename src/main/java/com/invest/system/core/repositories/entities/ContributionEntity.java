package com.invest.system.core.repositories.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "contribution")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContributionEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "contribution_date")
    private String date;

    @Column(name = "contribution_value")
    private Double value;
}
