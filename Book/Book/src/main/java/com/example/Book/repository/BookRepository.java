package com.example.Book.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Book.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
