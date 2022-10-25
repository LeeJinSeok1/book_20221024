package com.icia.book.dto;

import lombok.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {
    private Long bookId;
    private String bookName;
    private  String bookAuthor;
    private int bookPrice;
    private  String bookPublisher;


}
