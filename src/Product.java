import java.util.List;

/**
 * This class describes a product with his different characteristics
 * */
public class Product {

    /**
     * This variable is used to give information about the name of a product
     * */
    private final String name;

    /**
     * This variable is used to give information about the id of a product
     * We should note that an id is unique for each product
     * */
    private final int id;

    /**
     * This variable is used to give information about the temperature at which a product is burned
     * */
    private final int burningTemperature;

    /**
     * get the name of a product
     * @return the name of the product as a String
     * */
    public String getName() {
        return name;
    }

    /**
     * get the id of a product
     * @return the id of the product as an Integer
     * */
    public int getId() {
        return id;
    }

    /**
     * get the information about the temperature at which a product should be burned
     * @return the temperature at which a product should be burned as an Integer
     * */
    public int getBurningTemperature() {
        return burningTemperature;
    }

    /**
     * The constructor of the class which takes 3 parameters (id as Integer, name as String, burningTemperature as Integer)
     * @param id the id of the product
     * @param name the name of the product
     * @param burningTemperature the burning temperature of the product
     * */
    public Product(String name, int id, int burningTemperature){
        this.name = name;
        this.id = id;
        this.burningTemperature = burningTemperature;
    }
}
