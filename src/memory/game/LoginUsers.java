/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory.game;


import java.util.List;

/**
 *
 * @author mcman
 */
public class LoginUsers {
    private static List<User> userList;
    
    public LoginUsers(List<User> userList){
        this.userList=userList;
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        LoginUsers.userList = userList;
    }
    
    public User addUser(String name, String password){
        User user = new User(name, password);
        userList.add(user);
        return user;
    }
    public User getUser(int x){
        return userList.get(x);
    }
    public static int compare(String Username, String Password) {
        int index = -1;
        for (int i = 0; i < userList.size(); i++) {
             if(userList.get(i).getName().equals(Username) && userList.get(i).getPassword().equals(Password)){
                index = i;
             }
        }       
        return index;//index of user in list, if -1 then user not in list
        }

}
