package com.invest.system.core.repositories;

import com.invest.system.core.repositories.entities.ContributionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContributionRepository extends JpaRepository<ContributionEntity, UUID> {


}
