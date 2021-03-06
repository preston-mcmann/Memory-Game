/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory.game;

import java.util.LinkedList;

public class User {
    private LinkedList<Sets> Sets;
    String name;
    String password;
    boolean study;
    
    //Constructor
    public User(String name, String password, LinkedList<Sets> Sets){
        this.name=name;
        this.password= password;
        this.Sets=Sets;
        
    }
    //removes set that is passed
    public void removeSets(Sets set){
        Sets.remove(set);
    }
    
    //overrides and removes set at index
    public void removeSets(int index){
        Sets.remove(index);
    }
    
    //adds set with only name
    public Sets addSets(String name){
        String[][] cardArray = new String[0][2];
        Sets sets = new Sets(name, cardArray);
        Sets.add(sets);
        return sets;
    }
    
     //overrides and adds a set with a name and cardlist
    public Sets addSets(String name, String[][] cardArray){
        /*for(int r = 0; r<cardArray.length;r++){
                Cards card = new Cards(cardArray[r][0],cardArray[r][1]);
                cardList.add(card);
        }*/
        Sets sets = new Sets(name, cardArray);
        Sets.add(sets);
        return sets;
    }
                        


    
    //returns sets list
    public LinkedList<Sets> getSets() {
        return Sets;
    }

    //finds the index of a set in setlist when given a name
    public int FindIndexofSet(String name) {
        int index = -1;
        for (int i = 0; i < Sets.size(); i++) {
             if(Sets.get(i).getName().equals(name)){
                index = i;
                break;
             }
        }       
        return index;//index of user in list, if -1 then user not in list
        }

    //gets name of user
    public String getName() {
        return name;
    }

    //gets password of user
    public String getPassword() {
        return password;
    }
}
