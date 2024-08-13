package org.example;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.security.Key;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


class MainTest extends BaseTest{

    @BeforeEach
    public  void setUp1(){
        System.out.println("Before MainTest");
    }


    @Test
    public void someTest1() {
        System.out.println("my test1");


    } @Test
    public void someTest2() {
        System.out.println("my test2");


    }

    @AfterEach
    public void tearDown1(){
        System.out.println("After MainTest");
    }
}

