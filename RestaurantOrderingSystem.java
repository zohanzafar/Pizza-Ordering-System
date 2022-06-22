package restaurantorderingsystem;
import javax.swing.JOptionPane;

public class RestaurantOrderingSystem {
        private String restaurant;
        RestaurantOrderingSystem(String restaurant){
            this.restaurant = restaurant;
        }
        public String getName(){
            return restaurant;
        }
        public void setName(String restaurant){
            this.restaurant = restaurant;
        }
        
    public static void main(String[] args) {
        
        RestaurantOrderingSystem obj = new RestaurantOrderingSystem("ABC Pizza");
        System.out.println(""+obj.getName()+"\n");
        System.out.println("The Previous Name, Now the Updated Name is shown as Dialog.");
        obj.setName("The Pizza King");
        JOptionPane.showMessageDialog(null,""+obj.getName());
        
        String choice;
        int c;
        
        //Null Design Pattern
        String name = JOptionPane.showInputDialog("Sign Up");
        User user = UserFactory.getUser(name);
        System.out.println(user.Login());
        
        //Singleton Design Pattern
        MenuCard menuCard = MenuCard.getInstance();
        menuCard.menucard();
        
        choice = JOptionPane.showInputDialog("Enter Your Order : ");
        c = Integer.parseInt(choice);

        //Case 1 & 2 Based On Template Design Pattern
        //Case 3 Facade Desing Pattern
        
        switch(c){
            case 1:
                Order n_order = new NormalFlavour();
                n_order.order();
                break;
        
            case 2:
                Order s_order = new SpecialFlavour();
                s_order.order();
                break;
        
            case 3:
                OrderDeal.Price();
                break;
                    
            case 4:
                Beverages.beverage();
                break;
            case 5:
                Greetings.greetings();
            default:
                JOptionPane.showMessageDialog(null,"             Invalid Entry !");
        }
    }
}