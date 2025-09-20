package com.borsibaar.backend.dto;

public record CategoryResponse(
        Long id,
        String name,
        Boolean dynamicPricing
) {}
