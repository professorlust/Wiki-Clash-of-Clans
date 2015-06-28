package fr.qualitylabs.wikicoc;

import java.io.Serializable;
import java.util.Hashtable;
public class Troop implements Serializable {

    protected String name;
    protected String namecode;
    protected String housingSpace;
    protected String prefferedTarget;
    protected String targetType;
    protected String attackType;
    protected int levelMax;
    protected Hashtable<Integer, String[]> data;

    public Troop() {
        levelMax = 0;
        name = null;
        namecode = null;
        data = new Hashtable<>();
    }

    public String getName() {
        return name;
    }

    public String getNamecode() { return namecode; }

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