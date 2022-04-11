import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SavingAccountTest {
    SavingAccount sut;

    public SavingAccountTest() {
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
        int amount = 200;
        sut = new SavingAccount(0);
        boolean expResult = false;

        //when:
        boolean result = sut.pay(amount);

        //then:
        assertEquals(expResult, result);
    }

    @Test
    public void testTransfer() {
        //given:
        Account account = new CheckingAccount(400);
        int amount = 200;
        sut = new SavingAccount(200);
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
        sut = new SavingAccount(200);
        boolean expResult = true;

        //when:
        boolean result = sut.addMoney(amount);

        //then:
        assertEquals(expResult, result);
    }

}
