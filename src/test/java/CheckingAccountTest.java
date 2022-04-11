import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckingAccountTest {
    CheckingAccount sut;

    public CheckingAccountTest() {
    }

    @Before
    public void setUp() {
        System.out.println("Test started");
    }

    @After
    public void tearDown() {
        System.out.println("Test completed");
    }

    @Test
    public void testPay() {
        //given:
        int amount = 300;
        sut = new CheckingAccount(200);
        boolean expResult = false;

        //when:
        boolean result = sut.pay(amount);

        //then:
        assertEquals(expResult, result);
    }

    @Test
    public void testTransfer() {
        //given:
        Account account = new CreditAccount(-400);
        int amount = 300;
        sut = new CheckingAccount(300);
        boolean expResult = true;

        //when:
        boolean result = sut.transfer(account, amount);

        //then:
        assertEquals(expResult, result);
    }

    @Test
    public void testAddMoney() {
        //given:
        int amount = 300;
        sut = new CheckingAccount(100);
        boolean expResult = true;

        //when:
        boolean result = sut.addMoney(amount);

        //then:
        assertEquals(expResult, result);
    }

}
