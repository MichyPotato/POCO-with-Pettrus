//package unconsolable.seven;

public class Console {
    private String name;
    private double storage;
    private int energyConsumption;
    private boolean hasColorDisplay;
    private Brand brand;

    // default constructor
    public Console() { // this is the default constructpr
        this.name = "Oculest quest 2";
        this.storage = 0;
        this.energyConsumption = 0;
        this.hasColorDisplay = false;
        this.brand = Brand.META;
    }
    //partial constructor
    public Console(String name, double storage, int energyConsumption, boolean hasColorDisplay, Brand brand) {
        this.name = name;
        this.storage = storage;
        this.energyConsumption = energyConsumption;
        this.hasColorDisplay = hasColorDisplay;
        this.brand = brand;
    }
    //full constructor
    public Console(String name, double storage, int energyConsumption, boolean hasColorDisplay, String brand) {
        this.name = name;
        this.storage = storage;
        this.energyConsumption = energyConsumption;
        this.hasColorDisplay = hasColorDisplay;
        this.brand = Brand.valueOf(brand);
    }
}
