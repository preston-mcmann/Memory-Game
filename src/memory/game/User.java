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

public class User {
    private static List<Sets> Sets;
    String name;
    String password;
    public User(String name, String password, List<Sets> Sets){
        this.name=name;
        this.password= password;
        this.Sets=Sets;
    }

    public static List<Sets> getSets() {
        return Sets;
    }

    public static void setSets(List<Sets> Sets) {
        User.Sets = Sets;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public User(String name, String password){
        this.name=name;
        this.password=password;
    }
}
