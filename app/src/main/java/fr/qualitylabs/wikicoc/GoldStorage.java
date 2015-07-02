package fr.qualitylabs.wikicoc;

/**
 * Created by Alex on 01/07/2015.
 */
public class GoldStorage extends Building{

    // {lvl, capacity, hp, buildCost, buildTime, xp, lvlRequired}
    String[] goldstorage1 = {"1", "1 500", "400", "300", "10s", "3", "1"};
    String[] goldstorage2 = {"2", "3 000", "600", "750", "30m", "42", "2"};
    String[] goldstorage3 = {"3", "6 000", "800", "1 500", "1h", "60", "2"};
    String[] goldstorage4 = {"4", "12 000", "1 000", "3 000", "2h", "84", "3"};
    String[] goldstorage5 = {"5", "25 000", "1 200", "6 000", "3h", "103", "3"};
    String[] goldstorage6 = {"6", "50 000", "1 400", "12 000", "4h", "120", "6"};
    String[] goldstorage7 = {"7", "100 000", "1 600", "25 000", "6h", "146", "4"};
    String[] goldstorage8 = {"8", "250 000", "1 700", "50 000", "8h", "169", "4"};
    String[] goldstorage9 = {"9", "500 000", "1 800", "100 000", "12h", "207", "5"};
    String[] goldstorage10 = {"10", "1 000 000", "1 900", "250 000", "1j", "293", "6"};
    String[] goldstorage11 = {"11", "2 000 000", "2 100", "500 000", "2j", "415", "7"};

    public GoldStorage(){
        name = "Réservoir d'or";
        nameCode = "gold_storage";
        data.put(1, goldstorage1);
        data.put(2, goldstorage2);
        data.put(3, goldstorage3);
        data.put(4, goldstorage4);
        data.put(5, goldstorage5);
        data.put(6, goldstorage6);
        data.put(7, goldstorage7);
        data.put(8, goldstorage8);
        data.put(9, goldstorage9);
        data.put(10, goldstorage10);
        data.put(11, goldstorage11);
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

    public String[] getProperty (int level){
        return super.getProperty(level);
    }

}
