package fr.qualitylabs.wikicoc;

import java.io.Serializable;
import java.util.Hashtable;

public class Spell implements Serializable{

    protected String name;
    protected String namecode;
    protected String factoryRequiered;
    protected String length;
    protected int levelMax;
    protected Hashtable<Integer, String[]> data;

    public Spell() {
        name = null;
        namecode = null;
        length = null;
        factoryRequiered = null;
        levelMax = 0;
        data = new Hashtable<>();
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
