package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p1 = applicationContext.getBean("person", Person.class);
        System.out.println(p1);
        Person p2 = applicationContext.getBean("person", Person.class);
        System.out.println(p2);

        Exam exam = applicationContext.getBean("exam", Exam.class);
        exam.print();
    }
}

