package com.thiagoocms.contaaqui.contaaqui_core.repository;

import com.thiagoocms.contaaqui.contaaqui_core.common.AbstractJpaRepository;
import com.thiagoocms.contaaqui.contaaqui_core.domain.category.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends AbstractJpaRepository<Category, Long> {
}
