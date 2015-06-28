package fr.qualitylabs.wikicoc;
public class AirBomb extends Building {
//    {lvl, damage, cost, rearmCost, buildTime, xp, thRequiered}
    String[] airbomb1 = {"1","100","4 000","3 000","N/A","0","5"};
    String[] airbomb2 = {"2","120","20 000","4 000","4h","120","5"};
    String[] airbomb3 = {"3","144","200 000","5 000","12h","207","7"};
    String[] airbomb4 = {"4","173","1 500 000","6 000","1j","293","9"};

    public AirBomb(){
        name = "Bombe aérienne";
        nameCode = "air_bomb";
        data.put(1, airbomb1);
        data.put(2, airbomb2);
        data.put(3, airbomb3);
        data.put(4, airbomb4);
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
