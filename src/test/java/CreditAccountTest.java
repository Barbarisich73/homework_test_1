import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditAccountTest {
    CreditAccount sut;

    public CreditAccountTest() {
    }

    @Before
    public void setUp() {
        System.out.println("Test started");
    }

    @After
    public void tearDown() {
        System.out.println("Test finished");
    }

    @Test
    public void testPay() {
        //given:
        int amount = 100;
        sut = new CreditAccount(200);
        boolean expResult = true;

        //when:
        boolean result = sut.pay(amount);

        //then:
        assertEquals(expResult, result);
    }

    @Test
    public void testTransfer() {
        //given:
        Account account = new CheckingAccount(200);
        int amount = 300;
        sut = new CreditAccount(200);
        boolean expResult = true;

        //when:
        boolean result = sut.transfer(account, amount);

        //then:
        assertEquals(expResult, result);
    }

    @Test
    public void testAddMoney() {
        //given:
        int amount = 500;
        sut = new CreditAccount(-1000);
        boolean expResult = true;

        //when:
        boolean result = sut.addMoney(amount);

        //then:
        assertEquals(expResult, result);
    }

}
