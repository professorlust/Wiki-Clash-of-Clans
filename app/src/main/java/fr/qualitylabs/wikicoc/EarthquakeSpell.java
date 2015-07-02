package fr.qualitylabs.wikicoc;

import java.util.Hashtable;
public class EarthquakeSpell extends Spell {
    //    {lvl, radius, damages%hp, buildCost, buildTime, researchCost, researchTime, labRequiered}
    String[] earthquake1 = {"1", "5", "6%", "125", "15m", "N/A", "N/A", "N/A"};
    String[] earthquake2 = {"2", "5", "8%", "140", "15m", "30 000", "6j", "6"};
    String[] earthquake3 = {"3", "5", "10%", "160", "15m", "60 000", "8j", "7"};
    String[] earthquake4 = {"4", "5", "12%", "180", "15m", "90 000", "12j", "8"};

    public EarthquakeSpell() {
        name = "Sort sismique";
        namecode = "earthquake_spell";
        prefferedTarget = "Murs (x4)";
        targetType = "Terrestres (bâtiments)";
        length = "N/A";
        factoryRequiered = "2";
        data.put(1, earthquake1);
        data.put(2, earthquake2);
        data.put(3, earthquake3);
        data.put(4, earthquake4);
        levelMax = data.size();
    }

    public String getName() {
        return name;
    }

    public String getNamecode() {
        return namecode;
    }

    public String getPrefferedTarget() {
        return prefferedTarget;
    }

    public String getTargetType() {
        return targetType;
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
