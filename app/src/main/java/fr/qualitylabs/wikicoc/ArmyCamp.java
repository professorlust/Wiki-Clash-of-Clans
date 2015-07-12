package fr.qualitylabs.wikicoc;

/**
 * Created by Alex on 06/07/2015.
 */
public class ArmyCamp extends Building{

    //{lvl, capacity, hp, buildCost, buildTime, xp, lvlRequired}
    String[] armycamp1 = {"1", "20", "250", "250", "5m", "17", "1"};
    String[] armycamp2 = {"2", "30", "270", "2 500", "1h", "60", "2"};
    String[] armycamp3 = {"3", "35", "290", "10 000", "3h", "103", "3"};
    String[] armycamp4 = {"4", "40", "310", "100 000", "8h", "169", "4"};
    String[] armycamp5 = {"5", "45", "330", "250 000", "1j", "293", "5"};
    String[] armycamp6 = {"6", "50", "350", "750 000", "3j", "509", "6"};
    String[] armycamp7 = {"7", "55", "400", "2 250 000", "5j", "657", "9"};
    String[] armycamp8 = {"8", "60", "500", "6 750 000", "10j", "929", "10"};

    public ArmyCamp(){
        name = "Camp militaire";
        nameCode = "army_camp";
        data.put(1, armycamp1);
        data.put(2, armycamp2);
        data.put(3, armycamp3);
        data.put(4, armycamp4);
        data.put(5, armycamp5);
        data.put(6, armycamp6);
        data.put(7, armycamp7);
        data.put(8, armycamp8);
        levelMax = data.size();
    }

    public String getNameCode(){
        return nameCode;
    }

    public String getName(){
        return name;
    }

    public int getLevelMax(){
        return levelMax;
    }

    public String[] getProperty (int level) {
        return super.getProperty(level);
    }

}
