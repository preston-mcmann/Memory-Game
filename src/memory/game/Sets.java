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
    String[][] twoDimentional;
    //Constructor
    public Sets(String name, LinkedList<Cards> cards){
        this.name=name;
        this.cards=cards;
        twoDimentional= new String[cards.size()][2];
        /*LinkedList<LinkedList<String> > array2d = new LinkedList<LinkedList<String> >();
        int z = 0;
        for (Cards card : cards) {
            array2d.add(new LinkedList<String>());
            array2d.get(z).add(card.getTerm());
            array2d.get(z).add(card.getDefinition());
            z++;
        }
        System.out.println(array2d);*/
        //adds card term and def to 2d array
        int x=0;
        int y=0;
        for (Cards card : cards) {
            twoDimentional[x][y]=(card.getTerm());
            y++;
            twoDimentional[x][y]=(card.getDefinition());
            x++; 
            y=0;
        }
    }

    public String[][] getTwoDimentional() {
        return twoDimentional;
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
