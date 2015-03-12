/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_page;


/**
 *@param cash amount in bank
 * @param Trolls_not_on_board remaining trolls
 * @param Demons_not_on_board remaining demons
 * @param TroubleMarkers_not_on_board remaining trouble markers 
 * @author Dell
 */
public class Bank {
    
    public static int cash = 120;
    public static int change;
    public static int Trolls_not_on_board = 3;
    public static int Demons_not_on_board = 4;
    public static int TroubleMarkers_not_on_board = 9;
    
    public static int areaCount = 12;
    
    public static int setAreaCount(){
    
        for(int i=0;i<first_page.playerObj.length;i++)
        areaCount = 12 - first_page.playerObj[i].holdCount;
        return areaCount;
    }
    
    /**
     * boolean payment method to keep in track of cash deducted
     * @param player_cash cash corresponding to player
     * @return true if the cash is deducted, otherwise false
     */
    public boolean payment(int player_cash){
    if(player_cash>=0){
        change = Integer.parseInt(first_page.sp.amountText.getText());
        cash = cash + change;
        first_page.playerObj[first_page.active_turn].cashInHand = player_cash - change;
    return true;}
    else
    return false;
    }
    /**
     * fund method to keep in track of the cash received
     * @param player_cash cash corresponding to player
     */
    public boolean fund(int player_cash){
        if(player_cash>=0)
        {
    
        change = Integer.parseInt(first_page.sp.amountText.getText());
        cash = cash - change;
        first_page.playerObj[first_page.active_turn].cashInHand = player_cash + change;
    return true;
        }
    return false;
    }

    /*public static int getTroubleMarker(){
    
    
    }*/
    
}
