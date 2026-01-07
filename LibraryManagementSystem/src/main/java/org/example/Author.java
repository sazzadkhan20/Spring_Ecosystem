package org.example;

public class Author {

    int id;
    String name;

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void authorInformation() {
        System.out.println("Author id: " + id);
        System.out.println("Author name: " + name);
    }
}
