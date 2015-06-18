package fr.qualitylabs.wikiclashofclans;

/**
 * Created by Quentin on 18/06/2015.
 */
public class Wall extends Building {
//    {lvl, goldCost, totalGoldCost, elixirCost, totalElixiCost, hp, thRequiered}
    String[] wall1 = {"1","50","50","N/A","N/A","300","2"};
    String[] wall2 = {"2","1 000","1 050","N/A","N/A","500","2"};
    String[] wall3 = {"3","5 000","6 050","N/A","N/A","700","3"};
    String[] wall4 = {"4","10 000","16 050","N/A","N/A","900","4"};
    String[] wall5 = {"5","30 000","46 050","N/A","N/A","1 400","5"};
    String[] wall6 = {"6","75 000","121 050","N/A","N/A","2 000","6"};
    String[] wall7 = {"7","200 000","321 050","N/A","N/A","2 500","7"};
    String[] wall8 = {"8","500 000","821 050","N/A","N/A","3 000","8"};
    String[] wall9 = {"9","1 000 000","1 821 050","1 000 000","1 000 000","4 000","9"};
    String[] wall10 = {"10","3 000 000","4 821 050","4 000 000","4 000 000","5 500","9"};
    String[] wall11 = {"11","4 000 000","8 821 050","8 000 000","8 000 000","7 000","10"};

    public Wall(){
        name = "Mur";
        nameCode = "wall";
        data.put(1, wall1);
        data.put(2, wall2);
        data.put(3, wall3);
        data.put(4, wall4);
        data.put(5, wall5);
        data.put(6, wall6);
        data.put(7, wall7);
        data.put(8, wall8);
        data.put(9, wall9);
        data.put(10, wall10);
        data.put(11, wall11);
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
