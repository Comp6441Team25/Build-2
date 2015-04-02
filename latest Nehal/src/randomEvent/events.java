/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_page.randomEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author admin
 */

public class events {
 
    
    public static ArrayList<Integer> al=new ArrayList<Integer>();
       
    public static void shuffleRndCard()
  {
      
    for(int i=1;i<=12;i++)
    {
    al.add(i);
    }
  //  Collections.shuffle(al);
   
   }
   public static int rolldice()
   {ArrayList<Integer> al2=new ArrayList<Integer>();
   
   for(int i=1;i<12;i++)
   {
   al2.add(i);
   }
   Collections.shuffle(al2);
   return al2.get(0);
   }
   
   public static void generateRndEvtCard()
   {
  
     
      int num=al.get(0);
      al.remove(0);
      System.out.println(al);
    switch(num)
    {      case 1: theDragon td=new theDragon();
            td.triggerDragon();
                break;
           case 2: flood f=new flood();
                f.triggerFlood();
                break;
           case 3:explosion ex=new explosion();
                 ex.triggerExplosion();
               break;
           case 4:fog fg=new fog();
                 fg.triggerFog();
                break;
           case 5:riots r=new riots();
                 r.triggerRiots();
                break;
           case 6:fire fi=new fire();
                 fi.triggerFire();
                break;
           case 7:mysteriousMurders m=new mysteriousMurders();
                 m.triggerMurder();
                break;
            case 8:demonsFromTheDungeonDimensions d=new demonsFromTheDungeonDimensions();
                 d.triggerDemons();
                break;
            case 9:subsidence s=new subsidence();
                 s.triggerSubsidence();
                break;
            case 10:bloodyStupidJhonson bsj=new bloodyStupidJhonson();
                bsj.triggerBldyJhnsn();
                break;
            case 11: trolls t=new trolls();
                t.triggerTrolls();
                break;
            case 12:earthquake eq=new earthquake();
                eq.triggerEarthQuake();    
            break;
        
       }
   }
  
   
}
    

