package fr.qualitylabs.wikicoc;

import java.util.Hashtable;
public class PoisonSpell extends Spell {
    //    {lvl, radius, damages, speed-, buildCost, buildTime, researchCost, researchTime, labRequiered}
    String[] poison1 = {"1", "4", "270", "28%", "95", "15m", "N/A", "N/A", "N/A"};
    String[] poison2 = {"2", "4", "360", "30%", "110", "15m", "25 000", "4j", "6"};
    String[] poison3 = {"3", "4", "450", "32%", "125", "15m", "50 000", "6j", "7"};
    String[] poison4 = {"4", "4", "540", "34%", "140", "15m", "75 000", "10j", "8"};

    public PoisonSpell() {
        name = "Sort d'empoisonnement";
        namecode = "poison_spell";
        prefferedTarget = "Aucune";
        targetType = "Terrestres et Aériennes (ennemies)";
        length = "N/A";
        factoryRequiered = "1";
        data.put(1, poison1);
        data.put(2, poison2);
        data.put(3, poison3);
        data.put(4, poison4);
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
