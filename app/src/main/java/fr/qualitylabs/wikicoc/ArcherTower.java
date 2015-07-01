package fr.qualitylabs.wikicoc;
public class ArcherTower extends Building {

    //    {lvl, dammage/s, dammage/shot, hp, cost, build time, xp, th requiered}
    String[] archertower1 = {"1","11","5,5","380","1 000","1m","7","2"};
    String[] archertower2 = {"2","15","7,5","420","2 000","30m","42","2"};
    String[] archertower3 = {"3","19","9,5","460","5 000","45m","51","3"};
    String[] archertower4 = {"4","25","12,5","500","20 000","4h","120","4"};
    String[] archertower5 = {"5","30","15","540","80 000","12h","207","5"};
    String[] archertower6 = {"6","35","17,5","580","180 000","1j","293","5"};
    String[] archertower7 = {"7","42","21","630","360 000","2j","415","6"};
    String[] archertower8 = {"8","48","24","690","720 000","3j","509","7"};
    String[] archertower9 = {"9","56","28","750","1 500 000","4j","587","8"};
    String[] archertower10 = {"10","65","32,5","810","2 500 000","5j","657","8"};
    String[] archertower11 = {"11","75","37,5","890","4 500 000","6j","720","9"};
    String[] archertower12 = {"12","86","43","970","6 500 000","7j","777","10"};
    String[] archertower13 = {"13","98","49","1 050","7 500 000","8j","831","10"};

    public ArcherTower(){
        name = "Tour d'archer";
        nameCode = "archer_tower";
        data.put(1, archertower1);
        data.put(2, archertower2);
        data.put(3, archertower3);
        data.put(4, archertower4);
        data.put(5, archertower5);
        data.put(6, archertower6);
        data.put(7, archertower7);
        data.put(8, archertower8);
        data.put(9, archertower9);
        data.put(10, archertower10);
        data.put(11, archertower11);
        data.put(12, archertower12);
        data.put(13, archertower13);
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
