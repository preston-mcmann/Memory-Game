/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory.game;

import java.util.LinkedList;

/**
 *
 * @author mcman
 */
public class LoginUsers {

    private LinkedList<User> userList;

    //Constructor
    public LoginUsers(LinkedList<User> userList) {
        this.userList = userList;
    }

    //adds user to userlist given name and password
    public User addUser(String name, String password) {
        LinkedList<Sets> SetsList = new LinkedList<>();
        User user = new User(name, password, SetsList);
        userList.add(user);
        return user;
    }

    //finds the index of a user in userlist when given a username and password
    public int FindIndexofUser(String Username, String Password) {
        int index = -1;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(Username) && userList.get(i).getPassword().equals(Password)) {
                index = i;
            }
        }
        return index;//index of user in list, if -1 then user not in list
    }

    //gets userList
    public LinkedList<User> getUserList() {
        return userList;
    }

    //gets user at index
    public User getUser(int x) {
        return userList.get(x);
    }
}
