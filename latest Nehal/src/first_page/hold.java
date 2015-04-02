/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_page;

import static first_page.Symbols.as;
//import static first_page.Symbols.sc;
import static first_page.first_page.active_turn;
import static first_page.first_page.area;
import static first_page.first_page.gb;
import static first_page.first_page.playerObj;
//import static first_page.gameArea.demonsPresent;
import static first_page.gameBoard.bt;
import javax.swing.JOptionPane;


/**
 *
 * @author n_bhaga
 * functions that need to be checked on each turn that is who controls the area plus winning conditions are fulfilled or not.
 * @param totalr total pieces of red player
 * @param totalg total pieces of green player
 * @param totaly total pieces of yellow player
 * @param totalb total pieces of blue player
 */
public class hold {
    int totaly=0,totalg=0,totalr=0,totalb=0;
    public void areaControl(){
    //    int fred=0,fblue=0,fgreen=0,fyellow=0;
        for(int i=0;i<12;i++){
                if(area[i].demonsPresent>0)
                   area[i].areaPower = null ;
                else{
                for(int j=0;j<first_page.playerObj.length;j++)
                {
                String c=first_page.playerObj[j].Color;
                switch(c){
                  // checking how many minions the player is having 
                    case "red" :
                        totalr=area[i].redMinion;
                        if("red".equals(area[i].buildingPresent))
                           totalr+=1;
                    case "blue" :
                        totalb=area[i].blueMinion;
                        if("red".equals(area[i].buildingPresent))
                           totalb+=1;
                    case "green" :
                        totalg=area[i].greenMinion;
                        if("red".equals(area[i].buildingPresent))
                           totalg+=1;
                    case "yellow" :
                        totaly=area[i].yellowMinion;
                        if("red".equals(area[i].buildingPresent))
                           totaly+=1;
                }
                }

    /*            if(area[i].buildingPresent=="red")
                {
                fred=+1;
                }
                 if(area[i].buildingPresent=="blue")
                {
                fblue=+1;
                }
                 if(area[i].buildingPresent=="green")
                {
                fgreen=+1;
                }
                  if(area[i].buildingPresent=="yellow")
                {
                fyellow=+1;
                }
    */            
                //You would also have to have more pieces in the area than the total number of trolls in the area. 
            if(totalr>totaly && totalr>totalg && totalr>totalb )
            {
                if(totalr>area[i].trollsPresent)
                {
                    area[i].areaPower="red";
                    for(int j=0;j<playerObj.length;j++){    // setting players' area control variable
                        if(playerObj[j].Color == "red")
                            playerObj[j].controlCount++;    // number of areas the player controls needs to be increased
                    }
                }
            }else if(totaly>totalg && totaly>totalb)
            {   
                if(totaly>area[i].trollsPresent)
                {
                    area[i].areaPower="yellow";
                    for(int j=0;j<playerObj.length;j++){    // setting players' area control variable
                        if(playerObj[j].Color == "yellow")
                            playerObj[j].controlCount++;    // number of areas the player controls needs to be increased
                    }
                }
            }else if(totalg>totalb)
            {
                if(totalg>area[i].trollsPresent)
                {
                    area[i].areaPower="green";
                    for(int j=0;j<playerObj.length;j++){    // setting players' area control variable
                        if(playerObj[j].Color == "green")
                            playerObj[j].controlCount++;    // number of areas the player controls needs to be increased
                    }
                }
            }else if(totalb>totalg)
            {
                if(totalb>area[i].trollsPresent)
                {
                    area[i].areaPower="blue";
                    for(int j=0;j<playerObj.length;j++){    // setting players' area control variable
                        if(playerObj[j].Color == "blue")
                            playerObj[j].controlCount++;    // number of areas the player controls needs to be increased
                    }
                }
            }  else
                area[i].areaPower=null;
        }
    }
        JOptionPane.showMessageDialog(as, "the area " + area[0].areaName +" is controlled by " +  area[0].areaPower +
                "\nthe area "+ area[1].areaName + " is controlled by " + area[1].areaPower +
                "\nthe area "+ area[2].areaName +  " is controlled by " + area[2].areaPower +
                "\nthe area "+ area[3].areaName + " is controlled by " + area[3].areaPower +
                "\nthe area "+ area[4].areaName + " is controlled by " + area[4].areaPower +
                "\nthe area "+ area[5].areaName + " is controlled by " + area[5].areaPower +
                "\nthe area "+ area[6].areaName + " is controlled by " + area[6].areaPower +
                "\nthe area "+ area[7].areaName + " is controlled by " + area[7].areaPower +
                "\nthe area "+ area[8].areaName + " is controlled by " + area[8].areaPower +
                "\nthe area "+ area[9].areaName + " is controlled by " + area[9].areaPower +
                "\nthe area "+ area[10].areaName + " is controlled by " + area[10].areaPower +
                "\nthe area "+ area[11].areaName + " is controlled by " + area[11].areaPower, "Error", JOptionPane.WARNING_MESSAGE );
}    

    /**
     * method for checking the winning condition for each assigned personality
     */
    public void winCondition(){
    
        String person = first_page.playerObj[active_turn].Personality ;
        
        switch(person){
            case "LORD RUST" :
            case "LORD DE WORDE" : 
            case "LORD SELACHII" :  if(playerObj.length == 2){
                                        if(playerObj[active_turn].controlCount ==7)
                                        {  JOptionPane.showMessageDialog(bt, "Player " + active_turn+1 + " having personality as "+ playerObj[active_turn].Personality + " wins the game as the winning condition of controlling 7 areas has been fulfilled.", "Message", JOptionPane.WARNING_MESSAGE );  
                                            gb.beginTurnButton.setEnabled(false);
                                            gb.endTurnButton.setEnabled(false);
                                        }    
                                    }
                                    else if(playerObj.length == 3){
                                        if(playerObj[active_turn].controlCount ==5)
                                        {  JOptionPane.showMessageDialog(bt, "Player " + active_turn+1 + " having personality as "+ playerObj[active_turn].Personality + " wins the game as the winning condition of controlling 5 areas has been fulfilled.", "Message", JOptionPane.WARNING_MESSAGE );  
                                            gb.beginTurnButton.setEnabled(false);
                                            gb.endTurnButton.setEnabled(false);
                                        }    
                                    }
                                    else if(playerObj.length == 4){
                                        if(playerObj[active_turn].controlCount ==4)
                                        {  JOptionPane.showMessageDialog(bt, "Player " + active_turn+1 + " having personality as "+ playerObj[active_turn].Personality + " wins the game as the winning condition of controlling 4 areas has been fulfilled.", "Message", JOptionPane.WARNING_MESSAGE );  
                                            gb.beginTurnButton.setEnabled(false);
                                            gb.endTurnButton.setEnabled(false);
                                        }    
                                    }
                                    break;
                
            case "DRADON KING OF ARMS" :    if(Bank.TroubleMarkers_not_on_board <=4)
                                            {
                                                JOptionPane.showMessageDialog(bt, "Player " + active_turn+1 + " having personality as "+ playerObj[active_turn].Personality + " wins the game as the winning condition \n\" 8 OR MORE TROUBLE MARKERS ON THE BOARD \"\n fulfills.", "Message", JOptionPane.WARNING_MESSAGE );  
                                                gb.beginTurnButton.setEnabled(false);
                                                gb.endTurnButton.setEnabled(false);
                                            }
                                            break;
                
            case "CHRYSOPRASE" :    if(playerObj[active_turn].points >= 50)
                                    {
                                        JOptionPane.showMessageDialog(bt, "Player " + active_turn+1 + " having personality as "+ playerObj[active_turn].Personality + " wins the game as the winning condition of having net worth of $50 or more fulfills. ", "Message", JOptionPane.WARNING_MESSAGE );
                                        gb.beginTurnButton.setEnabled(false);
                                        gb.endTurnButton.setEnabled(false);
                                    }
                                    break;
            
            case "LORD VETINARI" :  if(playerObj.length == 2){
                                        if(playerObj[active_turn].minionAreaCount.size() ==11)
                                        {  JOptionPane.showMessageDialog(bt, "Player " + active_turn+1 + " having personality as "+ playerObj[active_turn].Personality + " wins the game as the winning condition of having minions in 11 areas fulfilles.", "Message", JOptionPane.WARNING_MESSAGE );  
                                            gb.beginTurnButton.setEnabled(false);
                                            gb.endTurnButton.setEnabled(false);
                                        }    
                                    }
                                    else if(playerObj.length == 3){
                                        if(playerObj[active_turn].minionAreaCount.size() ==10)
                                        {  JOptionPane.showMessageDialog(bt, "Player " + active_turn+1 + " having personality as "+ playerObj[active_turn].Personality + " wins the game as the winning condition of having minions in 10 areas fulfilles.", "Message", JOptionPane.WARNING_MESSAGE );  
                                            gb.beginTurnButton.setEnabled(false);
                                            gb.endTurnButton.setEnabled(false);
                                        }    
                                    }
                                    else if(playerObj.length == 4){
                                        if(playerObj[active_turn].minionAreaCount.size() ==9)
                                        {  JOptionPane.showMessageDialog(bt, "Player " + active_turn+1 + " having personality as "+ playerObj[active_turn].Personality + " wins the game as the winning condition of having minions in 9 areas fulfilles.", "Message", JOptionPane.WARNING_MESSAGE );  
                                            gb.beginTurnButton.setEnabled(false);
                                            gb.endTurnButton.setEnabled(false);
                                        }    
                                    }
                                    break;
                
            case "COMMANDER VIMES" :    System.out.println("condition is checked on empty stack on endTurn button.");
    }
    }
}
