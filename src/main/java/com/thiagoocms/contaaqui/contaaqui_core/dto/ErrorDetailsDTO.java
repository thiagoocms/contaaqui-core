package com.thiagoocms.contaaqui.contaaqui_core.dto;

public record ErrorDetailsDTO(Long timestamp, Integer status, String message, String details) {
}
