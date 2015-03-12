/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_page;

import java.util.ArrayList;
import java.util.List;

/**
 *cardDetails holds the values of the green cards
 *@param name name of the card
 *@param action events performed
 */
public enum cardDetails {
    
    gr1("Mr.Boggis",new Integer[]{4,8}),
    gr2("Mr.Bent",new Integer[]{4,6}),
    gr3("TheBeggars'Guild",new Integer[]{4,8}),
    gr4("TheBankOfAnkh-Morpork",new Integer[]{4,6}),
    gr5("TheAnkh-MorporkSunshineDragonSanctuary",new Integer[]{4,6}),
    gr6("SergentAngua",new Integer[]{2,6}),
    gr7("TheAgonyAunts",new Integer[]{1,32,8}),
    gr8("TheDysk",new Integer[]{7,4}),
    gr9("TheDuckman",new Integer[]{4}),
    gr10("Drumknott",new Integer[]{4}),
    gr11("CMOTDibber",new Integer[]{4,6}),
    gr12("Dr.Cruces",new Integer[]{1,33}),
    gr13("CaptainCarrot",new Integer[]{8,2,31}),
    gr14("Mrs.Cake",new Integer[]{4,32,7}),
    gr15("Groat",new Integer[]{8}),
    gr16("Gimlet'sDwarfDelicatessen",new Integer[]{33,8}),
    gr17("Gaspode",new Integer[]{9}),
    gr18("FreshStartClub",new Integer[]{9}),
    gr19("FoulOleRom",new Integer[]{4,6}),
    gr20("TheFools'Guild",new Integer[]{4,8}),
    gr21("TheFireBrigade",new Integer[]{4,6}),
    gr22("InigoSkimmer",new Integer[]{1,32}),
    gr23("HistoryMonks",new Integer[]{4,8}),
    gr24("Hex",new Integer[]{4,7}),
    gr25("H'n'Now",new Integer[]{4,6}),
    gr26("HarryKing",new Integer[]{8,4}),
    gr27("Harga'sHouseOfRibs",new Integer[]{33,8}),
    gr28("Mr.Gryle",new Integer[]{1,31}),
    gr29("thePeeledNuts",new Integer[]{}),
    gr30("TheOperaHouse",new Integer[]{7,4}),
    gr31("NobbyNobbs",new Integer[]{4,6}),
    gr32("Mondo",new Integer[]{4,8}),
    gr33("TheMandedDrum",new Integer[]{7,32}),
    gr34("Librarian",new Integer[]{4}),
    gr35("LeonardOfQuirm",new Integer[]{4}),
    gr36("ShonkyShop",new Integer[]{4,7}),
    gr37("sacharissaCripslock",new Integer[]{4,8}),
    gr38("RosiePalm",new Integer[]{8,4}),
    gr39("Rincewind",new Integer[]{5,4,6}),
    gr40("TheRoyalMint",new Integer[]{7,35}),
    gr41("QueenMolly",new Integer[]{8,4}),
    gr42("PinkPussyCatClub",new Integer[]{33,6}),
    gr43("ZorgoTheRetro-phrenologist",new Integer[]{4,7}),
    gr44("Dr.Whiteface",new Integer[]{4,8}),
    gr45("WallaceSonky",new Integer[]{9}),
    gr46("TheSeamstrsses'Guild",new Integer[]{4,8}),
    gr47("Mr.Pin&Mr.Tulip",new Integer[]{1,31}),
    gr48("TheThieves'Guild",new Integer[]{4,8});
    
    public final String name;
    public final Integer[] action;// = new Integer[9];
    
    cardDetails(String name1,Integer[] action1){
        name = name1;
       action = action1;
    }
    /**
     * getName gets card name 
     * @return name of the card
     */
    public String getName(){
    
        return name;
    
    }
    /**
     * getAction gets action to be performed
     * @param i action for particular card
     * @return action performed
     */
    public int getAction(int i){
           
        return action[i];         
       
    }
    
    
}
