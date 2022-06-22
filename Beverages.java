package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class Beverages {
    public static int beverage(){
        try{
        String choice;    
        int bprice = 0, c;
        
        choice = JOptionPane.showInputDialog("\n---------------------------------------------------------------------------------"
                    + "\n                                           BEVERAGES"
                    + "\n---------------------------------------------------------------------------------"
                    + "\n   1.          Mineral Water                     500 Ml                 50"
                    + "\n   2.          Mineral Water                     1.5 Liter              100"
                    + "\n   3.          Soft Drink                             500 Ml                 60"
                    + "\n   4.          Soft Drink                             1 Litre                 120"
                    + "\n   5.          Soft Drink                             1.5 Litre              150"
                    + "\n   6.          Soft Drink                             Jumbo                190"
                    + "\n---------------------------------------------------------------------------------\nEnter The Beverage : ");
        c = Integer.parseInt(choice);
        
        switch (c){
            case 1:
                bprice += 50;
                JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Item"
                        + "\n--------------------------------------------"        
                        + "\n\n  Mineral Water 500 Ml ------ 50\n"
                        + "\n---------------------------------------------"
                        + "\n    Total Bill: " + bprice + " Rs. Only"  
                        + "\n---------------------------------------------"
                        + "\n           Thanks For Ordering "  
                        + "\n---------------------------------------------");
                
            break;
            
            case 2:
                JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Item"
                        + "\n--------------------------------------------"        
                        + "\n\n  Mineral Water 1.5 Litre --- 100\n"
                        + "\n---------------------------------------------"
                        + "\n    Total Bill: " + bprice + " Rs. Only"  
                        + "\n---------------------------------------------"
                        + "\n           Thanks For Ordering "  
                        + "\n---------------------------------------------");
                bprice += 100;
            break;
            
            case 3: 
                JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Item"
                        + "\n--------------------------------------------"        
                        + "\n\n  Soft Drink 500 Ml ------------ 60\n"
                        + "\n---------------------------------------------"
                        + "\n    Total Bill: " + bprice + " Rs. Only"  
                        + "\n---------------------------------------------"
                        + "\n           Thanks For Ordering "  
                        + "\n---------------------------------------------");
                bprice += 60;
            break;
            
            case 4:
                JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Item"
                        + "\n--------------------------------------------"        
                        + "\n\n  Soft Drink 1 Litre ----------- 120\n"
                        + "\n---------------------------------------------"
                        + "\n    Total Bill: " + bprice + " Rs. Only"  
                        + "\n---------------------------------------------"
                        + "\n           Thanks For Ordering "  
                        + "\n---------------------------------------------");
                bprice += 120;
            break;
            
            case 5:
                JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Item"
                        + "\n--------------------------------------------"        
                        + "\n\n  Soft Drink 1.5 Litre -------- 150\n"
                        + "\n---------------------------------------------"
                        + "\n    Total Bill: " + bprice + " Rs. Only"  
                        + "\n---------------------------------------------"
                        + "\n           Thanks For Ordering "  
                        + "\n---------------------------------------------");
                bprice += 150;
            break;
            
            case 6:
                JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Item"
                        + "\n--------------------------------------------"        
                        + "\n\n  Soft Drink 1 Jumbo ------- 190\n"
                        + "\n---------------------------------------------"
                        + "\n    Total Bill: " + bprice + " Rs. Only"  
                        + "\n---------------------------------------------"
                        + "\n           Thanks For Ordering "  
                        + "\n---------------------------------------------");
                bprice += 190;
            break;
            
            default:
                JOptionPane.showMessageDialog( null,"             Invalid Entry !");
        }
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        return 0;
    }
}