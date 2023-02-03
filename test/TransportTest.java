import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest{

    Transport transporter;

    Oven oven;
    Oven oven1;
    Oven oven3;
    Oven oven4;


    Product product;
    Product product1;


    @BeforeEach
    void setUp() {

        // initialization of the transporter
        transporter = new Transport();

        // initialization of products
        product = new Product("Bread", 15, 200);
        product1 = new Product("Milk", 30, 100);

        // initialization of ovens
        oven = new Oven(true, 30, 500);
        oven1 = new Oven(false, 0, 50);
        oven3 = new Oven(false, 10, 450);
        oven4 = new Oven(false, 0, 450);

    }

    @Test
    void testAddProduct() {

        // testAddProduct for product
        transporter.addProduct(oven, product);
        assertTrue(oven.isBusy());
        assertNotEquals(oven.getToBurnedId(), 15);

        transporter.addProduct(oven1, product);
        assertFalse(oven1.isBusy());
        assertNotEquals(oven1.getToBurnedId(), 15);


        transporter.addProduct(oven3, product);
        assertTrue(oven3.isBusy());
        assertNotEquals(oven3.getToBurnedId(), 15);


        transporter.addProduct(oven4, product);
        assertTrue(oven4.isBusy());
        assertNotEquals(oven4.getToBurnedId(), 15);

    }

    @Test
    void testRemoveProduct() {

        // testAddProduct for product1
        transporter.removeProduct(oven, product1);
        assertFalse(oven.isBusy());
        assertNotEquals(oven.getToBurnedId(), 30);
    }
}