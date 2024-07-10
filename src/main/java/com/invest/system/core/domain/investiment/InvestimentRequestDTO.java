package com.invest.system.core.domain.investiment;

public record InvestimentRequestDTO(InvestimentType type,
                                    String name,
                                    Double value) {
}
