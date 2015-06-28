package fr.qualitylabs.wikicoc;
public class Dragon extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] dragon1 = {"1","30m", "16", "140", "1 900", "25 000", "N/A", "N/A", "N/A"};
    String[] dragon2 = {"2","30m", "16", "160", "2 100", "30 000", "2 000 000", "5", "7j"};
    String[] dragon3 = {"3","30m", "16", "180", "2 300", "36 000", "3 000 000", "6", "10j"};
    String[] dragon4 = {"4","30m", "16", "200", "2 500", "42 000", "8 000 000", "8", "14j"};

    public Dragon() {
        name = "Dragon";
        namecode = "dragon";
        housingSpace = "20";
        prefferedTarget = "Toutes";
        targetType = "Terrestres et Aériennes";
        attackType = "Zone étendue (0,3 cases)";
        data.put(1, dragon1);
        data.put(2, dragon2);
        data.put(3, dragon3);
        data.put(4, dragon4);
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
