/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory.game;

public class Sets {

    String name;
    String[][] CardArray;
    //Constructor
    public Sets(String name, String[][] cardArray){
        this.name=name;    
        CardArray=cardArray;
  
    }

    public String[][] getCardArray() {
        return CardArray;
    }
       
    //gets name of set
    public String getName() {
        return name;
    }
}
