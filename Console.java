/* Michelle Luo and Pettrus Konnoth
 * AP CSA
 * UnConsolable
 * September 14th
 * Period 7
 */

//package unconsolable.seven;

public class Console {
    // define variables (Michelle Luo)
    private String name;
    private Brand brand;
    private double storage;
    private int energyConsumption;
    private boolean hasColorDisplay;

//defult constructor (Pettrus Konnoth)
    public Console(){
        this.name = "Oculus Quest 2";
        this.brand = Brand.META;
        this.storage = 0;
        this.energyConsumption = 0;
        this.hasColorDisplay = false;
    }
    //partial constructor - 1 parameter (Pettrus Konnoth)
    public Console(String name){
        this.name = name;
        this.brand = Brand.META;
        this.storage = 0;
        this.energyConsumption = 0;
        this.hasColorDisplay = false;
    }
    //partial constructor - 2 parameters (Pettrus Konnoth)
    public Console(String name, Brand brand){
        this.name = name;
        this.brand = brand;
        this.storage = 0;
        this.energyConsumption = 0;
        this.hasColorDisplay = false;
    }
    //partial constructor - 3 parameters (Michelle Luo)
    public Console(String name, Brand brand, double storage){
        this.name =  name;
        this.brand = brand;
        this.storage = storage;
        this.energyConsumption = 0;
        this.hasColorDisplay = true;
    }
    //partial constructor - 4 parameters (Michelle Luo)
    public Console(String name, Brand brand, double storage, int energyConsumption){
        this.name =  name;
        this.brand = brand;
        this.storage = storage;
        this.energyConsumption = energyConsumption;
        this.hasColorDisplay = true;
    }
    //partial constructor - 5 parameters (Michelle Luo)
    public Console(String name, Brand brand, double storage, int energyConsumption, boolean hasColorDisplay){
        this.name =  name;
        this.brand = brand;
        this.storage = storage;
        this.energyConsumption = energyConsumption;
        this.hasColorDisplay = hasColorDisplay;
    }

}

