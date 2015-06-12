package fr.qualitylabs.wikiclashofclans;

        import java.util.Hashtable;

/**
 * Created by Ironova on 11/06/2015.
 */
public class InfernoTower extends Building {

    //    {lvl, dammage/s, dammage/shot, hp, cost, build time, xp, th requiered}
    String[] infernotower1 = {"1","50","6,4","1 500","3 000 000","7j","777","9"};
    String[] infernotower2 = {"2","60","7,68","1 900","5 000 000","10j","929","9"};
    String[] infernotower3 = {"3","75","9,6","2 300","7 000 000","14j","1 099","9"};

    public InfernoTower(){
        name = "Tour de l'enfer";
        data.put(1, infernotower1);
        data.put(2, infernotower2);
        data.put(3, infernotower3);
        levelMax = data.size();
    }

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
