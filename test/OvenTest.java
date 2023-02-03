import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OvenTest {

    Oven oven;
    Oven oven1;
    Oven oven2;
    Oven oven3;
    Product product;

    @BeforeEach
    void setUp() {
        this.oven = new Oven(true, 30, 500);
        this.oven1 = new Oven(false, 0, 50);
        this.oven2 = new Oven(true, 23, 250);
        this.product = new Product("Egg", 23, 350);
        this.oven3 = new Oven(false, 0, 450);
    }

    @Test
    void testGetToBurnedId() {

        // testGetToBurnedId for oven
        assertEquals(oven.getToBurnedId(), 30);

        // testGetToBurnedId for oven1
        assertEquals(oven1.getToBurnedId(), 0);

        // testGetToBurnedId for oven2
        assertEquals(oven2.getToBurnedId(), 23);

        // testGetToBurnedId for oven3
        assertEquals(oven3.getToBurnedId(), 0);
    }

    @Test
    void testSetToBurnedId() {
        int toBurnedId = 50;

        // testGetToBurnedId for oven
        oven.setToBurnedId(toBurnedId);
        assertEquals(oven.getToBurnedId(), toBurnedId);

        // testGetToBurnedId for oven3
        assertNotEquals(oven1.getToBurnedId(), toBurnedId);
        oven1.setToBurnedId(toBurnedId);
        assertEquals(oven1.getToBurnedId(), toBurnedId);
    }

    @Test
    void testSetBusy() {
        boolean testIsBusy = false;
        assertTrue(oven.isBusy());
        oven.setBusy(testIsBusy);
        assertFalse(oven.isBusy());

    }

    @Test
    void testBurn() {

        // testBurn for oven
        assertTrue(oven.isBusy());
        oven.burn(product);
        assertTrue(oven.isBusy());

        // testBurn for oven1
        assertFalse(oven1.isBusy());
        oven1.burn(product);
        assertFalse(oven1.isBusy());

        // testBurn for oven4
        assertFalse(oven3.isBusy());
        oven3.burn(product);
        assertTrue(oven3.isBusy());
    }

    @Test
    void testIsBusy() {

        // testIsBusy for oven
        assertTrue(oven.isBusy());

        // testIsBusy for oven1
        assertFalse(oven1.isBusy());

        // testIsBusy for oven2
        assertTrue(oven2.isBusy());
    }
}