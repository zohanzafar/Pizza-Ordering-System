package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class NormalFlavour extends Order {
    
    private static String fname, size, nf;
    
    @Override
    public int flavour() {
            
            int  c, ch, p = 0;
            String choice, s;    
            NormalFlavour.nf = "Normal Flavour";
            choice = JOptionPane.showInputDialog("\n---------------------------------------------------------------------------------\n" 
                    + "\n                                   NORMAL FLAVOURS\n" 
                    + "\n---------------------------------------------------------------------------------\n" 
                    + "\n   S.No     Flavours                   Pan          Regular         Large\n" 
                    + "\n   1.          Chicken Fajita         400           900                1400\n" 
                    + "\n   2.          Chicken Tikka         400           900                1400\n" 
                    + "\n   3.          Afghani Feast          400           900                1400\n" 
                    + "\n---------------------------------------------------------------------------------\n\nEnter The Normal Flavour Code No : ");
            
            c = Integer.parseInt(choice);
            
            switch (c){

                    case 1:
                        NormalFlavour.fname = "Chicken Fajita";
                        break;

                    case 2:
                        NormalFlavour.fname = "Chicken Tikka";
                        break;

                    case 3:
                        NormalFlavour.fname = "Afghani Feast";
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"             Invalid Entry !");
                        
            }
            s = JOptionPane.showInputDialog("\n---------------------------------------------------------------------------------\n" 
                    + "\n                                   NORMAL FLAVOURS\n" 
                    + "\n---------------------------------------------------------------------------------\n" 
                    + "\n   S.No     Flavours                   Pan          Regular         Large\n" 
                    + "\n   1.          Chicken Fajita         400           900                1400\n" 
                    + "\n   2.          Chicken Tikka         400           900                1400\n" 
                    + "\n   3.          Afghani Feast          400           900                1400\n" 
                    + "\n---------------------------------------------------------------------------------\n\nEnter The Size : ");
            
            ch = Integer.parseInt(s); 
            
            switch (ch){
                    case 1:
                        NormalFlavour.size = "Pan";
                        p += 400;
                        break;

                    case 2:
                        NormalFlavour.size = "Regular";
                        p += 900;
                        break;

                    case 3:
                        NormalFlavour.size = "Large";
                        p += 1400;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"             Invalid Entry !");
            }
        return p;
    }
    public String nf() {
        return nf;
    }
    public String getFlavourName() {
        return fname;
    }
    public String getSize() {
        return size;
    }
}