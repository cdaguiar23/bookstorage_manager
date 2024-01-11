package com.cdaguiar.bookstoragemanager.repository;

import com.cdaguiar.bookstoragemanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Long> {
}
