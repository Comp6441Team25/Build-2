/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_page;

import static first_page.first_page.active_turn;
import java.util.ArrayList;

/**
 *@param areaName name of the area
 * @param areaNumber number of the area
 * @param buildCost cost to build the building on the area
 * @param minionsPresent minions on the area
 * @param buildingPresent area contains building or not
 * @param trollsPresent number of trolls on the area
 * @param demonsPresent number of demons on the area
 * @param troubleMarker area contains trouble marker or not
 * @author Dell
 */
public class gameArea {
    
    String areaName;
	int areaNumber;
	int buildCost;
	ArrayList<Integer> adjecent;// = new Integer[5] ;
        boolean floodable;
        String areaHold;
    
    
    public gameArea(String name, int number, int cost,boolean flood,String hold,ArrayList<Integer> adjecent){
    //int[] adjecent
        this.areaName = name;
	this.areaNumber = number;
	this.buildCost = cost;
        this.adjecent = adjecent;
        this.floodable = flood;
        this.areaHold = hold;
    }
    
        public String areaPower;
	public  int redMinion = 0;
        public  int greenMinion = 0;
        public  int blueMinion = 0;
        public  int yellowMinion = 0;
	public  String buildingPresent = null;
	public  int trollsPresent = 0;
	public static int demonsPresent = 0;
        public static String buildingAccess = null; //who can put building in this area
	public boolean troubleMarker = false;

        /**
         * minions to appropriate area
         * @param c gets color for the current player
         */
        public  void addMinion(){
           
        first_page.playerObj[first_page.active_turn].minionInHand-=1;
        String c=first_page.playerObj[first_page.active_turn].Color;
        switch(c)
        {
             case "red":  redMinion+=1;
                             break;
             case "green": greenMinion+=1;
                             break;
             case "blue": blueMinion+=1;
                             break;
             case "yellow" :yellowMinion+=1;
                             break;
             default :System.out.println("invalid color");
                 break;
        }
        }
        
        public void removeMinion(){
        first_page.playerObj[first_page.active_turn].minionInHand+=1;
        String c=first_page.playerObj[first_page.active_turn].Color;
        switch(c)
        {
            case "red":redMinion-=1;
                             break;
             case "green":greenMinion-=1;
                             break;
             case "blue":blueMinion-=1;
                             break;
             case "yellow":yellowMinion-=1;
                             break;
             default :System.out.println("invalid color");
                 break;
        }
        }
        public void addBuilding(){
              
            String c=first_page.playerObj[first_page.active_turn].Color;
               first_page.playerObj[first_page.active_turn].buildInHand-=1;
              // first_page.playerObj[first_page.active_turn].Property[Player.propertyCount]=
               buildingPresent=c;
        } 
        
        public void removeBuilding(){
         String c=first_page.playerObj[first_page.active_turn].Color;
               first_page.playerObj[first_page.active_turn].buildInHand+=1;
               buildingPresent=null;     
        }
        public void addDemon(){
            demonsPresent+=1;
              
       }
        public void removeDemon(){
                demonsPresent-=1;
        }
        public void addTroubleMarker(){
        troubleMarker=true;
        }
        public void removeTroubleMarker(){
        troubleMarker=false;
        }        
        public void addTroll(){
        trollsPresent+=1;
        }
        public void removeTroll(){
            trollsPresent-=1;
        }
        public void getArea(){
            for(int i=0;i<first_page.playerObj.length;i++){
         //   Bank.areaCount = 12 - first_page.playerObj[i].Property.length;
        }
        }
}
