package fr.qualitylabs.wikicoc;

import java.io.Serializable;
import java.util.Hashtable;
public class Building implements Serializable {

    protected String nameCode;
    protected String name;
    protected String prefferedTarget;
    protected String targetType;
    protected String attackType;
    protected int levelMax;
    protected Hashtable<Integer, String[]> data;

    public Building() {
        nameCode = null;
        levelMax = 0;
        name = null;
        prefferedTarget = null;
        targetType = null;
        attackType = null;
        data = new Hashtable<>();
    }

    public String getNameCode() { return nameCode; }

    public String getName() {
        return name;
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
