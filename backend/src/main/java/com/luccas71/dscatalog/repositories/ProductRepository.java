package com.luccas71.dscatalog.repositories;

import com.luccas71.dscatalog.entities.Category;
import com.luccas71.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
