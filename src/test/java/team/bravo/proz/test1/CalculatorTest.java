package team.bravo.proz.test1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

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
        Assert.assertEquals(Calculator.doubleNumber(number), 10);
    }

    @Test
    public void doubleNumberDoublesNegativeNumber() {
        System.out.println("test: negative");
        number = -number;
        Assert.assertEquals(Calculator.doubleNumber(number), -10);
    }
    @Test
    public void doublePosDoublesNegativeNumber() {
        System.out.println("test: for errorr");
        Assert.assertEquals(Calculator.doubleNumber(7), 14);
    }

}