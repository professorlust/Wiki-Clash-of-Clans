package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 18/06/2015.
 */
public class Spring extends Building {
//    {lvl, rearmCost}
    String[] bomb1 = {"1","2 000"};

    public Spring(){
        name = "Piège à ressort";
        nameCode = "spring";
        data.put(1, bomb1);
        levelMax = data.size();
    }

    public String getNameCode() { return nameCode; }

    public String getName(){
        return name;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public String[] getProperty (int level){
        return super.getProperty(level);
    }
}
