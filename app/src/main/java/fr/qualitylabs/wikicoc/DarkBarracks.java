package fr.qualitylabs.wikicoc;
public class DarkBarracks extends Building{

    //  {lvl, buildCost, buildTime, xp, boost, hp, maxQueue, lvlRequired, unlockedUnit}
    String[] darkbarracks1 = {"1", "750 000", "3j", "509", "10", "500", "40", "7", "Gargouille"};
    String[] darkbarracks2 = {"2", "1 250 000", "5j", "657", "10", "540", "50", "7", "Chevaucheur de cochons"};
    String[] darkbarracks3 = {"3", "1 750 000", "6j", "720", "10", "580", "60", "8", "Valkyrie"};
    String[] darkbarracks4 = {"4", "2 250 000", "7j", "777", "10", "620", "70", "8", "Golem"};
    String[] darkbarracks5 = {"5", "2 750 000", "8j", "831", "10", "660", "80", "9", "Sorcière"};
    String[] darkbarracks6 = {"6", "3 500 000", "9j", "881", "10", "700", "90", "9", "Molosse de lave"};

    public DarkBarracks(){
        name = "Caserne noire";
        nameCode = "dark_barracks";
        data.put(1, darkbarracks1);
        data.put(2, darkbarracks2);
        data.put(3, darkbarracks3);
        data.put(4, darkbarracks4);
        data.put(5, darkbarracks5);
        data.put(6, darkbarracks6);
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