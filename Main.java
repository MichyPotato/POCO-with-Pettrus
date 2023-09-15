/* Michelle Luo and Pettrus Konnoth
 * AP CSA
 * UnConsolable
 * September 14th
 * Period 7
 */


//package unconsolable.seven;

public class Main {
    public static void main(String[] args){

        // default constructor (Michelle Luo)
           Console console1 = new Console();
           System.out.println(console1);
           console1.setName("XBOX One");
           console1.setBrand(Brand.XBOX);
           console1.setStorage(64);
           console1.setEnergyConsumption(90);
           console1.setHasColorDisplay(true);
           //displaying the console after the storage has been changed
           System.out.println(console1);

        // partial constructor (Michelle Luo)
           Console console2 = new Console("Gameboi Advertising", Brand.ATARI);
           System.out.println(console2);
           console2.setName("Game Boy Advance");
           console2.setBrand(Brand.NINTENDO);
           console2.setStorage(8);
           console2.setEnergyConsumption(90);
           console2.setHasColorDisplay(true);
           //displaying the console after the storage has been changed
           System.out.println(console2);

        // full constructor (Michelle Luo)
           Console console3 = new Console("PlayStation 4", Brand.PLAYSTATION, 500, 160, true);
           System.out.println(console3);
           console3.setName("PlayStation 5");
           console3.setBrand(Brand.PLAYSTATION);
           console3.setStorage(825);
           console3.setEnergyConsumption(310);
           console3.setHasColorDisplay(true);
           //displaying the console after the storage has been changed
           System.out.println(console3);

    }

}
