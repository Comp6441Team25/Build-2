/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_page;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author n_bhaga
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
    gr48("TheThieves'Guild",new Integer[]{4,8}),
    
    br1("SergeantCheeryLittlebottom",new Integer[]{4,2}),
    br2("OttoChriek",new Integer[]{4,7}),
    br3("TheClacks",new Integer[]{4,32,6}),
    br4("SergeantColon",new Integer[]{2,8}),
    br5("CosmoLavish",new Integer[]{4,6}),
    br6("TheDean",new Integer[]{5,4,6}),
    br7("HELLO",new Integer[]{1,1,7}),
    br8("Burleigh&Stronginthearm",new Integer[]{4,7}),
    br9("TheBursar",new Integer[]{5,4,6}),
    br10("CableStreetParticulars",new Integer[]{4,8}),
    br11("CantingCrew",new Integer[]{4,8}),
    br12("Carser",new Integer[]{4,6}),
    br13("TheChairOfIndefiniteStudies",new Integer[]{5,4,6}),
    br14("SirCharlesLavatory",new Integer[]{4,7}),
    br15("Dorfl",new Integer[]{4,6}),
    br16("SergeantDetritus",new Integer[]{2,2}),
    br17("DeepDwarves",new Integer[]{4,6}),
    br18("AdoraBelleDearheart",new Integer[]{4,8,7}),
    br19("TheAlchemistsGuild",new Integer[]{4,7}),
    br20("TheAuditors",new Integer[]{4}),
    br21("BuggySwires",new Integer[]{2}),
    br22("Susan",new Integer[]{9}),
//    br23("SybilVimes",new Integer[]{33,4}),
//    br24("TheTeatime",new Integer[]{33,1,6}),
    br25("TheWatch",new Integer[]{7,2}),
    br26("WeeMadArthur",new Integer[]{4}),
    br27("WilliamDeWorde",new Integer[]{8,4}),
    br28("Willikins",new Integer[]{4}),
    br29("ArchChancellorRidcully",new Integer[]{5,4}),
    br30("Ruby",new Integer[]{8,7}),
    br31("TheSeniorWrangler",new Integer[]{5,4,6}),
    br32("Mr.Shine",new Integer[]{4}),
    br33("Mr.Slant",new Integer[]{4,7}),
    br34("TheSmokingGun",new Integer[]{4,6}),
    br35("Stanley",new Integer[]{4,8}),
    br36("MoistVonLipwig",new Integer[]{8,33,4,6}),
    br37("DoctorMossyLawn",new Integer[]{9}),
    br38("Patrician'sPalace",new Integer[]{7,34,8}),
    br39("PonderStibbons",new Integer[]{5,4}),
    br40("ThePostOffice",new Integer[]{4,8}),
    br41("ReacherGilt",new Integer[]{4}),
    br42("ProfessorOfRecentRunes",new Integer[]{5,4,6}),
    br43("DoctorHix",new Integer[]{5,4,6}),
    br44("Hobson'sLiveryStable",new Integer[]{4,7}),
    br45("Hubert",new Integer[]{4,8}),
    br46("Igor",new Integer[]{9}),
    br47("TheLuggage",new Integer[]{1,4}),
    br48("TheMob",new Integer[]{4,8,6}),
    br49("LordDowney",new Integer[]{1,33,7}),
    br50("Dwarves",new Integer[]{8,8}),
    br51("Edwardd'Earth",new Integer[]{1,33,7}),
    br52("Errol",new Integer[]{4,6}),
    br53("Gargoyles",new Integer[]{4,7});
    
    
    public final String name;
    public final Integer[] action;// = new Integer[9];
    
    cardDetails(String name1,Integer[] action1){
        name = name1;
       action = action1;
    }
    public String getName(){
    
        return name;
    
    }
    public int getAction(int i){
           
        return action[i];         
       
    }
    
    
}
