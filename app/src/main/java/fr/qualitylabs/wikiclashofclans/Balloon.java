package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class Balloon extends Troop {
    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] balloon1 = {"1","8m", "10", "25", "150", "2 000", "N/A", "N/A", "N/A"};
    String[] balloon2 = {"2","8m", "10", "32", "180", "2 500", "150 000", "2", "1j"};
    String[] balloon3 = {"3","8m", "10", "48", "216", "3 000", "450 000", "4", "2j"};
    String[] balloon4 = {"4","8m", "10", "72", "280", "3 500", "1 350 000", "5", "3j"};
    String[] balloon5 = {"5","8m", "10", "108", "390", "4 000", "2 500 000", "6", "5j"};
    String[] balloon6 = {"6","8m", "10", "162", "545", "4 500", "6 000 000", "7", "10j"};


    public Balloon() {
        name = "Ballon";
        namecode = "balloon";
        housingSpace = "5";
        prefferedTarget = "Défenses";
        targetType = "Terrestres";
        attackType = "Zone étendue (1,2 cases)";
        data.put(1, balloon1);
        data.put(2, balloon2);
        data.put(3, balloon3);
        data.put(4, balloon4);
        data.put(5, balloon5);
        data.put(6, balloon6);
        levelMax = data.size();
    }

    public String getName() {
        return name;
    }

    public String getNamecode() { return namecode; }

    public String getHousingSpace() {
        return housingSpace;
    }

    public String getPrefferedTarget() {
        return prefferedTarget;
    }

    public String getTargetType() {
        return targetType;
    }

    public String getAttackType() {
        return attackType;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public String[] getProperty(int level) {
        return data.get(level);
    }
}
