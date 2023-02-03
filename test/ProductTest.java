import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest{

    Product product;
    Product product1;
    Product product2;

    @BeforeEach
    void setUp() {
        product = new Product("Bread", 15, 200);
        product1 = new Product("Milk", 10, 100);
        product2 = new Product("Oil", 20, 450);
    }

    @Test
    void testGetName() {

        // testGetName for product
        assertEquals(product.getName(), "Bread");
        assertNotEquals(product.getName(), "Oil");

        // testGetName for product1
        assertEquals(product1.getName(), "Milk");
        assertNotEquals(product1.getName(), "Bread");

        // testGetName for product2
        assertEquals(product2.getName(), "Oil");
        assertNotEquals(product2.getName(), "Milk");


    }

    @Test
    void testGetId() {


        // testGetId for product
        assertEquals(product.getId(), 15);
        assertNotEquals(product.getId(), 30);

        // testGetId for product1
        assertEquals(product1.getId(), 10);
        assertNotEquals(product1.getId(), 20);


        // testGetId for product2
        assertEquals(product2.getId(), 20);
        assertNotEquals(product2.getId(), 10);
    }

    @Test
    void testGetBurningTemperature() {

        // testGetBurningTemperature for product
        assertEquals(product.getBurningTemperature(), 200);
        assertNotEquals(product.getBurningTemperature(), 1000);

        // testGetBurningTemperature for product1
        assertEquals(product1.getBurningTemperature(), 100);
        assertNotEquals(product1.getBurningTemperature(), 500);

        // testGetBurningTemperature for product2
        assertEquals(product2.getBurningTemperature(), 450);
        assertNotEquals(product2.getBurningTemperature(), 600);
    }
}