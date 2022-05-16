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
        ArrayList<Cards> cardList1 = new ArrayList<>();
        ArrayList<Cards> cardList2 = new ArrayList<>();
        Cards card1 = new Cards("Apple","Red");
        Cards card2 = new Cards("12","dfed");
        cardList1.add(card1);
        cardList1.add(card2);
        ArrayList<Sets> setList1 = new ArrayList<>();
        ArrayList<Sets> setList2 = new ArrayList<>();
        Sets set1 = new Sets("Biology",cardList1);
        Sets set2 = new Sets("Chemistry",cardList1);
        setList1.add(set1);
        setList2.add(set2);
        
        ArrayList<User> userList = new ArrayList<>();
        User user1 = new User("Preston", "123",setList1);
        User user2 = new User("Alyson", "124",setList2);
        
        userList.add(user1);
        userList.add(user2);
        
        LoginUsers loginUsers = new LoginUsers(userList);
        new Login(loginUsers).setVisible(true);
    }
    
}
