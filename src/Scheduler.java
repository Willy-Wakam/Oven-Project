import java.util.List;


/**
 * This class describes a Scheduler.
 * It is used to schedule the work between an oven and the transporter
 * */
public class Scheduler {

    /**
     * This variable gives information about the different oven that are registered in a scheduler
     * */
    private final List<Oven> ovenList;

    /**
     * This variable represents a transporter
     * */
    private final Transport transport;

    /**
     * The constructor of a scheduler with the parameters
     * @param ovenList which contains all the ovens
     * @param transport which transport a product to an oven
     * */
    public Scheduler(List<Oven> ovenList, Transport transport){
        this.ovenList = ovenList;
        this.transport = transport;

    }

    /**
     * This methode adds the given product to an oven or removes it from an oven
     * @param product the product, which should be scheduled to the appropriated oven
     * */
    public void scheduleProduct(Product product){
        for (Oven oven : ovenList ) {
            if (oven.isBusy() && oven.getToBurnedId() == product.getId()) {
                transport.removeProduct(oven, product);
                return;
            }
        }
        for (Oven oven : ovenList ) {
            if (!oven.isBusy() && oven.ovenBurnTemperature >= product.getBurningTemperature()
                    && oven.getToBurnedId() != product.getId()) {
                transport.addProduct(oven, product);
                return;
            }
        }
    }
}
