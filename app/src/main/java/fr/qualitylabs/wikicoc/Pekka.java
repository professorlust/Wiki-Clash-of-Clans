package fr.qualitylabs.wikicoc;
public class Pekka extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] pekka1 = {"1","45m", "16", "240", "2 800", "30 000", "N/A", "N/A", "N/A"};
    String[] pekka2 = {"2","45m", "16", "270", "3 100", "35 000", "3 000 000", "6", "10j"};
    String[] pekka3 = {"3","45m", "16", "300", "3 500", "36 000", "6 000 000", "6", "12j"};
    String[] pekka4 = {"4","45m", "16", "340", "4 000", "40 000", "7 000 000", "8", "14j"};
    String[] pekka5 = {"5","45m", "16", "380", "4 500", "45 000", "8 000 000", "8", "14j"};


    public Pekka() {
        name = "P.E.K.K.A.";
        namecode = "pekka";
        housingSpace = "25";
        prefferedTarget = "Toutes";
        targetType = "Terrestres";
        attackType = "Cible unique";
        data.put(1, pekka1);
        data.put(2, pekka2);
        data.put(3, pekka3);
        data.put(4, pekka4);
        data.put(5, pekka5);
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
