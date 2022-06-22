package restaurantorderingsystem;

public class UserFactory {
    public static final String[] names = {"Zohan Zafar", "Usama Ali", "Sameer Asad", "Abdul Wahab"};
    public static User getUser(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
               return new RegisteredUser(name);
            }      
        }
       return new NonRegisteredUser();
    }
}
