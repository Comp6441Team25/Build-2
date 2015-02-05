/* Bank class contains all the details of common pieces of the game and some methods to make changes in 'amount'
 * 
 * 
 */
package view;

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
    public int change;
    
    /**
     * 
     * @param cash current amount in bank
     * @param change amount to be added/subtracted
     * @param player_cash current amount for player  
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
    
    public void fund(int player_cash){
    
        change = Integer.parseInt(first_page.sp.amountText.getText());
        cash = cash - change;
        first_page.playerObj[first_page.active_turn].cashInHand = player_cash + change;
    }
    
}
