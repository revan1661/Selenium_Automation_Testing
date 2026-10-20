package rk.selenium_automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class all_annotation {

    @BeforeSuite
    public void before_suite() {
        System.out.println("Before suite");
    }

    @BeforeTest
    public void before_test() {
        System.out.println("Before test");
    }

    @BeforeClass
    public void before_class() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void before_method() {
        System.out.println("Before method");
    }

    @Test
    public void test() {
        System.out.println("Test");
    }

    @AfterMethod
    public void after_method() {
        System.out.println("After method");
    }

    @AfterClass
    public void after_class() {
        System.out.println("After class");
    }

    @AfterTest
    public void after_test() {
        System.out.println("After test");
    }

    @AfterSuite
    public void after_suite() {
        System.out.println("After suite");
    }
}
