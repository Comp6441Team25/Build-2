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
    
    public static int Trolls_not_on_board = 3;
    public static int Demons_not_on_board = 4;
    public static int TroubleMarkers_not_on_board = 9;
<<<<<<< HEAD
    public int change;
    
    /**
     * 
     * @param cash current amount in bank
     * @param change amount to be added/subtracted
     * @param player_cash current amount for player  
     */
    
    public void payment(int player_cash){
    
        change = Integer.parseInt(first_page.sp.amountText.getText());
        cash = cash + change;
        first_page.playerObj[first_page.active_turn].cashInHand = player_cash - change;
    
    }
    
    public void fund(int player_cash){
    
        change = Integer.parseInt(first_page.sp.amountText.getText());
        cash = cash - change;
        first_page.playerObj[first_page.active_turn].cashInHand = player_cash + change;
    
    }
=======
    
>>>>>>> origin/master
    
}
