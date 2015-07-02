package fr.qualitylabs.wikicoc;

/**
 * Created by Alex on 02/07/2015.
 */
public class ElixirStorage extends Building{

    // {lvl, capacity, hp, buildCost, buildTime, xp, lvlRequired}
    String[] elixirstorage1 = {"1", "1 500", "400", "300", "15m", "30", "1"};
    String[] elixirstorage2 = {"2", "3 000", "600", "750", "30m", "42", "2"};
    String[] elixirstorage3 = {"3", "6 000", "800", "1 500", "1h", "60", "2"};
    String[] elixirstorage4 = {"4", "12 000", "1 000", "3 000", "2h", "84", "3"};
    String[] elixirstorage5 = {"5", "25 000", "1 200", "6 000", "3h", "103", "3"};
    String[] elixirstorage6 = {"6", "50 000", "1 400", "12 000", "4h", "120", "3"};
    String[] elixirstorage7 = {"7", "100 000", "1 600", "25 000", "6h", "146", "4"};
    String[] elixirstorage8 = {"8", "250 000", "1 700", "50 000", "8h", "169", "4"};
    String[] elixirstorage9 = {"9", "500 000", "1 800", "100 000", "12h", "207", "5"};
    String[] elixirstorage10 = {"10", "1 000 000", "1 900", "250 000", "1j", "293", "6"};
    String[] elixirstorage11 = {"11", "2 000 000", "2 100", "500 000", "2j", "415", "7"};

    public ElixirStorage(){
        name = "Réservoir d'élixir";
        nameCode = "elixir_storage";
        data.put(1, elixirstorage1);
        data.put(2, elixirstorage2);
        data.put(3, elixirstorage3);
        data.put(4, elixirstorage4);
        data.put(5, elixirstorage5);
        data.put(6, elixirstorage6);
        data.put(7, elixirstorage7);
        data.put(8, elixirstorage8);
        data.put(9, elixirstorage9);
        data.put(10, elixirstorage10);
        data.put(11, elixirstorage11);
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
