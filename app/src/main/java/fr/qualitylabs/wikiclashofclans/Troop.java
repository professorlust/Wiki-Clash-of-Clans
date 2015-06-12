package fr.qualitylabs.wikiclashofclans;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Created by Quentin on 07/06/2015.
 */
public class Troop implements Serializable {

    protected String name;
    protected String housingSpace;
    protected String prefferedTarget;
    protected String targetType;
    protected String attackType;
    protected int levelMax;
    protected Hashtable<Integer, String[]> data;

    public Troop() {
        levelMax = 0;
        name = null;
        data = new Hashtable<>();
    }

    public String getName() {
        return name;
    }

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