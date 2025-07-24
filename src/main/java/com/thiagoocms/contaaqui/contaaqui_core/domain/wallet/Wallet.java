package com.thiagoocms.contaaqui.contaaqui_core.domain.wallet;

import com.thiagoocms.contaaqui.contaaqui_core.common.AbstractAuditingEntity;
import com.thiagoocms.contaaqui.contaaqui_core.domain.user.User;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "wallets")
public class Wallet extends AbstractAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private User user;

    @Column(name = "balance", nullable = false)
    private BigDecimal balance;

    public Wallet() {
    }

    @PrePersist
    protected void onPersist() {
        if (balance == null) {
            balance = BigDecimal.ZERO;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
