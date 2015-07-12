package fr.qualitylabs.wikicoc;

/**
 * Created by Alex on 06/07/2015.
 */
public class BarbarianKingAltar extends Building{

    //             {buildCost, buildTime, unlockUnit, lvlRequired}
    String[] barbariankingaltar = {"10 000", "Immédiat", "250", "Roi des barbares", "7"};

    public BarbarianKingAltar(){
        name = "Roi des barbares (autel)";
        nameCode = "barbarian_king_altar";
        data.put(1, barbariankingaltar);
    }

    public String getNameCode(){
        return nameCode;
    }

    public String getName(){
        return name;
    }

    public int getLevelMax(){
        return levelMax;
    }

    public String[] getProperty (int level) {
        return super.getProperty(level);
    }

}
