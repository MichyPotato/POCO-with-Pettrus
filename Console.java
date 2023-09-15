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

    //creating getters (Pettrus Konnoth) (Michelle Luo put minor edits)
    public String getName() {
        return this.name;
    }
    //creating setters (Pettrus Konnoth)
    public void setName(String name) {
        this.name = name;
    }
    //creating getters (Pettrus Konnoth) (Michelle Luo put minor edits)
    public Brand getBrand() {
        return this.brand;
    }
    //creating setters (Pettrus Konnoth)
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    //creating getters (Pettrus Konnoth) (Michelle Luo put minor edits)
    public double getStorage() {
        return this.storage;
    }
    //creating setters (Pettrus Konnoth)
    public void setStorage(double storage) {
        this.storage = storage;
    }
    //creating getters (Pettrus Konnoth) (Michelle Luo put minor edits)
    public int getEnergyConsumption() { 
        return this.energyConsumption;
    }
    //creating setters (Pettrus Konnoth)
    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
    //creating getters (Pettrus Konnoth) (Michelle Luo put minor edits)
    public boolean getHasColorDisplay() {
        return this.hasColorDisplay;
    }
    //creating setters (Pettrus Konnoth)
    public void hasColorDisplay(boolean hasColorDisplay) {
        this.hasColorDisplay = hasColorDisplay;
    }

    // creating the toString method (Pettrus Konnoth)
    public String toString(){
        return "name: " + this.name + "\n" +
                "brand: " + this.brand + "\n" +
                "storage: " + this.storage + "\n" +
                "energyConsumption: " + this.energyConsumption + "\n" +
                "hasColorDisplay: " + this.hasColorDisplay + "\n";
    }


}

