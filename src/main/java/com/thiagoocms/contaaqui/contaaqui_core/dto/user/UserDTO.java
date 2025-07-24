package com.thiagoocms.contaaqui.contaaqui_core.dto.user;


import com.thiagoocms.contaaqui.contaaqui_core.enumerated.UserDocumentTypeEnum;
import com.thiagoocms.contaaqui.contaaqui_core.enumerated.UserProfileEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDTO(
        Long id,
        @NotBlank
        String name,
        @NotBlank
        String documentNumber,
        @NotNull
        UserDocumentTypeEnum documentType,
        @NotBlank
        String login,
        @NotBlank
        String password,
        @NotBlank
        String email,
        @NotNull
        UserProfileEnum profile,
        boolean deleted
) {
}
