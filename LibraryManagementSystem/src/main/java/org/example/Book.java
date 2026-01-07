package org.example;

public class Book {

    Author author;
    int id;
    String title;
    public Book(Author author, int id, String title) {
        this.author = author;
        this.id = id;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void bookDetails() {
        System.out.println("Book details --------- ");
        this.author.authorInformation();
        System.out.println("Book id: " + this.id);
        System.out.println("Book title: " + this.title);
    }
}
