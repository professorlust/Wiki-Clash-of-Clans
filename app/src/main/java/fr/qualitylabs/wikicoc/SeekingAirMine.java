package fr.qualitylabs.wikicoc;
public class SeekingAirMine extends Building {
//    {lvl, damage, cost, rearmCost, buildTime, xp, thRequiered}
    String[] seekingairmine1 = {"1","1 500","15 000","15 000","N/A","0","7"};
    String[] seekingairmine2 = {"2","1 800","2 000 000","17 500","1j","293","9"};
    String[] seekingairmine3 = {"3","2 100","4 000 000","20 000","3j","509","10"};

    public SeekingAirMine(){
        name = "Mine chercheuse";
        nameCode = "seeking_air_mine";
        prefferedTarget = "Aucune";
        targetType = "Aériennes";
        attackType = "Cible unique";
        data.put(1, seekingairmine1);
        data.put(2, seekingairmine2);
        data.put(3, seekingairmine3);
        levelMax = data.size();
    }

    public String getNameCode() { return nameCode; }

    public String getName(){
        return name;
    }

    public String getPrefferedTarget() {
        return prefferedTarget;
    }

    public String getTargetType() {
        return targetType;
    }

    public String getAttackType() {
        return attackType;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public String[] getProperty (int level){
        return super.getProperty(level);
    }
}
