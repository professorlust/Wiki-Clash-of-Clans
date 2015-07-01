package fr.qualitylabs.wikicoc;
public class Cannon extends Building {

//    {lvl, dammage/s, dammage/shot, hp, cost, build time, xp, th requiered}
    String[] cannon1 = {"1",   "9","7,2" ,"420"  ,"250"  ,      "10s","3"   ,"1"};
    String[] cannon2 = {"2",  "11","8,8" ,"470"  ,"1 000",      "15m","30"  ,"1"};
    String[] cannon3 = {"3",  "15","12"  ,"520"  ,"4 000",      "45m","51"  ,"2"};
    String[] cannon4 = {"4",  "19","15,2","570"  ,"16 000"     ,"2h" ,"84"  ,"3"};
    String[] cannon5 = {"5",  "25","20"  ,"620"  ,"50 000"     ,"6h" ,"146" ,"4"};
    String[] cannon6 = {"6",  "31","24,8","670"  ,"100 000"    ,"12h ","207","5"};
    String[] cannon7 = {"7",  "40","32"  ,"730"  ,"200 000"    ,"1j" ,"293" ,"6"};
    String[] cannon8 = {"8",  "48","38,4","800"  ,"400 000"    ,"2j" ,"415" ,"7"};
    String[] cannon9 = {"9",  "56","44,8","880"  ,"800 000"    ,"3j" ,"509" ,"8"};
    String[] cannon10 = {"10","65","52"  ,"960"  ,"1 600 000"  ,"4j" ,"587" ,"8"};
    String[] cannon11 = {"11","75","60"  ,"1 060","3 200 000"  ,"5j" ,"657" ,"9"};
    String[] cannon12 = {"12","86","68,8","1 160","6 400 000"  ,"6j" ,"720" ,"10"};
    String[] cannon13 = {"13","98","78,4","1 260","7 500 000"  ,"7j" ,"777" ,"10"};

    public Cannon(){
        name = "Canon";
        nameCode = "cannon";
        data.put(1, cannon1);
        data.put(2, cannon2);
        data.put(3, cannon3);
        data.put(4, cannon4);
        data.put(5, cannon5);
        data.put(6, cannon6);
        data.put(7, cannon7);
        data.put(8, cannon8);
        data.put(9, cannon9);
        data.put(10, cannon10);
        data.put(11, cannon11);
        data.put(12, cannon12);
        data.put(13, cannon13);
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
