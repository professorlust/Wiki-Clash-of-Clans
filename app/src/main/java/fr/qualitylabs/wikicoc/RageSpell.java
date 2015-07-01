package fr.qualitylabs.wikicoc;

import java.util.Hashtable;

public class RageSpell extends Spell {
    //    {lvl, radius, damage+, speed+, buildCost, buildTime, researchCost, researchTime, labRequiered}
    String[] rage1 = {"1", "5", "130%","20", "23 000", "45m", "N/A", "N/A", "N/A"};
    String[] rage2 = {"2", "5", "140%","22", "25 500", "45m", "450 000", "2j", "3"};
    String[] rage3 = {"3", "5", "150%","24", "27 000", "45m", "900 000", "3j", "4"};
    String[] rage4 = {"4", "5", "160%","26", "30 000", "45m", "1 800 000", "5j", "5"};
    String[] rage5 = {"5", "5", "170%","28", "33 000", "45m", "3 000 000", "7j", "6"};

    public RageSpell() {
        name = "Sort de rage";
        namecode = "rage_spell";
        length = "18s";
        factoryRequiered = "3";
        data.put(1, rage1);
        data.put(2, rage2);
        data.put(3, rage3);
        data.put(4, rage4);
        data.put(5, rage5);
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
