package fr.qualitylabs.wikicoc;

import java.util.Hashtable;

public class FreezeSpell extends Spell {
    //    {lvl, radius, length, buildCost, buildTime, researchCost, researchTime, labRequiered}
    String[] freeze1 = {"1", "3,5","4s", "26 000", "30m", "N/A", "N/A", "N/A"};
    String[] freeze2 = {"2", "3,5","5s", "29 000", "30m", "4 000 000", "5j", "8"};
    String[] freeze3 = {"3", "3,5","6s", "31 000", "30m", "5 000 000", "7j", "8"};
    String[] freeze4 = {"4", "3,5","7s", "33 000", "30m", "6 500 000", "10j", "8"};
    String[] freeze5 = {"5", "3,5","8s", "35 000", "30m", "8 000 000", "14j", "8"};

    public FreezeSpell() {
        name = "Sort de gel";
        namecode = "freeze_spell";
        prefferedTarget = "Aucune";
        targetType = "Terrestres et Aériennes (ennemies)";
        factoryRequiered = "5";
        data.put(1, freeze1);
        data.put(2, freeze2);
        data.put(3, freeze3);
        data.put(4, freeze4);
        data.put(5, freeze5);
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
