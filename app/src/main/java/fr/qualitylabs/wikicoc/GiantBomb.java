package fr.qualitylabs.wikicoc;
public class GiantBomb extends Building {
    //    {lvl, damage, radius, cost, rearmCost, buildTime, xp, thRequiered}
    String[] giantbomb1 = {"1","175","3","12 500","12 500","N/A","0","6"};
    String[] giantbomb2 = {"2","200","3,5","75 000","15 000","6h","146","6"};
    String[] giantbomb3 = {"3","225","3,5","750 000","17 500","1j","293","8"};
    String[] giantbomb4 = {"4","250","4","2 500 000","20 000","3j","509","10"};

    public GiantBomb(){
        name = "Bombe géante";
        nameCode = "giant_bomb";
        data.put(1, giantbomb1);
        data.put(2, giantbomb2);
        data.put(3, giantbomb3);
        data.put(4, giantbomb4);
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
