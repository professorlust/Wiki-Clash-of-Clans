package fr.qualitylabs.wikicoc;
public class Spring extends Building {
//    {lvl, cost, rearmCost}
    String[] bomb1 = {"1","2 000", "2 000"};

    public Spring(){
        name = "Piège à ressort";
        nameCode = "spring";
        prefferedTarget = "Aucune";
        targetType = "Terrestres";
        attackType = "Zone étendue (1 case)";
        data.put(1, bomb1);
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
