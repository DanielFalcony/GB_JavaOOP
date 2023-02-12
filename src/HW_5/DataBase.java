package HW_5;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private Map<String, String> usersList;

    public DataBase() {
        this.usersList = new HashMap<>();
    }

    public void createData (){
        Users user1 = new Users ("Daniel", "123");
        Users user2 = new Users ("Robert", "456");
        Users user3 = new Users ("Mike", "789");
        addNewUser(user1.getLogin(), user1.getPassword());
        addNewUser(user2.getLogin(), user2.getPassword());
        addNewUser(user3.getLogin(), user3.getPassword());
    }

    public void addNewUser(String login, String password) {
        usersList.put(login, password);
    }

    public Map<String, String> getUsersList() {
        return usersList;
    }
}
