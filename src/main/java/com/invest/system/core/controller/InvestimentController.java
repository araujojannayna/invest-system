package com.invest.system.core.controller;

import com.invest.system.core.domain.investiment.InvestimentRequestDTO;
import com.invest.system.core.domain.investiment.InvestimentResponseDTO;
import com.invest.system.core.domain.service.InvestimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investiment")
public class InvestimentController {

    @Autowired
    private InvestimentService investimentService;

    @PostMapping
    public ResponseEntity<InvestimentResponseDTO> createInvestiment(@RequestBody InvestimentRequestDTO request){
        return ResponseEntity.ok(investimentService.createInvestiment(request));
    }
}
