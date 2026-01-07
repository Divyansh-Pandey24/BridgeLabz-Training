package com.day05.bookbazar;
public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price * 0.10);
    }
}
