package com.budgetmate.api.budgetmate_api.domain.category.repository;

import com.budgetmate.api.budgetmate_api.domain.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
