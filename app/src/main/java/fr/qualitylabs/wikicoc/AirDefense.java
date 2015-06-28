package fr.qualitylabs.wikicoc;
public class AirDefense extends Building {

    //    {lvl, dammage/s, dammage/shot, hp, cost, build time, xp, th requiered}
    String[] airdefense1 = {"1","80","80","800","22 500","5h","134","4"};
    String[] airdefense2 = {"2","110","110","850","90 000","1j","293","4"};
    String[] airdefense3 = {"3","140","140","900","270 000","3j","509","5"};
    String[] airdefense4 = {"4","160","160","950","540 000","5j","657","6"};
    String[] airdefense5 = {"5","190","190","1 000","1 080 000","6j","720","7"};
    String[] airdefense6 = {"6","230","230","1 050","2 160 000","8j","831","8"};
    String[] airdefense7 = {"7","280","280","1 110","4 320 000","10j","929","9"};
    String[] airdefense8 = {"8","320","320","1 170","7 560 000","12j","1 018","10"};

    public AirDefense(){
        name = "Défense antiaérienne";
        nameCode = "air_defense";
        data.put(1, airdefense1);
        data.put(2, airdefense2);
        data.put(3, airdefense3);
        data.put(4, airdefense4);
        data.put(5, airdefense5);
        data.put(6, airdefense6);
        data.put(7, airdefense7);
        data.put(8, airdefense8);
        levelMax = data.size();
    }

    public String getNameCode() { return nameCode; }

    public String getName(){
        return name;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public String[] getProperty (int level){
        return super.getProperty(level);
    }
}
