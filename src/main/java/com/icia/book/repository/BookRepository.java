package com.icia.book.repository;

import com.icia.book.dto.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public int save(BookDTO bookDTO) {

       int result2 = sql.insert("book.save",bookDTO);

        return result2;


    }
}
