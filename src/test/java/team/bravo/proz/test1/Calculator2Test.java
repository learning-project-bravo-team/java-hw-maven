package team.bravo.proz.test1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calculator2Test {

    private int number;

    @BeforeMethod
    public void setUp() {
        number = 5;
        System.out.println("setUp: number = " + number);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    public void doubleNumberDoublesPositiveNumber() {
        System.out.println("test: positive");
        Assert.assertEquals(Calculator2.doubleNumber(number), 10);
    }

    @Test
    public void doubleNumberDoublesNegativeNumber() {
        System.out.println("test: negative");
        number = -number;
        Assert.assertEquals(Calculator2.doubleNumber(number), -10);
    }
    @Test
    public void doublePosDoublesNegativeNumber() {
        System.out.println("test: for errorr");
        Assert.assertEquals(Calculator2.doubleNumber(7), 14);
    }

}