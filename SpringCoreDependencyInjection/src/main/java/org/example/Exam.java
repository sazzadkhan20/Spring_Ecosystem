package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Exam {

    @Autowired
    private Person person;

    public Exam(Person person) {
        System.out.println("Constructor of Exam");
        this.person = person;
    }

    public void setPerson(Person person) {
        System.out.println("setPerson");
        this.person = person;
    }

    public void print()
    {
        System.out.println("print");
        System.out.println(person.toString());
    }
}
