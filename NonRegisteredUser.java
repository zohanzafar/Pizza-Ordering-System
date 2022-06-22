package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class NonRegisteredUser extends User {

    @Override
    public String Login() {
        JOptionPane.showMessageDialog( null,"Unauthorized Login.");
        System.exit(0);
        return null;
    }     
}