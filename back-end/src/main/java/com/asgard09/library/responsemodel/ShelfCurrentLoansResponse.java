package com.asgard09.library.responsemodel;

import com.asgard09.library.model.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShelfCurrentLoansResponse {

    private Book book;

    private int daysLeft;

    public ShelfCurrentLoansResponse(Book book, int daysLeft) {
        this.book = book;
        this.daysLeft = daysLeft;
    }


}
