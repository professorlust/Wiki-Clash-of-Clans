package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class Valkyrie extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] valkyrie1 = {"1", "8m", "24", "88", "900", "70", "N/A", "N/A", "N/A"};
    String[] valkyrie2 = {"2", "8m", "24", "99", "1 000", "100", "50 000", "6", "10j"};
    String[] valkyrie3 = {"3", "8m", "24", "111", "1 100", "130", "60 000", "7", "12j"};
    String[] valkyrie4 = {"4", "8m", "24", "124", "1 200", "160", "70 000", "7", "14j"};

    public Valkyrie() {
        name = "Valkyrie";
        housingSpace = "8";
        prefferedTarget = "Toutes";
        targetType = "Terrestres";
        attackType = "Zone étendue (1 case)";
        data.put(1, valkyrie1);
        data.put(2, valkyrie2);
        data.put(3, valkyrie3);
        data.put(4, valkyrie4);
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
