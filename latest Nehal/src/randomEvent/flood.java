/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_page.randomEvent;

import first_page.gameArea;

/**
 *
 * @author admin
 */
public class flood {
      events e=new events();
      gameArea[] area=new gameArea[12];
      /**
       * Move the minions from the affected areas to the adjacent areas of the river   
       *@param n area_number which is affected by the flood
       * @param n2 area_number which is affected by the flood
       * */
    public void triggerFlood()
    {
    int n=e.rolldice();
    int n2=e.rolldice();
    area[n].redMinion=0;
    area[n].blueMinion=0;
    area[n].greenMinion=0;
    area[n].yellowMinion=0;
    area[n2].redMinion=0;
    area[n2].blueMinion=0;
    area[n2].greenMinion=0;
    area[n2].yellowMinion=0;
  //moveminions();
  
    }
    
}
