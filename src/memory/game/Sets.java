/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory.game;

import java.util.ArrayList;

public class Sets {

    String name;
    String[][] CardArray;
    ArrayList<ArrayList<String>> StudyLater = new ArrayList<ArrayList<String>>();
    //Constructor
    public Sets(String name, String[][] cardArray){
        this.name=name;    
        CardArray=cardArray;
    }

    public String[][] getCardArray() {
        return CardArray;
    }
    public void setStudyArray( ArrayList<ArrayList<String>> studyLater) {
        StudyLater=studyLater;
    }   
    public  ArrayList<ArrayList<String>> getStudyArray() {
        return StudyLater;
    }
    //gets name of set
    public String getName() {
        return name;
    }
    public int contain(String term, String def){
        int index = -1;
        for (int i = 0; i < StudyLater.size(); i++) {
            if(StudyLater.get(i).get(0).equals(term)&&StudyLater.get(i).get(1).equals(def))
                index = i;
            }

        return index;//index of user in list, if -1 then user not in list
    }
}
