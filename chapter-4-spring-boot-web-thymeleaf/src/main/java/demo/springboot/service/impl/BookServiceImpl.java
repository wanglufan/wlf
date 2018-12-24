package demo.springboot.service.impl;

import demo.springboot.dao.IBookDao;
import demo.springboot.domain.Book;
import demo.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Book 业务层实现
 * <p>
 * Created by bysocket on 30/09/2017.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private IBookDao bookDao;

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Book insertByBook(Book book) {
        bookDao.insertByBook(book);
        return book;
    }

    @Override
    public Book update(Book book) {
        bookDao.update(book);
        return book;
    }

    @Override
    public Book delete(Long id) {
        Book book = bookDao.findById(id);
        bookDao.delete(id);
        return book;
    }

    @Override
    public Book findById(Long id) {
        return bookDao.findById(id);
    }
}
