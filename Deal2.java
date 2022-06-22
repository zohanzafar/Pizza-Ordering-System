package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class Deal2 {
    public static int deal2() {
        try{
        int price = 2000;
        JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Item"
                        + "\n--------------------------------------------"        
                        + "\n\n                       Deal 2\n\n               2 Regular Pizza\n                 1 Litre Drink\n"
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