package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class Minion extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] minion1 = {"1", "45s", "32", "35", "55", "6", "N/A", "N/A", "N/A"};
    String[] minion2 = {"2", "45s", "32", "38", "60", "7", "10 000", "5", "5j"};
    String[] minion3 = {"3", "45s", "32", "42", "66", "8", "20 000", "6", "6j"};
    String[] minion4 = {"4", "45s", "32", "46", "72", "9", "30 000", "6", "7j"};
    String[] minion5 = {"5", "45s", "32", "50", "78", "10", "40 000", "7", "10j"};
    String[] minion6 = {"6", "45s", "32", "54", "84", "11", "100 000", "8", "14j"};


    public Minion() {
        name = "Gargouille";
        housingSpace = "2";
        prefferedTarget = "Toutes";
        targetType = "Terrestres et Aériennes";
        attackType = "Cible unique";
        data.put(1, minion1);
        data.put(2, minion2);
        data.put(3, minion3);
        data.put(4, minion4);
        data.put(5, minion5);
        data.put(6, minion6);
        levelMax = data.size();
    }

    public String getName() {
        return name;
    }

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
