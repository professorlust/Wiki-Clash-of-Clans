package fr.qualitylabs.wikicoc;

import java.util.Hashtable;

public class JumpSpell extends Spell {
    //    {lvl, radius, radiusRandom, length, buildCost, buildTime, researchCost, researchTime, labRequiered}
    String[] jump1 = {"1", "5","4","20s", "23 000", "45m", "N/A", "N/A", "N/A"};
    String[] jump2 = {"2", "5","4","40s", "27 000", "45m", "3 000 000", "5j", "6"};
    String[] jump3 = {"3", "5","4","60s", "31 000", "45m", "6 000 000", "7j", "8"};

    public JumpSpell() {
        name = "Sort de saut";
        namecode = "jump_spell";
        prefferedTarget = "Aucune";
        targetType = "Terrestres (alliées)";
        factoryRequiered = "4";
        data.put(1, jump1);
        data.put(2, jump2);
        data.put(3, jump3);
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
