package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class Healer extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] healer1 = {"1", "15m", "16", "35", "500", "5 000", "N/A", "N/A", "N/A"};
    String[] healer2 = {"2", "15m", "16", "42", "600", "6 000", "750 000", "5", "3j"};
    String[] healer3 = {"3", "15m", "16", "55", "840", "8 000", "1 500 000", "6", "5j"};
    String[] healer4 = {"4", "15m", "16", "71", "1176", "10 000", "3 000 000", "7", "7j"};


    public Healer() {
        name = "Guérissseuse";
        namecode = "healer";
        housingSpace = "14";
        prefferedTarget = "Toutes";
        targetType = "Terrestres";
        attackType = "Zone étendue (soins de 2 cases)";
        data.put(1, healer1);
        data.put(2, healer2);
        data.put(3, healer3);
        data.put(4, healer4);
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
