package view;

import java.io.Serializable;

/*
 * Player class contains all the details regarding each player
 * 
 * 
 */

/**
 *@param Personality stores player's personality
 * @param Color player's color
 * @param CardsInHand[] five cards for each player
 * @param cashInHand amount that player currently holds
 * @param buildInHand remaining buildings with players
 * @param minionInHand remaining minions with players
 * @param turn true/false value for each player
 * @author Dell
 */
public class Player implements Serializable {
    
    
        public int save_turn; 
        public String Personality;
	public String Color;
	
	public String [] CardsInHand = new String [5];
	public String [] Property = new String [6];

	public int cashInHand;
	public int buildInHand;
	public int minionInHand;
	
	public boolean turn = false;
	
        
}
