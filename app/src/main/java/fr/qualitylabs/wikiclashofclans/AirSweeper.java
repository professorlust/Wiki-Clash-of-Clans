package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 13/06/2015.
 */
public class AirSweeper extends Building {

    //    {lvl, dammage/s, dammage/shot, hp, cost, build time, xp, th requiered}
    String[] airsweeper1 = {"1","0","0","750","500 000","1j","293","6", "1,6"};
    String[] airsweeper2 = {"2","0","0","800","750 000","3j","509","6", "2"};
    String[] airsweeper3 = {"3","0","0","850","1 250 000","5j","657","7", "2,4"};
    String[] airsweeper4 = {"4","0","0","900","2 400 000","7j","777","8", "2,8"};
    String[] airsweeper5 = {"5","0","0","950","4 800 000","8j","831","9", "3,2"};
    String[] airsweeper6 = {"6","0","0","1 000","7 200 000","9j","881","10", "3,6"};

    public AirSweeper(){
        name = "Propulseur d'air";
        nameCode = "air_sweeper";
        other = "Force (carreaux): ";
        data.put(1, airsweeper1);
        data.put(2, airsweeper2);
        data.put(3, airsweeper3);
        data.put(4, airsweeper4);
        data.put(5, airsweeper5);
        data.put(6, airsweeper6);
        levelMax = data.size();
    }

    public String getNameCode() { return nameCode; }

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
