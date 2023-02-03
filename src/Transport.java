
/**
 * This class describes a transporter system.
 * It is used to manage the ovens
 * */
public class Transport {

    /**
     * This method takes as parameters an owen and a product
     * @param product the product, which should be added to the given oven
     * @param oven the oven where the given product will be burned
     * */
    public void addProduct(Oven oven, Product product){
        oven.burn(product);
    }

    /**
     * This method takes as parameters an owen and a product
     * @param product the product, which should be removed from the given oven
     * @param oven the oven where the given product will be removed
     * */
    public void removeProduct(Oven oven, Product product){
        System.out.println("The product " + product.getName() + " with the id " + product.getId() + " was removed from oven");
        oven.setBusy(false);
        oven.setToBurnedId(0);
    }
}
