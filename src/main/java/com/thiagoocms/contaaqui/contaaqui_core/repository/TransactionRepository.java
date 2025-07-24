package com.thiagoocms.contaaqui.contaaqui_core.repository;

import com.thiagoocms.contaaqui.contaaqui_core.common.AbstractJpaRepository;
import com.thiagoocms.contaaqui.contaaqui_core.domain.transaction.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends AbstractJpaRepository<Transaction, Long> {
}
