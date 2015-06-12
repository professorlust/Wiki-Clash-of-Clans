package fr.qualitylabs.wikiclashofclans;

        import java.util.Hashtable;

/**
 * Created by Ironova on 11/06/2015.
 */
public class InfernoTower extends Building {

    //    {lvl, dammage/s, dammage/shot, hp, cost, build time, xp, th requiered}
    String[] infernotower1 = {"1","","30","1 500","5 000 000","7j","777","10", "24, 100, 1 000"};
    String[] infernotower2 = {"2","","38","1 800","6 500 000","10j","929","10", "30, 125, 1 250"};
    String[] infernotower3 = {"3","","42","2 100","8 000 000","14j","1 099","10", "36, 140, 1 400"};

    public InfernoTower(){
        name = "Tour de l'enfer";
        other = "Tir concentré   \n(initial, >2sec, >5sec): ";
        data.put(1, infernotower1);
        data.put(2, infernotower2);
        data.put(3, infernotower3);
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
