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
    private List<Sets> Sets;
    String name;
    String password;
    boolean study;
    public User(String name, String password, List<Sets> Sets){
        this.name=name;
        this.password= password;
        this.Sets=Sets;
    }
    public void removeSets(Sets set){
        Sets.remove(set);
    }
    public void removeSetsIndex(int index){
        Sets.remove(index);
    }
    public Sets addSets(String name, List<Cards> cardList){
        Sets sets = new Sets(name, cardList);
        Sets.add(sets);
        return sets;
    }
    public List<Sets> getSets() {
        return Sets;
    }
    public void print(){
        for (Sets set:Sets){
            System.out.println(set.getName());
        }
    }
    public Sets makeSet(String name,List<Cards> Card ){
        Sets set = new Sets(name, Card);
        return set;
    }
    public int compare(String name) {
        int index = -1;
        for (int i = 0; i < Sets.size(); i++) {
             if(Sets.get(i).getName().equals(name)){
                index = i;
                break;
             }
        }       
        return index;//index of user in list, if -1 then user not in list
        }

    public  void setSets(List<Sets> sets) {
        Sets = sets;
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
