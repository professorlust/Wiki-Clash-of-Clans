package fr.qualitylabs.wikicoc;

import java.util.Hashtable;

public class HealingSpell extends Spell {
    //    {lvl, radius, heal, buildCost, buildTime, researchCost, researchTime, labRequiered}
    String[] healing1 = {"1", "5", "600", "15 000", "30m", "N/A", "N/A", "N/A"};
    String[] healing2 = {"2", "5", "800", "16 500", "30m", "300 000", "1j", "2"};
    String[] healing3 = {"3", "5", "1 000", "18 000", "30m", "600 000", "2j", "4"};
    String[] healing4 = {"4", "5", "1 200", "20 000", "30m", "1 200 000", "3j", "5"};
    String[] healing5 = {"5", "5", "1 400", "22 000", "30m", "2 400 000", "5j", "6"};
    String[] healing6 = {"6", "5", "1 600", "24 000", "30m", "4 800 000", "7j", "7"};

    public HealingSpell() {
        name = "Sort de guérison";
        namecode = "helaing_spell";
        length = "12s";
        factoryRequiered = "2";
        data.put(1, healing1);
        data.put(2, healing2);
        data.put(3, healing3);
        data.put(4, healing4);
        data.put(5, healing5);
        data.put(6, healing6);
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
