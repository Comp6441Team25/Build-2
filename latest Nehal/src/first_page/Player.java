package first_page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
	
	public ArrayList<String> CardsInHand = new ArrayList<String>();
	public List<String> Property = new ArrayList<String>(); // list of areas in which player is having buildings

	public int cashInHand=10;
	public int buildInHand;
	public int minionInHand;
        
        public int points =0;  // total points of everything
        public HashSet<String> minionAreaCount = new HashSet<String>(); //list of areas in which player is having his minions
        public boolean isHuman;
    // no need because Property.size() gives the same    
        public int controlCount=0;   // total number of areas player currently controls
    	public boolean turn = false;
}