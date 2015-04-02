package AreaCardEvent;

import static ankh.morpork.AnkhMorpork.stack;
import first_page.Bank;
import first_page.first_page;
import static first_page.first_page.active_turn;
import static first_page.first_page.playerObj;
import static first_page.gameBoard.bt;
import first_page.performText;
import static first_page.performText.tw;
import first_page.textWindow;
import static first_page.textWindow.tw1;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public  class AreaCardEvent{
	public static HashSet<String> addarea1;// = new HashSet<String>();
public static performText pt = new performText();
public static ArrayList<Integer> tmAreas ;
 //public ArrayList<Integer> tmAreas;
		
public  void Dolly_Sisters() {
			/*
			 * TODO select area to place minion
			 */
    bt.setVisible(false);
    addarea1 = new HashSet<String>();
                    tw = new textWindow();
                    tw.setLayout(new FlowLayout()); 
                    tw.setVisible(true);
                    tw.jp.removeAll();
                    tw.jp = new JPanel();
                    tw.playerGroup = new ButtonGroup();
                    tw.TakeCardButton.setVisible(false);
            tw.adjacentButton.setVisible(false);
            tw.discardCardButton.setVisible(false);
            tw.discardCardsButton.setVisible(false);
            tw.giveCardsButton.setVisible(false);
            tw.listButton.setVisible(false);
            tw.playerButton.setVisible(false);
            tw.takeMoneyButton.setVisible(false);
            tw.take5Button.setVisible(false);
            tw.tmButton.setVisible(false);
            tw.sumbolBuildingButton.setVisible(false);
            tw.removetmButton.setVisible(false);
            tw.minionButton.setVisible(true);  	
                    if ((first_page.playerObj[first_page.active_turn].minionInHand <= 0)
					|| (first_page.playerObj[first_page.active_turn].cashInHand < 3)) {
				System.out.println("Insufficient Minion or Cash");
			JOptionPane.showMessageDialog(tw, "You don't have enough minions or cash.", "Message", JOptionPane.WARNING_MESSAGE );
                        } else {
				Bank.cash = Bank.cash + 3;
				first_page.playerObj[first_page.active_turn].cashInHand -= 3;
				first_page.playerObj[first_page.active_turn].points -= 3;
                                
                                int[] adarea = new int[first_page.area[0].adjecent.size()];
                                for(int n=0;n<adarea.length;n++){
                                    adarea[n] =  first_page.area[0].adjecent.get(n);
                                }
                        addarea1.add(first_page.area[0].areaName);
                        for(int j=0;j<adarea.length;j++) {
                        addarea1.add(first_page.area[adarea[j]-1].areaName);
                        System.out.println("adjacent areas:: " + first_page.area[adarea[j]-1].areaName);
                        }    
                        Iterator<String> radio = addarea1.iterator();
                    //    tw.playerGroup = new ButtonGroup();
                    //    tw.jp = new JPanel();
                        for(int j=0;j<addarea1.size();j++){
                        while(radio.hasNext())
                                {
                                String radioname = null;
                                radioname = radio.next();
                                tw.rb[j] = new JRadioButton(radioname);
                                tw.rb[j].setName(radioname);
                                tw.rb[j].setText(radioname);
                                tw.rb[j].setSelected(true);
                                tw.playerGroup.add(tw.rb[j]);
                                tw.jp.add(tw.rb[j]);
                                }
                                tw.add(tw.jp);  
                        }                                                 
                        //first_page.area[0].addMinion();
			}
		}

	
public void Unreal_Estate() 
        {
            bt.setVisible(false);
            	playerObj[active_turn].CardsInHand.add(stack.pop());
                pt.gr32();
                bt.setVisible(true);
                bt.areaPanel.setVisible(false);
        bt.areaPlayButton.setVisible(false);
        
        }

	
public void Dragons_Landing()
      {
          bt.setVisible(false);
			Bank.cash = Bank.cash - 2;
			first_page.playerObj[first_page.active_turn].cashInHand += 2;
			first_page.playerObj[first_page.active_turn].points += 2;
			JOptionPane.showMessageDialog(tw, "You received $2", "Error",JOptionPane.WARNING_MESSAGE);
			System.out.println("cash: " + Bank.cash + "==="
					+ first_page.playerObj[first_page.active_turn].cashInHand);
		
      bt.setVisible(true);
      bt.areaPanel.setVisible(false);
        bt.areaPlayButton.setVisible(false);
        
      }
	

	
	
public void The_Scours() 
             { 
                 bt.setVisible(false);
                 pt.gr32();
			Bank.cash = Bank.cash - 2;
			first_page.playerObj[first_page.active_turn].cashInHand += 2;
			first_page.playerObj[first_page.active_turn].points += 2;
			System.out.println("cash: " + Bank.cash + "==="	+ first_page.playerObj[first_page.active_turn].cashInHand);
		JOptionPane.showMessageDialog(tw, "You received $2 for discarding one card.", "Message",JOptionPane.WARNING_MESSAGE);
               //discard card
               
                bt.setVisible(true);
                bt.areaPanel.setVisible(false);
        bt.areaPlayButton.setVisible(false);
                
             }

public void Small_Gods() 
{
		
	}

		
	
	
	public void The_Hippo() {
            bt.setVisible(false);
			Bank.cash = Bank.cash - 2;
			first_page.playerObj[first_page.active_turn].cashInHand += 2;
			first_page.playerObj[first_page.active_turn].points += 2;
			System.out.println("cash: " + Bank.cash + "==="
					+ first_page.playerObj[first_page.active_turn].cashInHand);
		JOptionPane.showMessageDialog(tw, "You received $2.", "Message",JOptionPane.WARNING_MESSAGE);
        bt.setVisible(true);
        bt.areaPanel.setVisible(false);
        bt.areaPlayButton.setVisible(false);
        
        }
	

	
		public void The_Shades() {
                    bt.setVisible(false);
                addarea1 = new HashSet<String>();
                    tw = new textWindow();
                    tw.setLayout(new FlowLayout()); 
                    tw.setVisible(true);
                    tw.jp.removeAll();
                    tw.jp = new JPanel();
                    tw.playerGroup = new ButtonGroup();
                    tw.TakeCardButton.setVisible(false);
            tw.adjacentButton.setVisible(false);
            tw.discardCardButton.setVisible(false);
            tw.discardCardsButton.setVisible(false);
            tw.giveCardsButton.setVisible(false);
            tw.listButton.setVisible(false);
            tw.playerButton.setVisible(false);
            tw.takeMoneyButton.setVisible(false);
            tw.take5Button.setVisible(false);
            tw.minionButton.setVisible(false);
            tw.sumbolBuildingButton.setVisible(false);
            tw.removetmButton.setVisible(false);
            tw.tmButton.setVisible(true);
		       int[] adarea = new int[first_page.area[6].adjecent.size()];
                                for(int n=0;n<adarea.length;n++){
                                    adarea[n] =  first_page.area[6].adjecent.get(n);
                                }
                        addarea1.add(first_page.area[6].areaName);
                        for(int j=0;j<adarea.length;j++) {
                        addarea1.add(first_page.area[adarea[j]-1].areaName);
                        System.out.println("adjacent areas:: " + first_page.area[adarea[j]-1].areaName);
                            System.out.println("addarea:"+addarea1);
                        }    
                        Iterator<String> radio = addarea1.iterator();
                    //    tw.playerGroup = new ButtonGroup();
                    //    tw.jp = new JPanel();
                        for(int j=0;j<addarea1.size();j++){
                        while(radio.hasNext())
                                {
                                String radioname = null;
                                radioname = radio.next();
                                tw.rb[j] = new JRadioButton();
                                tw.rb[j].setName(radioname);
                                tw.rb[j].setText(radioname);
                                tw.rb[j].setSelected(true);
                                tw.playerGroup.add(tw.rb[j]);
                                tw.jp.add(tw.rb[j]);
                                }
                                tw.add(tw.jp);  
                        } 
		}
	

		public void Dimwell() {
			/*
			 * TODO select area to place minion
			 */
                    addarea1 = new HashSet<String>();
                    bt.setVisible(false);
                    tw = new textWindow();
                    tw.setLayout(new FlowLayout()); 
                    tw.setVisible(true);
                    tw.jp.removeAll();
                    tw.jp = new JPanel();
                    tw.playerGroup = new ButtonGroup();
            tw.TakeCardButton.setVisible(false);
            tw.adjacentButton.setVisible(false);
            tw.discardCardButton.setVisible(false);
            tw.discardCardsButton.setVisible(false);
            tw.giveCardsButton.setVisible(false);
            tw.listButton.setVisible(false);
            tw.playerButton.setVisible(false);
            tw.takeMoneyButton.setVisible(false);
            tw.take5Button.setVisible(false);
            tw.tmButton.setVisible(false);
            tw.sumbolBuildingButton.setVisible(false);
            tw.removetmButton.setVisible(false);
            tw.minionButton.setVisible(true);  	
                    if ((first_page.playerObj[first_page.active_turn].minionInHand <= 0)
					|| (first_page.playerObj[first_page.active_turn].cashInHand < 3)) {
				System.out.println("Insufficient Minion or Cash");
			JOptionPane.showMessageDialog(tw, "You don't have enough minions or cash.", "Message", JOptionPane.WARNING_MESSAGE );
                        } else {
				Bank.cash = Bank.cash + 3;
				first_page.playerObj[first_page.active_turn].cashInHand -= 3;
				first_page.playerObj[first_page.active_turn].points -= 3;
                                
                                int[] adarea = new int[first_page.area[7].adjecent.size()];
                                for(int n=0;n<adarea.length;n++){
                                    adarea[n] =  first_page.area[7].adjecent.get(n);
                                }
                        addarea1.add(first_page.area[7].areaName);
                        for(int j=0;j<adarea.length;j++) {
                        addarea1.add(first_page.area[adarea[j]-1].areaName);
                        System.out.println("adjacent areas:: " + first_page.area[adarea[j]-1].areaName);
                        }    
                        Iterator<String> radio = addarea1.iterator();
                    //    tw.playerGroup = new ButtonGroup();
                    //    tw.jp = new JPanel();
                        for(int j=0;j<addarea1.size();j++){
                        while(radio.hasNext())
                                {
                                String radioname = null;
                                radioname = radio.next();
                                tw.rb[j] = new JRadioButton(radioname);
                                tw.rb[j].setName(radioname);
                                tw.rb[j].setText(radioname);
                                tw.rb[j].setSelected(true);
                                tw.playerGroup.add(tw.rb[j]);
                                tw.jp.add(tw.rb[j]);
                                }
                                tw.add(tw.jp);  
                        }                                                 
                        //first_page.area[0].addMinion();
			}
}

	

	
		public void Longwall() {
                    bt.setVisible(false);
			Bank.cash = Bank.cash - 1;
			first_page.playerObj[first_page.active_turn].cashInHand += 1;
			first_page.playerObj[first_page.active_turn].points += 1;
			System.out.println("cash: " + Bank.cash + "==="
					+ first_page.playerObj[first_page.active_turn].cashInHand);
		JOptionPane.showMessageDialog(tw, "You received $1.", "Message", JOptionPane.WARNING_MESSAGE );
                bt.setVisible(true);
                bt.areaPanel.setVisible(false);
        bt.areaPlayButton.setVisible(false);
        
                }
	

	
           // = new ArrayList<Integer>();
		
		public void Isle_of_Gods() {
                    bt.setVisible(false);
                    addarea1 = new HashSet<String>();
                    tmAreas = new ArrayList<Integer>();
                    for(int i=0;i<12;i++){
                    if(first_page.area[i].troubleMarker)
                    {
                        tmAreas.add(i);
                    }
                    }
                    if(tmAreas.size()>0){
                        tw = new textWindow();
                    tw.setVisible(true);
                    tw.jp.removeAll();
                    tw.jp = new JPanel();
                    tw.playerGroup = new ButtonGroup();
            tw.TakeCardButton.setVisible(false);
            tw.adjacentButton.setVisible(false);
            tw.discardCardButton.setVisible(false);
            tw.discardCardsButton.setVisible(false);
            tw.giveCardsButton.setVisible(false);
            tw.listButton.setVisible(false);
            tw.playerButton.setVisible(false);
            tw.takeMoneyButton.setVisible(false);
            tw.take5Button.setVisible(false);
            tw.tmButton.setVisible(false);
            tw.minionButton.setVisible(false);
            tw.sumbolBuildingButton.setVisible(false);
            tw.removetmButton.setVisible(true);
                    Iterator<Integer> radio = tmAreas.iterator();
                    //    tw.playerGroup = new ButtonGroup();
                    //    tw.jp = new JPanel();
                        for(int j=0;j<addarea1.size();j++){
                        while(radio.hasNext())
                                {
                                Integer radioname = null;
                                radioname = radio.next();
                                tw.rb[j] = new JRadioButton();
                                tw.rb[j].setName(String.valueOf(radioname));
                                tw.rb[j].setText(String.valueOf(radioname));
                                tw.rb[j].setSelected(true);
                                tw.playerGroup.add(tw.rb[j]);
                                tw.jp.add(tw.rb[j]);
                                }
                                tw.add(tw.jp);  
                        }       
                    }else
                    {
                        JOptionPane.showMessageDialog(tw, "No area has trouble marker present", "Message", JOptionPane.WARNING_MESSAGE );
                    bt.setVisible(true);
                    bt.areaPanel.setVisible(false);
        bt.areaPlayButton.setVisible(false);
        
                    } 
                
                
                }
	
	
		public void Seven_Sleepers() {
                    bt.setVisible(false);
			Bank.cash = Bank.cash - 3;
			first_page.playerObj[first_page.active_turn].cashInHand += 3;
			first_page.playerObj[first_page.active_turn].points += 3;
			System.out.println("cash: " + Bank.cash + "==="
					+ first_page.playerObj[first_page.active_turn].cashInHand);
		JOptionPane.showMessageDialog(tw, "you received $3.", "Message", JOptionPane.WARNING_MESSAGE ); 
                bt.setVisible(true);
                bt.areaPanel.setVisible(false);
        bt.areaPlayButton.setVisible(false);
        
                }
	

	
		public void Nap_Hill() {
                    bt.setVisible(false);
			Bank.cash = Bank.cash - 1;
			first_page.playerObj[first_page.active_turn].cashInHand += 1;
			first_page.playerObj[first_page.active_turn].points += 1;
			System.out.println("cash: " + Bank.cash + "==="
					+ first_page.playerObj[first_page.active_turn].cashInHand);
		JOptionPane.showMessageDialog(tw, "You received $1.", "Message", JOptionPane.WARNING_MESSAGE ); 
                bt.setVisible(true);
                bt.areaPanel.setVisible(false);
        bt.areaPlayButton.setVisible(false);
        
                
                }
	
}
