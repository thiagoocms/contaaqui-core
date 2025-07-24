package com.thiagoocms.contaaqui.contaaqui_core.repository;

import com.thiagoocms.contaaqui.contaaqui_core.common.AbstractJpaRepository;
import com.thiagoocms.contaaqui.contaaqui_core.domain.user.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends AbstractJpaRepository<User, Long> {
    User findByLoginAndDeletedIsFalse(String login);
}
