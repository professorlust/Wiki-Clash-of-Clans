package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class HogRider extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] hogrider1 = {"1", "2m", "24", "60", "270", "40", "N/A", "N/A", "N/A"};
    String[] hogrider2 = {"2", "2m", "24", "70", "312", "45", "20 000", "5", "8j"};
    String[] hogrider3 = {"3", "2m", "24", "80", "360", "52", "30 000", "6", "10j"};
    String[] hogrider4 = {"4", "2m", "24", "92", "415", "58", "40 000", "6", "12j"};
    String[] hogrider5 = {"5", "2m", "24", "105", "475", "65", "50 000", "7", "14j"};

    public HogRider() {
        name = "Chevaucheur de cochon";
        housingSpace = "5";
        prefferedTarget = "Défenses";
        targetType = "Terrestres";
        attackType = "Cible unique";
        data.put(1, hogrider1);
        data.put(2, hogrider2);
        data.put(3, hogrider3);
        data.put(4, hogrider4);
        data.put(5, hogrider5);
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
