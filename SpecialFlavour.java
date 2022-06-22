package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class SpecialFlavour extends Order {
    
    private static String fname, size;
    
    @Override
    public int flavour() {
        
            int  c, ch, p = 0;
            String choice,s;    
        
            choice = JOptionPane.showInputDialog("\n---------------------------------------------------------------------------------"
                    + "\n                                   SPECIAL  FLAVOURS"
                    + "\n---------------------------------------------------------------------------------"
                    + "\n   S.No     Flavours                           Regular   Large   Jumbo"
                    + "\n   1.          Cheesy Creamy Max     1000        1500     2200"
                    + "\n   2.          Mexican Green Wave    1000        1500     2200"
                    + "\n   3.          Italiano Wave                   1000        1500     2200"
                    + "\n---------------------------------------------------------------------------------\n\nEnter The Special Flavour Code No : ");
                                        
            c = Integer.parseInt(choice);

            switch (c){

                    case 1:
                        SpecialFlavour.fname = "Cheesy Creamy Max";
                        break;

                    case 2:
                        SpecialFlavour.fname = "Mexican Green Wave";
                        break;

                    case 3:
                        SpecialFlavour.fname = "Italiano Wave";
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"             Invalid Entry !");
            }
            
            s = JOptionPane.showInputDialog("\n---------------------------------------------------------------------------------"
                    + "\n                                   SPECIAL  FLAVOURS"
                    + "\n---------------------------------------------------------------------------------"
                    + "\n   S.No     Flavours                           Regular   Large   Jumbo"
                    + "\n   1.          Cheesy Creamy Max     1000        1500     2200"
                    + "\n   2.          Mexican Green Wave    1000        1500     2200"
                    + "\n   3.          Italiano Wave                   1000        1500     2200"
                    + "\n---------------------------------------------------------------------------------\n\nEnter The Size : ");
            
            ch = Integer.parseInt(s);
            
            switch (ch){
                    case 1:
                        SpecialFlavour.size = "Regular";
                        p += 1000;
                        break;

                    case 2:
                        SpecialFlavour.size = "Large";
                        p += 1500;
                        break;

                    case 3:
                        SpecialFlavour.size = "Jumbo";
                        p += 2200;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"             Invalid Entry !");
            }
        return p;
    }
    public String getFlavourName() {
        return fname;
    }
    public String getSize() {
        return size;
    }
}