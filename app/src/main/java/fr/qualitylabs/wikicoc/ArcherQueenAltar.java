package fr.qualitylabs.wikicoc;

/**
 * Created by Alex on 06/07/2015.
 */
public class ArcherQueenAltar extends Building{

    //             {buildCost, buildTime, unlockUnit, lvlRequired}
    String[] archerqueenaltar = {"40 000", "Immédiat", "250", "Reine des archers", "9"};

    public ArcherQueenAltar(){
        name = "Reine des archers (autel)";
        nameCode = "archer_queen_altar";
        data.put(1, archerqueenaltar);
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
