package fr.qualitylabs.wikiclashofclans;

        import java.util.Hashtable;

/**
 * Created by Ironova on 11/06/2015.
 */
public class InfernoTower extends Building {

    //    {lvl, dpsInit, dps2+, dps5+, dps/target, hp, costLoad, cost, build time, xp, th requiered}
    String[] infernotower1 = {"1","24","100","1 000","30","1 500","500","5 000 000","7j","777","10"};
    String[] infernotower2 = {"2","30","125","1 250","38","1 800","600","6 500 000","10j","929","10"};
    String[] infernotower3 = {"3","36","140","1 400","42","2 100","700","8 000 000","14j","1 099","10"};

    public InfernoTower(){
        name = "Tour de l'enfer";
        nameCode = "inferno_tower";
        data.put(1, infernotower1);
        data.put(2, infernotower2);
        data.put(3, infernotower3);
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
