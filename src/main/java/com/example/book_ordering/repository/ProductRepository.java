package com.example.book_ordering.repository;

import com.example.book_ordering.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findAllByCategory_Id(int id);
}
