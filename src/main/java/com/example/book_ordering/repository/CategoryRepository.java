package com.example.book_ordering.repository;


import com.example.book_ordering.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer > {
}
