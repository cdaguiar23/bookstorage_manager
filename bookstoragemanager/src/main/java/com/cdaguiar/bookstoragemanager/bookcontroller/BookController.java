package com.cdaguiar.bookstoragemanager.bookcontroller;

import com.cdaguiar.bookstoragemanager.dto.MessageResponseDTO;
import com.cdaguiar.bookstoragemanager.entity.Book;
import com.cdaguiar.bookstoragemanager.repository.BookRepository;
import com.cdaguiar.bookstoragemanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book) {
        return bookService.create(book);
    }

}
