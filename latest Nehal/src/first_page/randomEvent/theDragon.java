/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_page.randomEvent;


import first_page.first_page;
import static first_page.first_page.*;
import first_page.gameArea;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class theDragon {
  events e=new events();
  public static gameArea[] area=new gameArea[12];
 /**
  * Remove pieces from the area
  * @param n area_number, whose pieces are destroyed by the dragon
  */
  public void triggerDragon()
  {      
  int n=e.rolldice();
        
    area[n].redMinion=0;
     area[n].blueMinion=0;
     area[n].greenMinion=0;
      area[n].yellowMinion=0;
      area[n].trollsPresent=0;
      area[n].buildingPresent=null;
      area[n].demonsPresent=0;
    
    
  }
  
  
  
    
}
