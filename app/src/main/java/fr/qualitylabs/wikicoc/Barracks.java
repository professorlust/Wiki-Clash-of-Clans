package fr.qualitylabs.wikicoc;

/**
 * Created by Alex on 04/07/2015.
 */
public class Barracks extends Building{

    //  {lvl, buildCost, buildTime, xp, boost, hp, maxQueue, lvlRequired, unlockedUnit}
    String[] barracks1 = {"1", "200", "10s", "3", "10", "250", "20", "1", "Barbare"};
    String[] barracks2 = {"2", "1 000", "15s", "3", "10", "290", "25", "1", "Archer"};
    String[] barracks3 = {"3", "2 500", "2h", "3", "10", "330", "30", "1", "Géant"};
    String[] barracks4 = {"4", "5 000", "4h", "3", "10", "370", "35", "2", "Gobelin"};
    String[] barracks5 = {"5", "10 000", "10h", "3", "10", "420", "40", "3", "Sapeur"};
    String[] barracks6 = {"6", "80 000", "16h", "3", "10", "470", "45", "4", "Ballon"};
    String[] barracks7 = {"7", "240 000", "1j", "3", "10", "520", "50", "5", "Sorcier"};
    String[] barracks8 = {"8", "700 000", "2j", "3", "10", "600", "55", "6", "Guérisseuse"};
    String[] barracks9 = {"9", "1 500 000", "4j", "3", "10", "720", "60", "7", "Dragon"};
    String[] barracks10 = {"10", "2 000 000", "6j", "3", "10", "860", "75", "8", "P.E.K.K.A."};

    public Barracks(){
        name = "Caserne";
        nameCode = "barracks";
        data.put(1, barracks1);
        data.put(2, barracks2);
        data.put(3, barracks3);
        data.put(4, barracks4);
        data.put(5, barracks5);
        data.put(6, barracks6);
        data.put(7, barracks7);
        data.put(8, barracks8);
        data.put(9, barracks9);
        data.put(10, barracks10);
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