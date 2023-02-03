import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchedulerTest{

    Scheduler scheduler;

    List<Oven> ovenList;

    Transport transporter;

    Product product;
    Product product1;

    Oven oven;
    Oven oven1;
    Oven oven2;
    Oven oven3;
    Oven oven4;

    @BeforeEach
    void setUp() {

        // initialization of the list
        ovenList = new ArrayList<>();

        // initialization of the transporter
        transporter = new Transport();

        // initialization of products
        product = new Product("Bread", 15, 200);
        product1 = new Product("Milk", 10, 100);

        // initialization of ovens
        oven = new Oven(true, 30, 500);
        oven1 = new Oven(false, 0, 50);
        oven2 = new Oven(true, 10, 250);
        oven3 = new Oven(false, 0, 450);
        oven4 = new Oven(false, 0, 450);

        // add the ovens in the list
        ovenList.add(oven);
        ovenList.add(oven1);
        ovenList.add(oven2);
        ovenList.add(oven3);
        ovenList.add(oven4);

        // initialization of the scheduler
        scheduler = new Scheduler(ovenList, transporter);
    }

    @Test
    void testScheduleProduct() {

        // testScheduleProduct for product
        scheduler.scheduleProduct(product);
        assertTrue(oven.isBusy());
        assertFalse(oven1.isBusy());
        assertTrue(oven2.isBusy());
        assertTrue(oven3.isBusy());

        // testScheduleProduct for product1
        scheduler.scheduleProduct(product1);
        assertTrue(oven.isBusy());
        assertFalse(oven1.isBusy());
        assertFalse(oven2.isBusy());
        assertTrue(oven3.isBusy());
    }
}