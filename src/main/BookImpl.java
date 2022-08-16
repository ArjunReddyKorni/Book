package main;

import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setAuthor("abc");
        obj.setiSBN(2000);
        obj.setTitle("abc");
        obj.setPublishedYear(2000);
        obj.getPublishedYear();
        obj.getAuthor();
        obj.getiSBN();
        obj.getTitle();
        System.out.println(obj.getPublishedYear());
        System.out.println(obj.getAuthor());
        System.out.println(obj.getiSBN());
        System.out.println(obj.getTitle());

    }
}
