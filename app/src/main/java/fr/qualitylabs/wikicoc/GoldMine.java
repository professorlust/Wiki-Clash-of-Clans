package fr.qualitylabs.wikicoc;

/**
 * Created by Alex on 30/06/2015.
 */
public class GoldMine extends Building {
    //                   {lvl, buildCost, buildTime, xp, boost, capacity, prodRate, hp, fillTime, lvlRequired}
    String[] goldmine1 = {"1", "150", "10s", "3", "N/A", "500", "200", "400", "2h 30m", "1"};
    String[] goldmine2 = {"2", "300", "5m", "17", "N/A", "1 000", "400", "440", "2h 30m", "1"};
    String[] goldmine3 = {"3", "700", "15m", "30", "N/A", "1 500", "600", "480", "2h 30m", "2"};
    String[] goldmine4 = {"4", "1 400", "1h", "60", "N/A", "2 500", "800", "520", "3h 7m 30s", "2"};
    String[] goldmine5 = {"5", "3 000", "2h", "84", "4", "10 000", "1 000", "560", "10h", "3"};
    String[] goldmine6 = {"6", "7 000", "6h", "146", "5", "20 000", "1 300", "600", "15h 23m 5s", "3"};
    String[] goldmine7 = {"7", "14 000", "12h", "207", "6", "30 000", "1 600", "640", "18h 45m", "4"};
    String[] goldmine8 = {"8", "28 000", "1j", "293", "7", "50 000", "1 900", "680", "1j 2h 18m 57s", "4"};
    String[] goldmine9 = {"9", "56 000", "2j", "415", "8", "75 000", "2 200", "720", "1j 10h 5m 27s", "5"};
    String[] goldmine10 = {"10", "84 000", "3j", "509", "9", "100 000", "2 500", "760", "1j 16h", "5"};
    String[] goldmine11 = {"11", "168 000", "4j", "587", "10", "150 000", "3 000", "800", "2j 2h", "7"};
    String[] goldmine12 = {"12", "336 000", "5j", "657", "10", "200 000", "3 500", "840", "2j 9h 8m 34s", "8"};

    public GoldMine(){
        name = "Mine d'or";
        nameCode = "gold_mine";
        data.put(1, goldmine1);
        data.put(2, goldmine2);
        data.put(3, goldmine3);
        data.put(4, goldmine4);
        data.put(5, goldmine5);
        data.put(6, goldmine6);
        data.put(7, goldmine7);
        data.put(8, goldmine8);
        data.put(9, goldmine9);
        data.put(10, goldmine10);
        data.put(11, goldmine11);
        data.put(12, goldmine12);
        levelMax = data.size();
    }

    public String getNameCode() {
        return nameCode;
    }

    public String getName() {
        return name;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public String[] getProperty (int level) {
        return super.getProperty(level);
    }

}
