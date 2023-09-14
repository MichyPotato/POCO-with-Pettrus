//package unconsolable.seven;

public class Console {
    private String name;
    private Brand brand;
    private double storage;
    private int energyConsumption;
    private boolean hasColorDisplay;

//defult constructor
    public Console(){
        this.name = "Oculus Quest 2";
        this.storage = 0;
        this.energyConsumption = 0;
        this.hasColorDisplay = false;
        this.brand = Brand.META;
    }
    //partial constructor
    public Console(String name, double storage, int energyConsumption){
        this.name = name;
        this.storage = storage;
        this.energyConsumption = energyConsumption;
        this.hasColorDisplay = false;
        this.brand = Brand.META;
    }
    //full constructor
    public Console(String name, double storage, int energyConsumption, boolean hasColorDisplay, Brand brand){
        this.name = name;
        this.storage = storage;
        this.energyConsumption = energyConsumption;
        this.hasColorDisplay = hasColorDisplay;
        this.brand = brand;
    }

    
    public Console(String name, Brand brand, double storage){
        this.name =  name;
        this.brand = brand;
        this.storage = storage;
        this.energyConsumption = 0;
        this.hasColorDisplay = true;
    }
    public Console(String name, Brand brand, double storage, int energyConsumption){
        this.name =  name;
        this.brand = brand;
        this.storage = storage;
        this.energyConsumption = energyConsumption;
        this.hasColorDisplay = true;
    }
    public Console(String name, Brand brand, double storage, int energyConsumption, boolean hasColorDisplay){
        this.name =  name;
        this.brand = brand;
        this.storage = storage;
        this.energyConsumption = energyConsumption;
        this.hasColorDisplay = hasColorDisplay;
    }

}

