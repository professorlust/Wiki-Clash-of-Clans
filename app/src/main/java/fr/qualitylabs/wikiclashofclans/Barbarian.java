package fr.qualitylabs.wikiclashofclans;

import java.util.Hashtable;

/**
 * Created by Quentin on 12/06/2015.
 */
public class Barbarian extends Troop {

//    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] barbarian1 = {"1", "20s", "24", "8", "45", "25", "N/A", "N/A", "N/A"};
    String[] barbarian2 = {"2", "20s", "24", "11", "54", "40", "50 000", "1", "6h"};
    String[] barbarian3 = {"3", "20s", "24", "14", "65", "60", "150 000", "3", "1j"};
    String[] barbarian4 = {"4", "20s", "24", "18", "78", "80", "500 000", "5", "3j"};
    String[] barbarian5 = {"5", "20s", "24", "23", "95", "100", "1 500 00", "6", "5j"};
    String[] barbarian6 = {"6", "20s", "24", "26", "110", "150", "4 500 000", "7", "10j"};
    String[] barbarian7 = {"7", "20s", "24", "30", "125", "200", "6 000 000", "8", "14j"};

    public Barbarian() {
        name = "Barbare";
        namecode = "barbarian";
        housingSpace = "1";
        prefferedTarget = "Toutes";
        targetType = "Terrestres";
        attackType = "Cible unique";
        data.put(1, barbarian1);
        data.put(2, barbarian2);
        data.put(3, barbarian3);
        data.put(4, barbarian4);
        data.put(5, barbarian5);
        data.put(6, barbarian6);
        data.put(7, barbarian7);
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
