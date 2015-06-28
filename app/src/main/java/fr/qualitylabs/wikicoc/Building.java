package fr.qualitylabs.wikicoc;

import java.io.Serializable;
import java.util.Hashtable;
public class Building implements Serializable {

    protected String nameCode;
    protected String name;
    protected int levelMax;
    protected Hashtable<Integer, String[]> data;

    public Building() {
        nameCode = null;
        levelMax = 0;
        name = null;
        data = new Hashtable<>();
    }

    public String getNameCode() { return nameCode; }

    public String getName() {
        return name;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public String[] getProperty(int level) {
        return data.get(level);
    }
}
