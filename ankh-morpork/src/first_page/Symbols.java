/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_page;
import static first_page.Bank.cash;
import static first_page.Bank.change;
import static first_page.first_page.playerObj;
import static first_page.gameBoard.bt;
import static first_page.gameBoard.sc;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.*;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 * Symbols class to get the action to be performed for selected card
 * @param sc Object of method selectedCard to access the card to be played
 * @param as Object of method actionSymbol to access the symbol on the card
 * @param tm_areas Trouble marker areas
 * @author n_bhaga
 */
public class Symbols {
    
    public static selectedCard sc = new selectedCard();
    public static actionSymbol as = new actionSymbol();
    List<String> tm_areas = new ArrayList<String>();
    /**
     * getSymbol method for getting the symbols from the card
     * @param number count of the symbols in the card
     * @return name event name is returned
     */ 
    public String getSymbols(int number){
     String name = null;
        HashMap mapSymbol = new HashMap();
                mapSymbol.put(1,"Assassin");
                mapSymbol.put(2,"Remove_tm");
                mapSymbol.put(4,"Perform_text");
                mapSymbol.put(5,"Random_event");
                mapSymbol.put(6,"Play_another_card");
                mapSymbol.put(7,"Place_building");
                mapSymbol.put(8,"Place_minion");
                mapSymbol.put(9,"Interrupt");
                mapSymbol.put(31,"Take_one");
                mapSymbol.put(32,"Take_two");
                mapSymbol.put(33,"Take_three");
                mapSymbol.put(34,"Take_four");
                mapSymbol.put(35,"Take_five");
                
                List keys = new ArrayList(mapSymbol.keySet());
                for (Object o : keys) {
                    if(o.equals(number)){
                    name = (String) mapSymbol.get(o);
                    }
                }
                return name;
    }
   /**
    * Event Assassin
    * @param tm_areas Trouble marker areas
    * @param as object of actionSymbol
    */
    public void Assassin(){
        
        as.rb[0] = new JRadioButton("Trouble Marker");
        as.rb[1] = new JRadioButton("Minions");
        as.rb[2] = new JRadioButton("Demons");
        as.rb[3] = new JRadioButton("Trolls");
        for(int i=0;i<4;i++){
        as.jp.add(as.rb[i]);
            as.radioGroup.add(as.rb[i]);
            as.add(as.jp);
        }
        as.jb = new JButton("Display Areas");
        as.add(as.jb,BorderLayout.CENTER);

        for(int i=0;i<12;i++){
        
            if(first_page.area[i].troubleMarker){
                tm_areas.add(first_page.area[i].areaName);
                System.out.println("new tm_area size:" + tm_areas.size());
            }
        }
            
        as.setLayout(new FlowLayout()); 
            as.setVisible(true);
        
        for(int i=0;i<tm_areas.size();i++){
            System.out.println("new tm_area size:" + tm_areas.size());
            
            as.rb[i] = new JRadioButton(first_page.area[i].areaName);
            as.rb[i].setName(first_page.area[i].areaName);
            as.rb[i].setText(first_page.area[i].areaName);
            System.out.println("area name:"+ first_page.area[i].areaName);
            as.jp.add(as.rb[i]);
            as.radioGroup.add(as.rb[i]);
            as.add(as.jp);
           /* 
           // setting label
            as.lb[i] = new JLabel(first_page.area[i].areaName);
           // bt.lb[i].setIcon(icon);
            as.jp.add(as.lb[i]);
            as.add(as.jp);*/ 
        }    
        }
        
    /**
     * Remove Trouble marker
     */    
    
    public void Remove_tm(){
    
    }
    
    /**
     * Receive $1 cash
     * Bank.cash keeps track of cash in the bank
     */
    public void Take_one(){
    
        Bank.cash = Bank.cash - 1;
        //first_page.playerObj[first_page.active_turn].cashInHand = first_page.playerObj[first_page.active_turn].cashInHand + 1;
        first_page.playerObj[first_page.active_turn].cashInHand += 1;
        JOptionPane.showMessageDialog(sc, "You received $1", "Error", JOptionPane.WARNING_MESSAGE );
        System.out.println("cash: " + Bank.cash + "===" + first_page.playerObj[first_page.active_turn].cashInHand );
    }
   /**
    * Receive $2 cash
    * Bank.cash keeps track of cash in the bank
    */
    public void Take_two(){
    
        Bank.cash = Bank.cash - 2;
        //first_page.playerObj[first_page.active_turn].cashInHand = first_page.playerObj[first_page.active_turn].cashInHand + 1;
        first_page.playerObj[first_page.active_turn].cashInHand += 2;
        JOptionPane.showMessageDialog(sc, "You received $2", "Error", JOptionPane.WARNING_MESSAGE );
        System.out.println("cash: " + Bank.cash + "===" + first_page.playerObj[first_page.active_turn].cashInHand );
    }
     
    /**
    * Receive $3 cash
    * Bank.cash keeps track of cash in the bank
    */
    public void Take_three(){
    
        Bank.cash = Bank.cash - 3;
        //first_page.playerObj[first_page.active_turn].cashInHand = first_page.playerObj[first_page.active_turn].cashInHand + 1;
        first_page.playerObj[first_page.active_turn].cashInHand += 3;
    JOptionPane.showMessageDialog(sc, "You received $3", "Error", JOptionPane.WARNING_MESSAGE );
        System.out.println("cash: " + Bank.cash + "===" + first_page.playerObj[first_page.active_turn].cashInHand );
    }
     
    /**
    * Receive $4 cash
    * Bank.cash keeps track of cash in the bank
    */
    public void Take_four(){
    
        Bank.cash = Bank.cash - 4;
        //first_page.playerObj[first_page.active_turn].cashInHand = first_page.playerObj[first_page.active_turn].cashInHand + 1;
        first_page.playerObj[first_page.active_turn].cashInHand += 4;
    JOptionPane.showMessageDialog(sc, "You received $4", "Error", JOptionPane.WARNING_MESSAGE );
        System.out.println("cash: " + Bank.cash + "===" + first_page.playerObj[first_page.active_turn].cashInHand );
    }
     
    /**
    * Receive $5 cash
    * Bank.cash keeps track of cash in the bank
    */
    
    public void Take_five(){
    
        Bank.cash = Bank.cash - 5;
        //first_page.playerObj[first_page.active_turn].cashInHand = first_page.playerObj[first_page.active_turn].cashInHand + 1;
        first_page.playerObj[first_page.active_turn].cashInHand += 5;
    JOptionPane.showMessageDialog(sc, "You received $5", "Error", JOptionPane.WARNING_MESSAGE );
        System.out.println("cash: " + Bank.cash + "===" + first_page.playerObj[first_page.active_turn].cashInHand );
    }
    public void Perform_text(){
    
    }
    public void Random_event(){
    
    }
    
    public void Play_another_card(){
    
    }
    
    public void Place_building(){
    
    }
    
    public void Place_minion(){
    
    }
    
    public void Interrupt(){
    
    }
    
    
}
