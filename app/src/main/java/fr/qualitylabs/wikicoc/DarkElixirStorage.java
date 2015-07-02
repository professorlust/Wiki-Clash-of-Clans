package fr.qualitylabs.wikicoc;

/**
 * Created by Alex on 02/07/2015.
 */
public class DarkElixirStorage extends Building{

    // {lvl, capacity, hp, buildCost, buildTime, xp, lvlRequired}
    String[] darkelixirstorage1 = {"1", "10 000", "2 000", "600 000", "1j", "293", "7"};
    String[] darkelixirstorage2 = {"2", "20 000", "2 200", "1 200 000", "2j", "415", "7"};
    String[] darkelixirstorage3 = {"3", "40 000", "2 400", "1 800 000", "3j", "509", "8"};
    String[] darkelixirstorage4 = {"4", "80 000", "2 600", "2 400 000", "4j", "587", "8"};
    String[] darkelixirstorage5 = {"5", "150 000", "2 900", "3 000 000", "5j", "657", "9"};
    String[] darkelixirstorage6 = {"6", "200 000", "3 200", "3 600 000", "6j", "720", "9"};

    public DarkElixirStorage(){
        name = "Réservoir d'élixir noir";
        nameCode = "dark_elixir_storage";
        data.put(1, darkelixirstorage1);
        data.put(2, darkelixirstorage2);
        data.put(3, darkelixirstorage3);
        data.put(4, darkelixirstorage4);
        data.put(5, darkelixirstorage5);
        data.put(6, darkelixirstorage6);
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
