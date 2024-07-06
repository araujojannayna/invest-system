package com.invest.system.core.repositories;

import com.invest.system.core.repositories.entities.InvestimentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InvestimentRepository extends JpaRepository<InvestimentEntity, UUID> {


}
