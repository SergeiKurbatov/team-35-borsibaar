package com.borsibaar.backend.dto;

import jakarta.validation.constraints.NotBlank;

public record CategoryRequest(
        @NotBlank String name,
        Boolean dynamicPricing
) {}
