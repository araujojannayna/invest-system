package com.invest.system.core.domain.investiment;

public record InvestimentResponseDTO(String id,
                                     InvestimentType type,
                                     String name,
                                     Double value) {
}
