package com.swaggerdoc.swagger.repository;

import com.swaggerdoc.swagger.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BookRepository extends JpaRepository<Book,Long> {
}
