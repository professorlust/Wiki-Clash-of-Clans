package fr.qualitylabs.wikiclashofclans;

import java.util.Hashtable;

/**
 * Created by Ironova on 11/06/2015.
 */
public class HiddenTesla extends Building {

    //    {lvl, dammage/s, dammage/shot, hp, cost, build time, xp, th requiered}
    String[] hiddentesla1 = {"1","34","20,4","600","1 000 000","1j","293","7"};
    String[] hiddentesla2 = {"2","40","24","630","1 250 000","3j","509","7"};
    String[] hiddentesla3 = {"3","48","28,8","660","1 500 000","5j","657","7"};
    String[] hiddentesla4 = {"4","55","33","690","2 000 000","6j","720","8"};
    String[] hiddentesla5 = {"5","64","38,4","730","2 500 000","8j","831","8"};
    String[] hiddentesla6 = {"6","75","45","770","3 000 000","10j","929","8"};
    String[] hiddentesla7 = {"7","87","52,2","810","3 500 000","12j","1 018","9"};
    String[] hiddentesla8 = {"8","99","59,4","850","5 000 000","14j","1 099","10"};

    public HiddenTesla(){
        name = "Tesla camouflée";
        nameCode = "hidden_tesla";
        data.put(1, hiddentesla1);
        data.put(2, hiddentesla2);
        data.put(3, hiddentesla3);
        data.put(4, hiddentesla4);
        data.put(5, hiddentesla5);
        data.put(6, hiddentesla6);
        data.put(7, hiddentesla7);
        data.put(8, hiddentesla8);
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
