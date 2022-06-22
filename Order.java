package restaurantorderingsystem;
import javax.swing.JOptionPane;

public abstract class Order {
    private String topping;
    String flavour, Size, tp;
    public final int order(){

        int f = flavour();
        NormalFlavour nff = new NormalFlavour();
        String condition = nff.nf();
        
        if (condition == "Normal Flavour"){
            NormalFlavour nf = new NormalFlavour();
            flavour = nf.getFlavourName();
            Size = nf.getSize();
        }
        else {
            SpecialFlavour sf = new SpecialFlavour();
            flavour = sf.getFlavourName();
            Size = sf.getSize();
        }

        int t = topping();  
        int overallPrice = t + f;
        
        JOptionPane.showMessageDialog( null,
                        "\n--------------------------------------------"
                        + "\n                      Invoice"
                        + "\n--------------------------------------------"       
                        + "\n                        Items"
                        + "\n--------------------------------------------"        
                   
                        + "\n\n        "  + flavour + "\n        " + Size + "\n        " + topping
                        + "\n\n---------------------------------------------"
                        + "\n        Total Bill: " + overallPrice + " Rs. Only"  
                        + "\n---------------------------------------------"
                        + "\n           Thanks For Ordering "  
                        + "\n---------------------------------------------");
        return 0;
        
    }
    
    public abstract int flavour();

    public int topping() {
        
        int c, tprice = 0;
        String choice;    
        
        choice = JOptionPane.showInputDialog("\n---------------------------------------------------------------------------------"
                    + "\n                                           TOPPINGS"
                    + "\n---------------------------------------------------------------------------------"
                    + "\n   1.          Mushrooms                                                     150"
                    + "\n   2.          Extra Cheese                                                  150"
                    + "\n   3.          Black Olives                                                    150"
                    + "\n---------------------------------------------------------------------------------\n\nChoose Your Topping : ");
        c = Integer.parseInt(choice);    
        
        switch (c){
            case 1:
                this.topping = "Mushrooms";
                tprice += 150;
            break;
            
            case 2:
                this.topping = "Extra Cheese";
                tprice += 150;
            break;
            
            case 3:
                this.topping = "Black Olives";
                tprice += 150;
            break;
            
            default:
                JOptionPane.showMessageDialog(null,"             Invalid Entry !");
        }
        return tprice;
    }  
}