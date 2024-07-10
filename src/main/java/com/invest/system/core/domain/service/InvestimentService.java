package com.invest.system.core.domain.service;

import com.invest.system.core.domain.investiment.InvestimentRequestDTO;
import com.invest.system.core.domain.investiment.InvestimentResponseDTO;
import com.invest.system.core.repositories.InvestimentRepository;
import com.invest.system.core.repositories.entities.InvestimentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestimentService {

    @Autowired
    private InvestimentRepository repository;

    public InvestimentResponseDTO createInvestiment(InvestimentRequestDTO request){
        InvestimentEntity entity = new InvestimentEntity();
        entity = entity.requestDtoToEntity(request);
        repository.save(entity);

        return entity.entityToResponseDto();
    }
}
