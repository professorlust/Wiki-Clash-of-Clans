package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class WallBreaker extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] wallbreaker1 = {"1", "2m", "24", "12", "20", "1 000", "N/A", "N/A", "N/A"};
    String[] wallbreaker2 = {"2", "2m", "24", "16", "24", "1 500", "100 000", "2", "1j"};
    String[] wallbreaker3 = {"3", "2m", "24", "24", "29", "2 000", "250 000", "4", "2j"};
    String[] wallbreaker4 = {"4", "2m", "24", "32", "35", "2 500", "750 000", "5", "3j"};
    String[] wallbreaker5 = {"5", "2m", "24", "46", "42", "3 000", "2 250 000", "6", "5j"};
    String[] wallbreaker6 = {"6", "2m", "24", "60", "54", "3 500", "6 750 000", "8", "10j"};

    public WallBreaker() {
        name = "Sapeur";
        housingSpace = "2";
        prefferedTarget = "Rempart (x40)";
        targetType = "Terrestres";
        attackType = "Zone étendue (2 cases)";
        data.put(1, wallbreaker1);
        data.put(2, wallbreaker2);
        data.put(3, wallbreaker3);
        data.put(4, wallbreaker4);
        data.put(5, wallbreaker5);
        data.put(6, wallbreaker6);
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
