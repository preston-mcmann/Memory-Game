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
public class Sets {

    String name;

    private List<Cards> cards;
    public Sets(String name, List<Cards> cards){
        this.name=name;
        this.cards=cards;
    }
    
    public List<Cards> getCards() {

        return cards;
    }

    public void addCards(List<Cards> cards) {
        cards.addAll(cards);
    }

    public Cards makeCards(String term, String def) {
        Cards Card = new Cards(term, def);
        return Card;
    }

    public void print() {
        for (Cards card : cards) {
            System.out.println(card.getTerm());
            System.out.println(card.getDefinition());
        }
    }

    public void setCards(List<Cards> Cards) {
        cards = Cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
