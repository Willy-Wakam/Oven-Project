import java.util.ArrayList;
import java.util.List;

/**
 * The class for starting the project
 * */
public class Main {

    /**
     * The method which starts the project
     * @param args the default parameter for the main-method in Java
     * */
    public static void main(String[] args) {
        List<Oven> ovenList = new ArrayList<>();
        ovenList.add(new Oven(false, 0, 250));
        ovenList.add(new Oven(true, 15, 250));
        ovenList.add(new Oven(false, 0, 300));
        ovenList.add(new Oven(true, 20, 500));
        Transport transportSystem = new Transport();
        Scheduler scheduler = new Scheduler(ovenList, transportSystem);
        Product product = new Product("Bread", 123, 220);
        Product product2 = new Product("Milk", 15, 220);
        Product product3 = new Product("Chocolate", 20, 220);
        scheduler.scheduleProduct(product);
        scheduler.scheduleProduct(product2);
        scheduler.scheduleProduct(product3);
    }
}
