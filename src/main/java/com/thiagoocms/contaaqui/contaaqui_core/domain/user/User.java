package com.thiagoocms.contaaqui.contaaqui_core.domain.user;


import com.thiagoocms.contaaqui.contaaqui_core.common.AbstractAuditingEntity;
import com.thiagoocms.contaaqui.contaaqui_core.enumerated.UserDocumentTypeEnum;
import com.thiagoocms.contaaqui.contaaqui_core.enumerated.UserProfileEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User extends AbstractAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "document_number", length = 50, nullable = false)
    private String documentNumber;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "document_type", nullable = false)
    private UserDocumentTypeEnum documentType;

    @Column(name = "login", length = 50, nullable = false)
    private String login;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @Column(name = "email", length = 300, nullable = false)
    private String email;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "profile", nullable = false)
    private UserProfileEnum profile;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public UserDocumentTypeEnum getDocumentType() {
        return documentType;
    }

    public void setDocumentType(UserDocumentTypeEnum documentType) {
        this.documentType = documentType;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserProfileEnum getProfile() {
        return profile;
    }

    public void setProfile(UserProfileEnum profile) {
        this.profile = profile;
    }
}
