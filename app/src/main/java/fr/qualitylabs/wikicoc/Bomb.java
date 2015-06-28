package fr.qualitylabs.wikicoc;
public class Bomb extends Building {
//    {lvl, damage, cost, rearmCost, buildTime, xp, thRequiered}
    String[] bomb1 = {"1","12","400","800","N/A","0","3"};
    String[] bomb2 = {"2","16","1 000","500","15m","30","3"};
    String[] bomb3 = {"3","20","10 000","600","2h","84","5"};
    String[] bomb4 = {"4","26","100 000","700","8h","169","7"};
    String[] bomb5 = {"5","34","1 000 000","800","1j","293","8"};
    String[] bomb6 = {"6","42","1 500 000","900","2j","415","9"};

    public Bomb(){
        name = "Bombe";
        nameCode = "bomb";
        data.put(1, bomb1);
        data.put(2, bomb2);
        data.put(3, bomb3);
        data.put(4, bomb4);
        data.put(5, bomb5);
        data.put(6, bomb6);
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
