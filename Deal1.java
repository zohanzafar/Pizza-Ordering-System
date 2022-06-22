package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class Deal1 {
    public static int deal1() {
        try{
        int price = 1000;
        JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Item"
                        + "\n--------------------------------------------"        
                        + "\n\n                       Deal 1\n\n                  2 Pan Pizza\n               1 500 ML Drink\n"
                        + "\n---------------------------------------------"
                        + "\n    Total Bill:         " + price + " Rs. Only"  
                        + "\n---------------------------------------------"
                        + "\n           Thanks For Ordering "  
                        + "\n---------------------------------------------"); 
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        return 0 ; 
    }
}