package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.yash.model.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

}
