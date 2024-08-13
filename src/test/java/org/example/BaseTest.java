package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public  void setUp(){
        System.out.println("Before BaseTest");
    }


    @AfterEach
    public void tearDown(){

        System.out.println("After BaseTest");
    }
}
