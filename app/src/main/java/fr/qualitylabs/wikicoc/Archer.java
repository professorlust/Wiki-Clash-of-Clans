package fr.qualitylabs.wikicoc;
public class Archer extends Troop{

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] archer1 = {"1", "25s", "24", "7", "20", "50", "N/A", "N/A", "N/A"};
    String[] archer2 = {"2", "25s", "24", "9", "23", "80", "50 000", "1", "12h"};
    String[] archer3 = {"3", "25s", "24", "12", "28", "120", "250 000", "3", "2j"};
    String[] archer4 = {"4", "25s", "24", "16", "33", "160", "750 000", "5", "3j"};
    String[] archer5 = {"5", "25s", "24", "20", "40", "300", "2 250 000", "6", "5j"};
    String[] archer6 = {"6", "25s", "24", "22", "44", "400", "6 000 000", "7", "10j"};
    String[] archer7 = {"7", "25s", "24", "25", "48", "500", "7 500 000", "8", "14j"};

    public Archer() {
        name = "Archer";
        namecode = "archer";
        housingSpace = "1";
        prefferedTarget = "Aucune";
        targetType = "Terrestres et Aériennes";
        attackType = "Cible unique";
        data.put(1, archer1);
        data.put(2, archer2);
        data.put(3, archer3);
        data.put(4, archer4);
        data.put(5, archer5);
        data.put(6, archer6);
        data.put(7, archer7);
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
