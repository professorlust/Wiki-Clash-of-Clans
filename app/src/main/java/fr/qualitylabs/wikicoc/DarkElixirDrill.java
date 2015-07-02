package fr.qualitylabs.wikicoc;

/**
 * Created by Alex on 02/07/2015.
 */
public class DarkElixirDrill extends Building{

    //                   {lvl, buildCost, buildTime, xp, boost, capacity, prodRate, hp, fillTime, lvlRequired}
    String[] darkelixirdrill1 = {"1", "1 000 000", "1j", "293", "7", "160", "20", "800", "8h", "7"};
    String[] darkelixirdrill2 = {"2", "1 500 000", "2j", "415", "10", "300", "30", "860", "10h", "7"};
    String[] darkelixirdrill3 = {"3", "2 000 000", "3j", "509", "15", "540", "45", "820", "12h", "7"};
    String[] darkelixirdrill4 = {"4", "3 000 000", "4j", "587", "20", "840", "60", "980", "14h", "9"};
    String[] darkelixirdrill5 = {"5", "4 000 000", "6j", "720", "25", "1 280", "80", "1 040", "16h", "9"};
    String[] darkelixirdrill6 = {"6", "5 000 000", "8j", "831", "34", "1 800", "100", "1 800", "18h", "9"};

    public DarkElixirDrill(){
        name = "Foreuse d'élixir noir";
        nameCode = "dark_elixir_drill";
        data.put(1, darkelixirdrill1);
        data.put(2, darkelixirdrill2);
        data.put(3, darkelixirdrill3);
        data.put(4, darkelixirdrill4);
        data.put(5, darkelixirdrill5);
        data.put(6, darkelixirdrill6);
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
