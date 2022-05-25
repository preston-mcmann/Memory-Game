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
public class Sets {

    String name;
    private LinkedList<Cards> cards;
    
    //Constructor
    public Sets(String name, LinkedList<Cards> cards){
        this.name=name;
        this.cards=cards;
    }
    
    //removes cards at index
    public void removeCardsIndex(int index){
        cards.remove(index);
    }
    
    //finds the index of a card in cardlist when given a term and def
    public int FindIndexofCard(String Term, String Definition) {
        int index = -1;
        for (int i = 0; i < cards.size(); i++) {
             if(cards.get(i).getTerm().equals(Term)&&cards.get(i).getDefinition().equals(Definition)){
                index = i;
                break;
             }
        }       
        return index;//index of user in list, if -1 then user not in list
    }
    
    //gets cardlist
    public LinkedList<Cards> getCards() {
        return cards;
    } 

    //gets name of set
    public String getName() {
        return name;
    }
}
