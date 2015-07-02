package fr.qualitylabs.wikicoc;
public class XBow extends Building {

    private String prefferedTarget;
    private String targetType;
    private String attackType;

//    {lvl, damage/s, damage/shot, hp, costLoad, cost, buildTime, xp, lvlRequiered, shotColor}
    String[] xbow1 = {"1","50","6,4","1 500","50 000","3 000 000","7j","777","9","violet"};
    String[] xbow2 = {"2","60","7,68","1 900","60 000","5 000 000","10j","929","9","or"};
    String[] xbow3 = {"3","75","9,6","2 300","70 000","7 000 000","14j","1 099","9","bleu"};
    String[] xbow4 = {"4","80","10,24","2 700","80 000","8 000 000","14j","1 099","10","orange"};

    public XBow(){
        name = "Arc-X";
        nameCode = "x_bow";
        prefferedTarget = "Aucune";
        targetType = "Terrestres ou Terrestres et Aériennes";
        attackType = "Cible unique";
        data.put(1, xbow1);
        data.put(2, xbow2);
        data.put(3, xbow3);
        data.put(4, xbow4);
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
