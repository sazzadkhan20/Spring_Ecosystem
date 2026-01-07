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
        Library library1 = applicationContext.getBean("library",Library.class);
        Library library2 = applicationContext.getBean("library",Library.class);
        System.out.println(library1);
        System.out.println(library2);
        library1.libraryAllInformation();
        // library2.libraryAllInformation();

    }
}
