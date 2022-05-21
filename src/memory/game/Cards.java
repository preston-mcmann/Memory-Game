/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory.game;

/**
 *
 * @author mcman
 */
public class Cards {
    String term;
    String definition;
    boolean study;
    
    //Constructor
    public Cards(String term, String definition){
        this.term=term;
        this.definition=definition;
    }

    //gets term of car
    public String getTerm() {
        return term;
    }

    //gets definition of card
    public String getDefinition() {
        return definition;
    }

}
