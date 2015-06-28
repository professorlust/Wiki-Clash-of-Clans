package fr.qualitylabs.wikicoc;
public class Skeleton extends Building{
//    {lvl, units, cost, rearmCost, buildTime, xp, thRequiered}
    String[] skeleton1 = {"1","2","6 000","6 000","N/A","0","8"};
    String[] skeleton2 = {"2","3","600 000","8 000","6h","146","8"};
    String[] skeleton3 = {"3","4","1 300 000","10 000","1j","293","9"};

    public Skeleton(){
        name = "Piège squelettique";
        nameCode = "skeleton";
        data.put(1, skeleton1);
        data.put(2, skeleton2);
        data.put(3, skeleton3);
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
