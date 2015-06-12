package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class LavaHound extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] lavahound1 = {"1", "45m", "20", "10", "5 700", "390", "N/A", "N/A", "N/A"};
    String[] lavahound2 = {"2", "45m", "20", "12", "6 200", "450", "60 000", "7", "10j"};
    String[] lavahound3 = {"3", "45m", "20", "14", "6 700", "510", "70 000", "8", "12j"};

    public LavaHound() {
        name = "Molosse de lave";
        namecode = "lavahound";
        housingSpace = "30";
        prefferedTarget = "Défenses  antiaériennes";
        targetType = "Terrestres et Aériennes";
        attackType = "Cible unique";
        data.put(1, lavahound1);
        data.put(2, lavahound2);
        data.put(3, lavahound3);
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
