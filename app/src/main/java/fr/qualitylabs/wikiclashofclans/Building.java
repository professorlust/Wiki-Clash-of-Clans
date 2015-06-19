package fr.qualitylabs.wikiclashofclans;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Created by Quentin on 11/06/2015.
 */
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
