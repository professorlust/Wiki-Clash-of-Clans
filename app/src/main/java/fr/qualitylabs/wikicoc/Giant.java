package fr.qualitylabs.wikicoc;
public class Giant extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] giant1 = {"1", "2m", "12", "11", "300", "250", "N/A", "N/A", "N/A"};
    String[] giant2 = {"2", "2m", "12", "14", "360", "750", "100 000", "2", "1j"};
    String[] giant3 = {"3", "2m", "12", "19", "430", "1 250", "250 000", "4", "2j"};
    String[] giant4 = {"4", "2m", "12", "24", "520", "1 750", "750 000", "5", "3j"};
    String[] giant5 = {"5", "2m", "12", "31", "670", "2 250", "2 250 000", "6", "5j"};
    String[] giant6 = {"6", "2m", "12", "43", "940", "3 000", "6 000 000", "7", "10j"};
    String[] giant7 = {"7", "2m", "12", "50", "1 100", "3 500", "7 000 000", "8", "14j"};

    public Giant() {
        name = "Géant";
        namecode = "giant";
        housingSpace = "5";
        prefferedTarget = "Défenses";
        targetType = "Terrestres";
        attackType = "Cible unique";
        data.put(1, giant1);
        data.put(2, giant2);
        data.put(3, giant3);
        data.put(4, giant4);
        data.put(5, giant5);
        data.put(6, giant6);
        data.put(7, giant7);
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
