package fr.qualitylabs.wikicoc;
public class Mortar extends Building {
    //    {lvl, dammage/s, dammage/shot, hp, cost, build time, xp, th requiered}
    String[] mortar1 = {"1","4","20","400","8 000","8h","169","3"};
    String[] mortar2 = {"2","5","25","450","32 000","12h","207","4"};
    String[] mortar3 = {"3","6","30","500","120 000","1j","293","5"};
    String[] mortar4 = {"4","7","35","550","400 000","2j","415","6"};
    String[] mortar5 = {"5","8","40","600","800 000","4j","587","7"};
    String[] mortar6 = {"6","9","45","650","1 600 000","5j","657","8"};
    String[] mortar7 = {"7","11","55","700","3 200 000","7j","777","9"};
    String[] mortar8 = {"8","13","65","750","6 400 000","10j","929","10"};

    public Mortar(){
        name = "Mortier";
        nameCode = "mortar";
        data.put(1, mortar1);
        data.put(2, mortar2);
        data.put(3, mortar3);
        data.put(4, mortar4);
        data.put(5, mortar5);
        data.put(6, mortar6);
        data.put(7, mortar7);
        data.put(8, mortar8);
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
