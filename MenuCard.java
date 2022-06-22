package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class MenuCard {
    private static MenuCard instance = new MenuCard();

        //make the constructor private so that this class cannot be instantiated
        private MenuCard(){}

        //Get the only object available
        public static synchronized MenuCard getInstance(){
            return instance;
        }

        public void menucard(){
            JOptionPane.showMessageDialog( null,
                        "                                                                                     ********************************"
                    + "\n                                                                                     *                                                  *"
                    + "\n                                                                                     *   Pizza Ordering System    *"
                    + "\n                                                                                     *                                                  *"
                    + "\n                                                                                     ********************************" 
                    + "\n                                                                                                    MENU CARD"
                    + "\n---------------------------------------------------------------------------------        ---------------------------------------------------------------------------------"           
                    + "\n                                   NORMAL FLAVOURS                                                                                        TOPPINGS"
                    + "\n---------------------------------------------------------------------------------        ---------------------------------------------------------------------------------"
                    + "\n   S.No     Flavours                   Pan          Regular         Large                1.          Mushrooms                                                     150"
                    + "\n   1.          Chicken Fajita         400           900                1400                 2.          Extra Cheese                                                  150"
                    + "\n   2.          Chicken Tikka         400           900                1400                 3.          Black Olives                                                    150"
                    + "\n   3.          Afghani Feast          400           900                1400"
                    + "\n---------------------------------------------------------------------------------        ---------------------------------------------------------------------------------"
                    + "\n                                   SPECIAL  FLAVOURS                                                                                               DEALS"
                    + "\n---------------------------------------------------------------------------------        ---------------------------------------------------------------------------------"
                    + "\n   S.No     Flavours                           Regular   Large   Jumbo                           Deal 1              Deal 2              Deal 3             Deal 4"
                    + "\n   1.          Cheesy Creamy Max     1000        1500     2200"
                    + "\n   2.          Mexican Green Wave    1000        1500     2200                            2 Small           2 Regular         2 Large          2 Jumbo"
                    + "\n   3.          Italiano Wave                   1000        1500     2200"
                    + "\n---------------------------------------------------------------------------------                       Pizza               Pizza                Pizza               Pizza"
                    + "\n                                           BEVERAGES"
                    + "\n---------------------------------------------------------------------------------                    1 500 ML           1 Litre            1 Jumbo         2 Jumbo"
                    + "\n   1.          Mineral Water                     500 Ml                 50" 
                    + "\n   2.          Mineral Water                     1.5 Liter              100                              Drink                 Drink                Drink              Drink"
                    + "\n   3.          Soft Drink                             500 Ml                 60"
                    + "\n   4.          Soft Drink                             1 Litre                 120                               1000                 2000                  3000              4000"
                    + "\n   5.          Soft Drink                             1.5 Litre              150"
                    + "\n   6.          Soft Drink                             Jumbo                190"
                    + "\n---------------------------------------------------------------------------------       ---------------------------------------------------------------------------------"       
        );
    }
}