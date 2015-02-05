/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTO;

/** Assigning and returning values through this class
 *
 * @author kumaran
 */
public class GameStats
{

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
    
        public int save_turn; 
        public String Personality;
	public String Color;
	
	public String [] CardsInHand = new String [5];
	public String [] Property = new String [6];

	public int cashInHand;
	public int buildInHand;
	public int minionInHand;
	
	public boolean turn = false;
    public int getSave_turn() {
        return save_turn;
    }

    public void setSave_turn(int save_turn) {
        this.save_turn = save_turn;
    }

    public String getPersonality() {
        return Personality;
    }

    public void setPersonality(String Personality) {
        this.Personality = Personality;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String[] getCardsInHand() {
        return CardsInHand;
    }

    public void setCardsInHand(String[] CardsInHand) {
        this.CardsInHand = CardsInHand;
    }

    public String[] getProperty() {
        return Property;
    }

    public void setProperty(String[] Property) {
        this.Property = Property;
    }

    public int getCashInHand() {
        return cashInHand;
    }

    public void setCashInHand(int cashInHand) {
        this.cashInHand = cashInHand;
    }

    public int getBuildInHand() {
        return buildInHand;
    }

    public void setBuildInHand(int buildInHand) {
        this.buildInHand = buildInHand;
    }

    public int getMinionInHand() {
        return minionInHand;
    }

    public void setMinionInHand(int minionInHand) {
        this.minionInHand = minionInHand;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }


    
	
        

}
