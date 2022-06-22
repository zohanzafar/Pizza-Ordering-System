package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class OrderDeal {
    public static int Price(){
        try{
        int  c;
        String choice;

            choice = JOptionPane.showInputDialog( 
                              "\n---------------------------------------------------------------------------------\n"
                            + "\n                                               DEALS\n"
                            + "\n---------------------------------------------------------------------------------\n"
                            + "\n           Deal 1              Deal 2              Deal 3             Deal 4\n"
                            + "\n\n          2 Small         2 Regular         2 Large          2 Jumbo\n"
                            + "\n            Pizza               Pizza                Pizza               Pizza\n\n"          
                            + "\n         1 500 ML          1 Litre           1 Jumbo          2 Jumbo\n" 
                            + "\n            Drink               Drink                Drink                Drink\n\n" 
                            + "\n            1000               2000                 3000                 4000\n" 
                            + "\n---------------------------------------------------------------------------------\nEnter Deal No. : ");
   
            c = Integer.parseInt(choice);
            
            switch (c){

                    case 1:
                        Deal1.deal1();
                        break;

                    case 2:
                        Deal2.deal2();
                        break;

                    case 3:
                        Deal3.deal3();
                        break;

                    case 4:
                        Deal4.deal4();
                        break;

                    default:
                        JOptionPane.showMessageDialog( null, "             Invalid Entry !");          
            }
        
            
        }
         catch(NumberFormatException e){
            System.out.println(e);
        }
        return 0;
        }
    
}