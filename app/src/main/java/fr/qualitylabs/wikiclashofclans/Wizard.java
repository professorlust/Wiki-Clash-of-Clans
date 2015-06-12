package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class Wizard extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] wizard1 = {"1", "8m", "16", "50", "75", "1 500", "N/A", "N/A", "N/A"};
    String[] wizard2 = {"2", "8m", "16", "70", "90", "2 000", "150 000", "3", "1j"};
    String[] wizard3 = {"3", "8m", "16", "90", "108", "2 500", "450 000", "4", "2j"};
    String[] wizard4 = {"4", "8m", "16", "125", "130", "3 000", "1 350 000", "5", "3j"};
    String[] wizard5 = {"5", "8m", "16", "170", "156", "3 500", "2 500 000", "6", "5j"};
    String[] wizard6 = {"6", "8m", "16", "180", "164", "4 000", "7 500 000", "8", "14j"};


    public Wizard() {
        name = "Sorcier";
        namecode = "wizard";
        housingSpace = "4";
        prefferedTarget = "Toutes";
        targetType = "Terrestres et Aériennes";
        attackType = "Zone étendue (0,2 cases)";
        data.put(1, wizard1);
        data.put(2, wizard2);
        data.put(3, wizard3);
        data.put(4, wizard4);
        data.put(5, wizard5);
        data.put(6, wizard6);
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
