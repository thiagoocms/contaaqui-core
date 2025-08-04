package com.thiagoocms.contaaqui.contaaqui_core.dto.auth;

import java.io.Serializable;


public class AuthLoginDTO implements Serializable {
    private String auth;

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
