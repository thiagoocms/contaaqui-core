package com.thiagoocms.contaaqui.contaaqui_core.dto.auth;

import java.io.Serializable;

public class AuthenticatedDTO implements Serializable {
    private String token;

    public AuthenticatedDTO() {
    }

    public AuthenticatedDTO(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
