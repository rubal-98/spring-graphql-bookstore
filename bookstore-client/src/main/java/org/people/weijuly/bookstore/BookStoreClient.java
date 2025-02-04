package org.people.weijuly.bookstore;

import org.people.weijuly.bookstore.client.SampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BookStoreClient implements CommandLineRunner {

    @Autowired
    SampleClient client;

    public static void main(String[] args) {
        SpringApplication.run(BookStoreClient.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>> running >>>");
        client.call();
    }


}
