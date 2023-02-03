
/**
 * This class describes an oven with his different characteristics
 * */
public class Oven {

    /**
     * This variable is used to give information about the state of an oven
     * */
    private boolean isBusy;

    /**
     * This variable is used to give information about the id of the product which is actually burned
     * The variable should be equal to 0 when isBusy is false
     * */
    private int toBurnedId;

    /**
     * This variable is used to give information about the minimal temperature of an oven
     * It helps to know if the current oven can burn a product with the toBurnedId
     * */
    public final int ovenBurnTemperature;

    /**
     * get the id to burn
     * @return the id to burn as an Integer
     * */
    public int getToBurnedId() {
        return toBurnedId;
    }

    /**
     * set the id to burn
     * @param toBurnedId the id to burn
     * */
    public void setToBurnedId(int toBurnedId) {
        this.toBurnedId = toBurnedId;
    }

    /**
     * change the new state of an oven with the boolean parameter busy
     * @param busy the boolean for the actual state of an oven
     * */
    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    /**
     * The constructor of an Oven with the parameters (toBurnedId as Integer, ovenBurnTemperature as Integer, isBusy as boolean).
     * @param toBurnedId the id of the product which should be burned
     * @param isBusy the default state of an oven
     * @param ovenBurnTemperature the information about the minimal temperature of an oven
     * */
    public Oven(boolean isBusy, int toBurnedId, int ovenBurnTemperature){
        this.isBusy = isBusy;
        this.ovenBurnTemperature = ovenBurnTemperature;
        this.toBurnedId = toBurnedId;
    }

    /**
     * This method takes as parameter
     * @param product and burns the product
     * */
    public void burn(Product product){
        if (product.getId() != this.getToBurnedId() && !this.isBusy && product.getBurningTemperature() <= this.ovenBurnTemperature){
            System.out.println("The product " + product.getName() + " with the id " + product.getId() +
                    " is burning at the temperature " + ovenBurnTemperature + "°C");
            this.setBusy(true);
        }
    }

    /**
     * This method
     * @return a boolean which helps to know the current state of an oven (if the oven is active or not)
     * */
    public boolean isBusy(){
        return isBusy;
    }
}
