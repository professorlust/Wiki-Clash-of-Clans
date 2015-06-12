package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class Goblin extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] goblin1 = {"1", "30s", "32", "11", "25", "25", "N/A", "N/A", "N/A"};
    String[] goblin2 = {"2", "30s", "32", "14", "30", "40", "50 000", "1", "12h"};
    String[] goblin3 = {"3", "30s", "32", "19", "36", "60", "250 000", "3", "2j"};
    String[] goblin4 = {"4", "30s", "32", "24", "43", "80", "750 000", "5", "3j"};
    String[] goblin5 = {"5", "30s", "32", "32", "52", "100", "2 250 000", "6", "5j"};
    String[] goblin6 = {"6", "30s", "32", "42", "68", "150", "4 500 000", "8", "10j"};


    public Goblin() {
        name = "Gobelin";
        housingSpace = "1";
        prefferedTarget = "Ressources (x2)";
        targetType = "Terrestres";
        attackType = "Mêlée";
        data.put(1, goblin1);
        data.put(2, goblin2);
        data.put(3, goblin3);
        data.put(4, goblin4);
        data.put(5, goblin5);
        data.put(6, goblin6);
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
