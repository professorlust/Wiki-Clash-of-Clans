package fr.qualitylabs.wikicoc;
public class AirSweeper extends Building {

    //    {lvl, stregth, hp, cost, build time, xp, thRequiered}
    String[] airsweeper1 = {"1","1,6","750","500 000","1j","293","6"};
    String[] airsweeper2 = {"2","2","800","750 000","3j","509","6"};
    String[] airsweeper3 = {"3","2,4","850","1 250 000","5j","657","7"};
    String[] airsweeper4 = {"4","2,8","900","2 400 000","7j","777","8"};
    String[] airsweeper5 = {"5","3,2","950","4 800 000","8j","831","9"};
    String[] airsweeper6 = {"6","3,6","1 000","7 200 000","9j","881","10"};

    public AirSweeper(){
        name = "Propulseur d'air";
        nameCode = "air_sweeper";
        data.put(1, airsweeper1);
        data.put(2, airsweeper2);
        data.put(3, airsweeper3);
        data.put(4, airsweeper4);
        data.put(5, airsweeper5);
        data.put(6, airsweeper6);
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
