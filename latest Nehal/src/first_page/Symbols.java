/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_page;
import static first_page.Bank.cash;
import static first_page.Bank.change;
import static first_page.first_page.active_turn;
import static first_page.first_page.playerObj;
import static first_page.gameBoard.bt;
import static first_page.gameBoard.sc;
import first_page.randomEvent.events;
import static first_page.randomEvent.theDragon.area;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.HashMap;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon; 
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author n_bhaga
 */
public class Symbols {
    
    public static selectedCard sc = new selectedCard();
    public static actionSymbol as = new actionSymbol();
    List<String> tm_areas = new ArrayList<String>();
    public static String selectedArea = null;
    String from_area = null;
    String to_area = null;
    public static int getarea=0;
    public static String temp =null;
    public gameArea[] area=new gameArea[12];
    public String area1 = null;
    public static String tempradio = null;
    public HashSet<String> addarea = new HashSet<String>();
    enum color
    {
    RED,GREEN,YELLOW,BLUE;
    
    }
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
    public boolean Assassin(){
    
    /*    
        
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

        
        
        as.jb.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
             
        if(as.rb[0].isSelected())
        {
        // display list for trouble marker
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
        
        }    
       }
        
        if(as.rb[1].isSelected())
        {
            for(int i=0;i<12;i++){
            
                if(playerObj[active_turn].Color == "red"){
                
                    if(first_page.area[i].minionsPresent[1] != 0){
                    
                    as.lb[i] = new JLabel("Green:");
                    as.add(as.lb[i]);
                    as.rb[i] = new JRadioButton(first_page.area[i].areaName);
                    as.rb[i].setName(first_page.area[i].areaName);
                    as.rb[i].setText(first_page.area[i].areaName);
                    as.jp.add(as.rb[i]);
                    as.radioGroup.add(as.rb[i]);
                    }
                    if(first_page.area[i].minionsPresent[2] != 0){
                    
                    as.lb[i] = new JLabel("Green:");
                    as.add(as.lb[i]);
                    as.rb[i] = new JRadioButton(first_page.area[i].areaName);
                    as.rb[i].setName(first_page.area[i].areaName);
                    as.rb[i].setText(first_page.area[i].areaName);
                    as.jp.add(as.rb[i]);
                    as.radioGroup.add(as.rb[i]);
               }
          if(playerObj[active_turn].Color == "green"){
                
                }
            if(playerObj[active_turn].Color == "blue"){
                
                }
            if(playerObj[active_turn].Color == "yellow"){
                
                }
            
            }
            
        }
        
       }
        }
             });
        
    */
    return true;
    }
    
    public boolean Remove_tm(){
    
        
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
        
        }    
        as.jb = new JButton("Remove Trouble Marker");
        as.add(as.jb,BorderLayout.CENTER);

        as.jb.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            for (Enumeration<AbstractButton> buttons = as.radioGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
                if (button.isSelected()) {
                    selectedArea = button.getName();
                }
            }
            System.out.println("nehal selected area:" + selectedArea);
            for(int i=0;i<12;i++){
                if(first_page.area[i].areaName == selectedArea)
                {
                    first_page.area[i].troubleMarker = false;
                    Bank.TroubleMarkers_not_on_board++;
                    JOptionPane.showMessageDialog(as, "Trouble Marker has been removed from " +selectedArea+" successfully", "Error", JOptionPane.WARNING_MESSAGE );
                    System.out.println("new bank status:"+Bank.TroubleMarkers_not_on_board);
                    break;
                }
            }
            }        
        });

        as.setVisible(false);
        return true;
    
    }
    
    public boolean Take_one(){
    
        Bank.cash = Bank.cash - 1;
        first_page.playerObj[first_page.active_turn].cashInHand += 1;
        JOptionPane.showMessageDialog(sc, "You received $1", "Error", JOptionPane.WARNING_MESSAGE );
        System.out.println("cash: " + Bank.cash + "===" + first_page.playerObj[first_page.active_turn].cashInHand );
        as.setVisible(false);
        return true;
    }
   
    public boolean Take_two(){
    
        Bank.cash = Bank.cash - 2;
        first_page.playerObj[first_page.active_turn].cashInHand += 2;
        JOptionPane.showMessageDialog(sc, "You received $2", "Error", JOptionPane.WARNING_MESSAGE );
        System.out.println("cash: " + Bank.cash + "===" + first_page.playerObj[first_page.active_turn].cashInHand );
        as.setVisible(false);
        return true;
    }
    
    public boolean Take_three(){
    
        Bank.cash = Bank.cash - 3;
        first_page.playerObj[first_page.active_turn].cashInHand += 3;
        JOptionPane.showMessageDialog(sc, "You received $3", "Error", JOptionPane.WARNING_MESSAGE );
        System.out.println("cash: " + Bank.cash + "===" + first_page.playerObj[first_page.active_turn].cashInHand );
        as.setVisible(false);
        return true;
    }
    
    public boolean Take_four(){
    
        Bank.cash = Bank.cash - 4;
        first_page.playerObj[first_page.active_turn].cashInHand += 4;
        JOptionPane.showMessageDialog(sc, "You received $4", "Error", JOptionPane.WARNING_MESSAGE );
        System.out.println("cash: " + Bank.cash + "===" + first_page.playerObj[first_page.active_turn].cashInHand );
        as.setVisible(false);
        return true;
    }
    
    public boolean Take_five(){
    
        Bank.cash = Bank.cash - 5;
        first_page.playerObj[first_page.active_turn].cashInHand += 5;
        JOptionPane.showMessageDialog(sc, "You received $5", "Message", JOptionPane.WARNING_MESSAGE );
        System.out.println("cash: " + Bank.cash + "===" + first_page.playerObj[first_page.active_turn].cashInHand );
        as.setVisible(false);
        return true;
    }
    
    public boolean Perform_text(){
    return true;
    }
    
    public boolean Random_event(){
        int dice = 0;
        as.setVisible(true);
        dice = events.rolldice();
        final ImageIcon icon1 = new javax.swing.ImageIcon(getClass().getResource("\\Random\\0.png"));
        JOptionPane.showMessageDialog(null, "The selected random Event card:", "Random Event:",
        JOptionPane.INFORMATION_MESSAGE,   icon1);        
        JOptionPane.showMessageDialog(sc, "All the areas have been reinitialized:", "Error", JOptionPane.WARNING_MESSAGE );
        System.out.println("details after dragon event: area name:"+ area[0].areaName+"red minions:"+
        area[dice].redMinion+"blue minion:"+
        area[dice].blueMinion+ "green minion:"+
        area[dice].greenMinion+"yellow minion:"+
        area[dice].yellowMinion+"trolls present:"+
        area[dice].trollsPresent+"buildings present:"+
        area[dice].buildingPresent+"demons present:"+
        area[dice].demonsPresent);
        return true;
    }
    
    public boolean Play_another_card(){
    return true;
    }
    
    public boolean Place_building(){
        as.setLayout(new FlowLayout()); 
        as.setVisible(true);
        as.placeMinionButton.setVisible(false);
        as.placeBuildingButton.setVisible(true);
        if(first_page.playerObj[first_page.active_turn].buildInHand == 0)
        {
            as.lb[0] = new JLabel("From which area you want to move your building?");
            for(int i=0;i<12;i++){
            if(first_page.area[i].buildingPresent == first_page.playerObj[first_page.active_turn].Color ){
            as.rb[i] = new JRadioButton(first_page.area[i].areaName);
            as.rb[i].setName(first_page.area[i].areaName);
            as.rb[i].setText(first_page.area[i].areaName);
            as.jp.add(as.rb[i]);
            as.radioGroup.add(as.rb[i]);
            as.add(as.jp);
            }
            }
        }
        for(int i=0;i<12;i++){
        String current;
        current = first_page.playerObj[first_page.active_turn].Color;
            switch(current){
                
                    case "red":
                        if(first_page.area[i].redMinion > first_page.area[i].greenMinion
                                && first_page.area[i].redMinion > first_page.area[i].blueMinion
                                && first_page.area[i].redMinion > first_page.area[i].yellowMinion
                                && first_page.area[i].redMinion > first_page.area[i].demonsPresent
                                && first_page.area[i].redMinion > first_page.area[i].trollsPresent){
                                first_page.area[i].buildingAccess = "red";
                        }
                    break;
            
                    case "green":
                        if(first_page.area[i].greenMinion > first_page.area[i].redMinion
                                && first_page.area[i].greenMinion > first_page.area[i].blueMinion
                                && first_page.area[i].greenMinion > first_page.area[i].yellowMinion
                                && first_page.area[i].greenMinion > first_page.area[i].demonsPresent
                                && first_page.area[i].greenMinion > first_page.area[i].trollsPresent){
                                first_page.area[i].buildingAccess = "green";
                        }
                    break;
                        
                    case "blue":
                        if(first_page.area[i].blueMinion > first_page.area[i].greenMinion
                                && first_page.area[i].blueMinion > first_page.area[i].redMinion
                                && first_page.area[i].blueMinion > first_page.area[i].yellowMinion
                                && first_page.area[i].blueMinion > first_page.area[i].demonsPresent
                                && first_page.area[i].blueMinion > first_page.area[i].trollsPresent){
                                first_page.area[i].buildingAccess = "blue";
                        }
                    break;
                        
                    case "yellow":
                        if(first_page.area[i].yellowMinion > first_page.area[i].greenMinion
                                && first_page.area[i].yellowMinion > first_page.area[i].blueMinion
                                && first_page.area[i].yellowMinion > first_page.area[i].redMinion
                                && first_page.area[i].yellowMinion > first_page.area[i].demonsPresent
                                && first_page.area[i].yellowMinion > first_page.area[i].trollsPresent){
                                first_page.area[i].buildingAccess = "yellow";
                        }
                    break;
                
                }}
        
            as.lb1[0] = new JLabel("To which area you want to move your building?");
            for(int i=0;i<12;i++){
                if(first_page.area[i].buildingPresent == null && first_page.area[i].troubleMarker ==false && first_page.playerObj[first_page.active_turn].Color == first_page.area[i].buildingAccess ){

                as.rb1[i] = new JRadioButton(first_page.area[i].areaName);
                as.rb1[i].setName(first_page.area[i].areaName);
                as.rb1[i].setText(first_page.area[i].areaName);

                as.jp1.add(as.rb1[i]);
                as.radioGroup1.add(as.rb1[i]);
                as.add(as.jp1);

                }
        /*    as.jb = new JButton("Place building");
            as.add(as.jb,BorderLayout.CENTER);

            as.jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                for (Enumeration<AbstractButton> buttons = as.radioGroup.getElements(); buttons.hasMoreElements();) {
                AbstractButton button = buttons.nextElement();
                if (button.isSelected()) {
                        from_area = button.getName();
                    }
                }
                for (Enumeration<AbstractButton> buttons = as.radioGroup1.getElements(); buttons.hasMoreElements();) {
                AbstractButton button = buttons.nextElement();
                if (button.isSelected()) {
                        to_area = button.getName();
                    }
                }
                for(int i=0;i<12;i++){
                if(first_page.area[i].areaName == from_area){    
                        first_page.area[i].buildingPresent = null;
                        playerObj[active_turn].Property.remove(from_area);
                }
                else if(first_page.area[i].areaName == to_area)
                {   
                        first_page.area[i].buildingPresent = first_page.playerObj[first_page.active_turn].Color;
                        playerObj[active_turn].Property.add(to_area);
                        if(playerObj[active_turn].buildInHand !=0)
                        playerObj[active_turn].buildInHand--;
                }
                }
            }
            });*/
            }
            as.setVisible(false);
    return true;
    }
    
    public boolean Place_minion(){
        
        as.setLayout(new FlowLayout()); 
        as.setVisible(true);
        as.placeMinionButton.setVisible(true);
        as.placeBuildingButton.setVisible(false);
       
        if(first_page.playerObj[first_page.active_turn].minionInHand == 0){
            as.lb[0] = new JLabel("From which area you want to move your minions?");
            for(int i=0;i<12;i++){
            String current;
            current = first_page.playerObj[first_page.active_turn].Color;
           
            switch(current){
                
            case "red":
            if(first_page.area[i].redMinion >0 ){
            as.rb[i] = new JRadioButton(first_page.area[i].areaName);
            as.rb[i].setName(first_page.area[i].areaName);
            as.rb[i].setText(first_page.area[i].areaName);
            as.jp.add(as.rb[i]);
            as.radioGroup.add(as.rb[i]);
            as.add(as.jp);
            }
            
            case "green":
            if(first_page.area[i].greenMinion >0 ){
            as.rb[i] = new JRadioButton(first_page.area[i].areaName);
            as.rb[i].setName(first_page.area[i].areaName);
            as.rb[i].setText(first_page.area[i].areaName);
            as.jp.add(as.rb[i]);
            as.radioGroup.add(as.rb[i]);
            as.add(as.jp);
            }
            
            case "blue":
            if(first_page.area[i].blueMinion >0 ){
            as.rb[i] = new JRadioButton(first_page.area[i].areaName);
            as.rb[i].setName(first_page.area[i].areaName);
            as.rb[i].setText(first_page.area[i].areaName);
            as.jp.add(as.rb[i]);
            as.radioGroup.add(as.rb[i]);
            as.add(as.jp);
            }
            
            case "yellow":
            if(first_page.area[i].yellowMinion >0 ){
            as.rb[i] = new JRadioButton(first_page.area[i].areaName);
            as.rb[i].setName(first_page.area[i].areaName);
            as.rb[i].setText(first_page.area[i].areaName);
            as.jp.add(as.rb[i]);
            as.radioGroup.add(as.rb[i]);
            as.add(as.jp);
            }
            }
            }
        }
        
        as.lb1[0] = new JLabel("To which area you want to move your minions?");
        as.add(as.lb1[0]);
        for(int i=0;i<12;i++){
            String current;
            current = first_page.playerObj[first_page.active_turn].Color;
                switch(current){
                
                case "red":
                if(first_page.area[i].redMinion >0){
                addarea.add(first_page.area[i].areaName);
                System.out.println("red temp variable is:in addarea " + addarea + "value i:"+ i);
                int[] adarea = new int[first_page.area[i].adjecent.size()];
                for(int n=0;n<adarea.length;n++){
                adarea[n] =  first_page.area[i].adjecent.get(n);
                }
                
                for(int j=0;j<adarea.length;j++) {
                if(temp!=first_page.area[adarea[j]-1].areaName)            
                {
                    addarea.add(first_page.area[adarea[j]-1].areaName);
                    System.out.println("red temp :" + first_page.area[adarea[j]-1].areaName);
                    System.out.println("new nehal; in addarea " + addarea + "i:" + i + "J:" + j);
                    temp = first_page.area[adarea[j]-1].areaName;
                }
                }    
                }break; 

                case "yellow":
                if(first_page.area[i].yellowMinion >0){
                addarea.add(first_page.area[i].areaName);
                System.out.println("yellow temp variable is: in addarea " + addarea+ "value i:"+ i);
                int[] adarea = new int[first_page.area[i].adjecent.size()];
                for(int n=0;n<adarea.length;n++){
                adarea[n] =  first_page.area[i].adjecent.get(n);
                }
                for(int j=0;j<adarea.length;j++) {
                if(temp!=first_page.area[adarea[j]-1].areaName)            
                {
                addarea.add(first_page.area[adarea[j]-1].areaName);
                System.out.println("yellow temp :" + first_page.area[adarea[j]-1].areaName);
                System.out.println("new nehal in addarea:" + addarea + "value i:"+ i + "J:" + j);
                temp = first_page.area[adarea[j]-1].areaName;
                System.out.println("new yellow temp :" + temp );
                }
                }
                }break;
              
                case "green":
                if(first_page.area[i].greenMinion >0){
                addarea.add(first_page.area[i].areaName);
                System.out.println("green temp variable is:in addarea " + addarea + "value i:"+ i);
                int[] adarea = new int[first_page.area[i].adjecent.size()];
                for(int n=0;n<adarea.length;n++){
                adarea[n] =  first_page.area[i].adjecent.get(n);
                }
                for(int j=0;j<adarea.length;j++) {
                if(temp!=first_page.area[adarea[j]-1].areaName)            
                {            
                addarea.add(first_page.area[adarea[j]-1].areaName);
                System.out.println("green temp :" + first_page.area[adarea[j]-1].areaName);
                System.out.println("new nehal in addarea:" + addarea+"value i:"+ i + "J:" + j);
                temp = first_page.area[adarea[j]-1].areaName;
                System.out.println("new green temp :" + temp );
                }
                }    
                }break;

                case "blue":
                if(first_page.area[i].blueMinion >0){
                addarea.add(first_page.area[i].areaName);
                System.out.println("blue temp variable is:in addarea " + addarea + "value i:"+ i);
                int[] adarea = new int[first_page.area[i].adjecent.size()];
                for(int n=0;n<adarea.length;n++){
                adarea[n] =  first_page.area[i].adjecent.get(n);
                }
                for(int j=0;j<adarea.length;j++) {
                if(temp!=first_page.area[adarea[j]-1].areaName)            
                {            
                addarea.add(first_page.area[adarea[j]-1].areaName);
                System.out.println("blue temp :" + addarea+"value i:"+ i + "J:" + j);           
                temp = first_page.area[adarea[j]-1].areaName;
                System.out.println("new blue temp :" + temp );
                }
                }    
                }break;
                }

        }   // end of for loop
        
        System.out.println("new nehal radio:" + addarea);
        Iterator<String> radio = addarea.iterator();
	
        for(int j=0;j<addarea.size();j++){
        while(radio.hasNext())
                {
                String radioname = null;
                radioname = radio.next();
                as.rb[j] = new JRadioButton(radioname);
                as.rb[j].setName(radioname);
                as.rb[j].setText(radioname);
                as.rb[j].setSelected(true);
                as.jp.add(as.rb[j]);
                as.radioGroup.add(as.rb[j]);
                }
        as.add(as.jp);  
    /*    as.jb = new JButton("Place Minion");
        as.add(as.jb,BorderLayout.CENTER);
        as.jb.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            for (Enumeration<AbstractButton> buttons = as.radioGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                   area1 = button.getName();
            }
            }
            for(int i=0;i<12;i++){
            if(first_page.area[i].areaName == area1)
            {
                first_page.area[i].addMinion();
                System.out.println("area name:"+ area[i].areaName);
                first_page.playerObj[active_turn].minionAreaCount.add(area[i].areaName);
                System.out.println("minionarea count: " + first_page.playerObj[active_turn].minionAreaCount);
                System.out.println("red minion: "+ first_page.area[i].redMinion);
                System.out.println("green minion: "+ first_page.area[i].greenMinion);
                System.out.println("yellow minion: "+ first_page.area[i].yellowMinion);
                System.out.println("blue minion: "+ first_page.area[i].blueMinion);
            }
            }
            System.out.println("minions in hand:" + first_page.playerObj[first_page.active_turn].minionInHand);
            System.out.println("total areas in which player is having his minions:" + first_page.playerObj[active_turn].minionAreaCount );
            JOptionPane.showMessageDialog(as, "Minion has been moved successfully to " + area1, "Error", JOptionPane.WARNING_MESSAGE );
            as.setVisible(false);
        }
        });*/
        }
        return true;
    }
    
    public boolean Interrupt(){
    return true;
    }
    
    
}
