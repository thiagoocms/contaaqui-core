package com.thiagoocms.contaaqui.contaaqui_core.repository;

import com.thiagoocms.contaaqui.contaaqui_core.common.AbstractJpaRepository;
import com.thiagoocms.contaaqui.contaaqui_core.domain.wallet.Wallet;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends AbstractJpaRepository<Wallet, Long> {
}
