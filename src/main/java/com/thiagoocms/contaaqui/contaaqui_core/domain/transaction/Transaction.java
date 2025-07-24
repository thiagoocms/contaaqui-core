package com.thiagoocms.contaaqui.contaaqui_core.domain.transaction;

import com.thiagoocms.contaaqui.contaaqui_core.common.AbstractAuditingEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction extends AbstractAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
