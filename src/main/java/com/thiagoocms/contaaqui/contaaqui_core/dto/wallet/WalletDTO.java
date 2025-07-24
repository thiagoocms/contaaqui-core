package com.thiagoocms.contaaqui.contaaqui_core.dto.wallet;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record WalletDTO(
        Long id,
        @NotNull
        Long userId,
        @NotNull
        BigDecimal balance,
        boolean deleted
) {

}
