package com.resourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class BookPriceController {
    @GetMapping("/bookPrice/{bookId}")
    public BookPriceInfo getBookPrice(@PathVariable Integer bookId) {
        System.out.println("---BookPriceController---getBookPrice()----: " );
        BookPriceInfo bookPriceInfo = new BookPriceInfo(bookId, 2500, 20);
        return bookPriceInfo;
    }
}