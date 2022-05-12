/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memory.game;

import java.util.ArrayList;

/**
 *
 * @author pmcma1
 */
public class MemoryGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        User user1 = new User("Preston", "123");
        User user2 = new User("Alyson", "124");
        
        userList.add(user1);
        userList.add(user2);
        
        LoginUsers loginUsers = new LoginUsers(userList);
        new Login(loginUsers).setVisible(true);
    }
    
}
