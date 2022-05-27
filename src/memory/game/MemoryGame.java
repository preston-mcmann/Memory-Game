/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memory.game;


import java.util.LinkedList;


public class MemoryGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][]array2d= {{"Cell","The smallest unit that can preform a life process"},{"Element","Pure substance that consists entirely of one type of atom"}};
        
        LinkedList<Sets> setList1 = new LinkedList<>();
        LinkedList<Sets> setList2 = new LinkedList<>();
        Sets set1 = new Sets("Biology",array2d);
        Sets set2 = new Sets("Chemistry",array2d);
        setList1.add(set1);
        setList2.add(set2);
        
        LinkedList<User> userList = new LinkedList<>();
        User user1 = new User("Preston", "123",setList1);
        User user2 = new User("Alyson", "124",setList2);
        
        userList.add(user1);
        userList.add(user2);
        
        LoginUsers loginUsers = new LoginUsers(userList);
        new Login(loginUsers).setVisible(true);
    }
    
}
