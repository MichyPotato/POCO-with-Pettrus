/* Michelle Luo and Pettrus Konnoth
 * AP CSA
 * UnConsolable
 * September 14th
 * Period 7
 */


//package unconsolable.seven;

public class Main {
    public static void main(String[] args){

        // default constructor
           Console console1 = new Console();
           System.out.println(console1);
           console1.setName("XBOX One");
           console1.setBrand(Brand.XBOX);
           console1.setStorage(64);
           console1.setEnergyConsumption(90);
           console1.setHasColorDisplay(true);
           //displaying the console after the storage has been changed
           System.out.println(console1);

           System.out.println("default constructor: (toString)");

    }

}
