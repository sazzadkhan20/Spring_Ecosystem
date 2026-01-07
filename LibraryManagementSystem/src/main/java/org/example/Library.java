package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books;
    String id;
    String name;

    public Library(List<Book> books,String id,String name){
        this.id=id;
        this.name=name;
        this.books=books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void libraryAllInformation(){

        System.out.println("Library Information -------");
        System.out.println("Library ID -------"+id);
        System.out.println("Library Name -------"+name);
        System.out.println("Library All Book Information -------");
        for(Book book: books)
          book.bookDetails();
    }
}
