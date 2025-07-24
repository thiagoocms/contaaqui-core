package com.thiagoocms.contaaqui.contaaqui_core.dto.category;

import jakarta.validation.constraints.NotBlank;

public record CategoryDTO(
        Long id,
        Long userId,
        @NotBlank
        String name,
        @NotBlank
        String description,
        boolean deleted
) {
}
