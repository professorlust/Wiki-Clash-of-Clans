package fr.qualitylabs.wikicoc;

import java.util.Hashtable;

public class LightningSpell extends Spell {

    //    {lvl, radius, randomRadius, damages, buildCost, buildTime, researchCost, researchTime, labRequiered}
    String[] lightning1 = {"1", "2", "3,5", "300", "15 000", "30m", "N/A", "N/A", "N/A"};
    String[] lightning2 = {"2", "2", "3,5", "330", "16 500", "30m", "200 000", "1j", "1"};
    String[] lightning3 = {"3", "2", "3,5", "360", "18 000", "30m", "500 000", "2j", "2"};
    String[] lightning4 = {"4", "2", "3,5", "390", "20 000", "30m", "1 000 000", "3j", "3"};
    String[] lightning5 = {"5", "2", "3,5", "420", "22 000", "30m", "2 000 000", "4j", "6"};
    String[] lightning6 = {"6", "2", "3,5", "450", "24 000", "30m", "8 000 000", "14j", "8"};

    public LightningSpell() {
        name = "Sort de foudre";
        namecode = "lightning_spell";
        length = "2,4s";
        factoryRequiered = "1";
        data.put(1, lightning1);
        data.put(2, lightning2);
        data.put(3, lightning3);
        data.put(4, lightning4);
        data.put(5, lightning5);
        data.put(6, lightning6);
        levelMax = data.size();
    }

    public String getName() {
        return name;
    }

    public String getNamecode() {
        return namecode;
    }

    public String getLength() {
        return length;
    }

    public String getFactoryRequiered() {
        return factoryRequiered;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public Hashtable<Integer, String[]> getData() {
        return data;
    }

    public String[] getProperty(int level) {
        return data.get(level);
    }
}
