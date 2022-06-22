package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class Greetings{
    static int greetings() {
        String choice;
        int gprice = 0;
        JOptionPane.showMessageDialog(null,"Thank You! Hope To See You Again.");
        return 0;
    }
    
public void run(){  
    System.out.println("Thank You! Hope To See You Again.");  
} 

public static void main(String args[]){  
    Greetings m1 = new Greetings();  
    Thread t1 = new Thread((Runnable) m1);  
    t1.start();  
    }  
}