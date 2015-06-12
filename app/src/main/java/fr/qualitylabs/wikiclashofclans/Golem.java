package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 12/06/2015.
 */
public class Golem extends Troop {

    //    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] golem1 = {"Golem", "1", "Défenses", "Terrestres", "Mêlée", "30", "45m", "12", "38", "4 500", "450", "N/A", "N/A", "N/A"};
    String[] golem2 = {"Golem", "2", "Défenses", "Terrestres", "Mêlée", "30", "45m", "12", "42", "5 000", "525", "60 000", "6", "10j"};
    String[] golem3 = {"Golem", "3", "Défenses", "Terrestres", "Mêlée", "30", "45m", "12", "46", "5 500", "600", "70 000", "7", "12j"};
    String[] golem4 = {"Golem", "4", "Défenses", "Terrestres", "Mêlée", "30", "45m", "12", "50", "6 000", "675", "80 000", "7", "14j"};
    String[] golem5 = {"Golem", "5", "Défenses", "Terrestres", "Mêlée", "30", "45m", "12", "54", "6 300", "750", "90 000", "8", "14j"};

    public Golem() {
        name = "Golème";
        housingSpace = "30";
        prefferedTarget = "Défenses";
        targetType = "Terrestres";
        attackType = "Mêlée";
        data.put(1, golem1);
        data.put(2, golem2);
        data.put(3, golem3);
        data.put(4, golem4);
        data.put(5, golem5);
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
