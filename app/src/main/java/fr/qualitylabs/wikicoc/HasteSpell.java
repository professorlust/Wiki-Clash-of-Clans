package fr.qualitylabs.wikicoc;

import java.util.Hashtable;

public class HasteSpell extends Spell {
    //    {lvl, radius, speed+, length, buildCost, buildTime, researchCost, researchTime, labRequiered}
    String[] earthquake1 = {"1", "4", "28","10s", "80", "15m", "N/A", "N/A", "N/A"};
    String[] earthquake2 = {"2", "4", "34","15s", "85", "15m", "40 000", "8j", "8"};
    String[] earthquake3 = {"3", "4", "40","20s", "90", "15m", "80 000", "10j", "8"};
    String[] earthquake4 = {"4", "4", "46","25s", "95", "15m", "100 000", "14j", "8"};

    public HasteSpell() {
        name = "Sort de précipitation";
        namecode = "haste_spell";
        prefferedTarget = "Aucune";
        targetType = "Terrestres et Aériennes (alliées)";
        factoryRequiered = "3";
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
