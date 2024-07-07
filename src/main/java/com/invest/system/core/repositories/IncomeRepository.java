package com.invest.system.core.repositories;

import com.invest.system.core.repositories.entities.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IncomeRepository extends JpaRepository<IncomeEntity, UUID> {


}
