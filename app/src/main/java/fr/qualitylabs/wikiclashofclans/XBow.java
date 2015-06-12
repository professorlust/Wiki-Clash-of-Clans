package fr.qualitylabs.wikiclashofclans;

import java.util.Hashtable;

/**
 * Created by Ironova on 11/06/2015.
 */
public class XBow extends Building {

    //    {lvl, dammage/s, dammage/shot, hp, cost, build time, xp, th requiered}
    String[] xbow1 = {"1","50","6,4","1 500","3 000 000","7j","777","9", "50 000"};
    String[] xbow2 = {"2","60","7,68","1 900","5 000 000","10j","929","9", "60 000"};
    String[] xbow3 = {"3","75","9,6","2 300","7 000 000","14j","1 099","9", "70 000"};
    String[] xbow4 = {"4","80","10,24","2 700","8 000 000","14j","1 099","10", "80 000"};

    public XBow(){
        name = "Arc-X";
        other = "Coût de rechargement: ";
        data.put(1, xbow1);
        data.put(2, xbow2);
        data.put(3, xbow3);
        data.put(4, xbow4);
        levelMax = data.size();
    }

    public String getOther() { return other; }

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
