package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class Deal4 {
    public static int deal4() {
        try{
        int price = 4000;
        JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Item"
                        + "\n--------------------------------------------"        
                        + "\n\n                       Deal 4\n\n               2 Jumbo Pizza\n               2 Jumbo Drink\n"
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