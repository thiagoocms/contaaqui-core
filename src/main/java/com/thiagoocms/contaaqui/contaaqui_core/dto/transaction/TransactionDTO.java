package com.thiagoocms.contaaqui.contaaqui_core.dto.transaction;

import com.thiagoocms.contaaqui.contaaqui_core.enumerated.TransactionTypeEnum;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;


public record TransactionDTO(
        Long id,
        @NotNull
        Long walletId,
        @NotNull
        Long categoryId,
        @NotNull
        TransactionTypeEnum type,
        @NotNull
        BigDecimal amount
) {

}
