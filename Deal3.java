package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class Deal3 {
    public static int deal3() {
        try{
        int price = 3000;
        JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Item"
                        + "\n--------------------------------------------"        
                        + "\n\n                       Deal 3\n\n                2 Large Pizza\n               1 Jumbo Drink\n"
                        + "\n---------------------------------------------"
                        + "\n    Total Bill:         " + price + " Rs. Only"  
                        + "\n---------------------------------------------"
                        + "\n           Thanks For Ordering "  
                        + "\n---------------------------------------------"); 
        }
        catch(NumberFormatException e){
            System.out.println(e);
                }
        return 0 ;     }
}