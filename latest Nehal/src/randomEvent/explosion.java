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
public class explosion {
 
      events e=new events();
  public static gameArea[] area=new gameArea[12];
  
  
  public void triggerExplosion()
  {
  int n=e.rolldice();
  area[n].buildingPresent=null;
  
  }
  
  
  
    
    
}
