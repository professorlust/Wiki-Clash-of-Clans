package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class Witch extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] witch1 = {"1", "20m", "12", "25", "75", "250", "N/A", "N/A", "N/A"};
    String[] witch2 = {"2", "20m", "12", "30", "100", "350", "75 000", "7", "10j"};

    public Witch() {
        name = "Sorcière";
        namecode = "witch";
        housingSpace = "12";
        prefferedTarget = "Totues";
        targetType = "Terrestres et Aériennes";
        attackType = "Zone étendue (0,3 cases)";
        data.put(1, witch1);
        data.put(2, witch2);
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
