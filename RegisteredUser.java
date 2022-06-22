package restaurantorderingsystem;

public class RegisteredUser extends User {
    
    public RegisteredUser(String name) {
       this.name = name;		
    }
    
    @Override
    public String Login() {
        return name;
    }  
}