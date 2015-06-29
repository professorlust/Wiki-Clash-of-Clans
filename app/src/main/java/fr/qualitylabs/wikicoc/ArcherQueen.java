package fr.qualitylabs.wikicoc;

import java.util.Hashtable;

public class ArcherQueen extends Troop {
    //    Extra ability data table
    protected Hashtable<Integer, String[]> ability = new Hashtable<>();
    protected int abilityMax;
    protected String speed;

    //    {lvl, damages/s, damages/hit, hp, regenerationTime, abilityLvl, researchCost, researchTime, lvlRequiered}
    String[] archerqueen1 = {"1", "160", "120", "725", "30m", "N/A", "40 000", "N/A", "9"};
    String[] archerqueen2 = {"2", "164", "123", "740", "32m", "N/A", "22 500", "12h", "9"};
    String[] archerqueen3 = {"3", "168", "126", "755", "34m", "N/A", "25 000", "1j", "9"};
    String[] archerqueen4 = {"4", "172", "129", "771", "36m", "N/A", "27 500", "1j 12h", "9"};
    String[] archerqueen5 = {"5", "176", "132", "787", "38m", "N/A", "30 000", "2j", "9"};
    String[] archerqueen6 = {"6", "181", "135,75", "804", "40m", "1", "32 500", "2j 12h", "9"};
    String[] archerqueen7 = {"7", "185", "138,75", "821", "42m", "1", "35 000", "3j", "9"};
    String[] archerqueen8 = {"8", "190", "142,5", "838", "44m", "1", "40 000", "3j 12h", "9"};
    String[] archerqueen9 = {"9", "194", "145,5", "856", "46m", "1", "45 000", "4j", "9"};
    String[] archerqueen10 = {"10", "199", "149,25", "874", "48m", "1", "50 000", "4j 12h", "9"};
    String[] archerqueen11 = {"11", "204", "153", "892", "50m", "2", "55 000", "5j", "9"};
    String[] archerqueen12 = {"12", "209", "156,75", "911", "52m", "2", "60 000", "5j 12h", "9"};
    String[] archerqueen13 = {"13", "215", "161,25", "930", "54m", "2", "65 000", "6j", "9"};
    String[] archerqueen14 = {"14", "220", "165", "949", "56m", "2", "70 000", "6j 12h", "9"};
    String[] archerqueen15 = {"15", "226", "169,5", "969", "58m", "2", "75 000", "7j", "9"};
    String[] archerqueen16 = {"16", "231", "173,25", "990", "1h", "3", "80 000", "7j", "9"};
    String[] archerqueen17 = {"17", "237", "177,75", "1 010", "1h 2m", "3", "85 000", "7j", "9"};
    String[] archerqueen18 = {"18", "243", "182,25", "1 032", "1h 4m", "3", "90 000", "7j", "9"};
    String[] archerqueen19 = {"19", "249", "186,75", "1 053", "1h 6m", "3", "95 000", "7j", "9"};
    String[] archerqueen20 = {"20", "255", "191,25", "1 076", "1h 8m", "3", "100 000", "7j", "9"};
    String[] archerqueen21 = {"21", "262", "196,5", "1 098", "1h 10m", "4", "105 000", "7j", "9"};
    String[] archerqueen22 = {"22", "268", "201", "1 121", "1h 12m", "4", "110 000", "7j", "9"};
    String[] archerqueen23 = {"23", "275", "206,25", "1 145", "1h 14m", "4", "115 000", "7j", "9"};
    String[] archerqueen24 = {"24", "282", "211,5", "1 169", "1h 16m", "4", "120 000", "7j", "9"};
    String[] archerqueen25 = {"25", "289", "216,75", "1 193", "1h 18m", "4", "125 000", "7j", "9"};
    String[] archerqueen26 = {"26", "296", "222", "1 218", "1h 20m", "5", "130 000", "7j", "9"};
    String[] archerqueen27 = {"27", "304", "228", "1 244", "1h 22m", "5", "135 000", "7j", "9"};
    String[] archerqueen28 = {"28", "311", "233,25", "1 270", "1h 24m", "5", "140 000", "7j", "9"};
    String[] archerqueen29 = {"29", "319", "239,25", "1 297", "1h 26m", "5", "145 000", "7j", "9"};
    String[] archerqueen30 = {"30", "327", "245,25", "1 324", "1h 28m", "5", "150 000", "7j", "9"};
    String[] archerqueen31 = {"31", "335", "251,25", "1 352", "1h 30m", "6", "155 000", "7j", "10"};
    String[] archerqueen32 = {"32", "344", "258", "1 380", "1h 32m", "6", "160 000", "7j", "10"};
    String[] archerqueen33 = {"33", "352", "264", "1 409", "1h 34m", "6", "165 000", "7j", "10"};
    String[] archerqueen34 = {"34", "361", "270,75", "1 439", "1h 36m", "6", "170 000", "7j", "10"};
    String[] archerqueen35 = {"35", "370", "277,5", "1 469", "1h 38m", "6", "175 000", "7j", "10"};
    String[] archerqueen36 = {"36", "379", "284,25", "1 500", "1h 40m", "7", "180 000", "7j", "10"};
    String[] archerqueen37 = {"37", "389", "291,25", "1 532", "1h 42m", "7", "185 000", "7j", "10"};
    String[] archerqueen38 = {"38", "398", "298,5", "1 564", "1h 44m", "7", "190 000", "7j", "10"};
    String[] archerqueen39 = {"39", "408", "306", "1 597", "1h 46m", "7", "195 000", "7j", "10"};
    String[] archerqueen40 = {"40", "419", "314,25", "1 630", "1h 48m", "7", "200 000", "7j", "10"};

    //    {lvl, damages+, hp+, unitsCreated, time}
    String[] ability1 = {"1", "300", "150", "5", "3,6s"};
    String[] ability2 = {"2", "355", "175", "6", "3,8s"};
    String[] ability3 = {"3", "416", "200", "7", "4s"};
    String[] ability4 = {"4", "483", "225", "8", "4,2s"};
    String[] ability5 = {"5", "557", "250", "9", "4,4s"};
    String[] ability6 = {"6", "638", "275", "10", "4,6s"};
    String[] ability7 = {"7", "725", "300", "11", "4,8s"};
    String[] ability8 = {"8", "819", "325", "12", "5s"};

    public ArcherQueen() {
        name = "Reine des archers";
        namecode = "archer_queen";
        housingSpace = "0";
        prefferedTarget = "Toutes";
        targetType = "Terrestres et Aériennes";
        attackType = "Cible unique";
        speed = "24";
        data.put(1, archerqueen1);
        data.put(2, archerqueen2);
        data.put(3, archerqueen3);
        data.put(4, archerqueen4);
        data.put(5, archerqueen5);
        data.put(6, archerqueen6);
        data.put(7, archerqueen7);
        data.put(8, archerqueen8);
        data.put(9, archerqueen9);
        data.put(10, archerqueen10);
        data.put(11, archerqueen11);
        data.put(12, archerqueen12);
        data.put(13, archerqueen13);
        data.put(14, archerqueen14);
        data.put(15, archerqueen15);
        data.put(16, archerqueen16);
        data.put(17, archerqueen17);
        data.put(18, archerqueen18);
        data.put(19, archerqueen19);
        data.put(20, archerqueen20);
        data.put(21, archerqueen21);
        data.put(22, archerqueen22);
        data.put(23, archerqueen23);
        data.put(24, archerqueen24);
        data.put(25, archerqueen25);
        data.put(26, archerqueen26);
        data.put(27, archerqueen27);
        data.put(28, archerqueen28);
        data.put(29, archerqueen29);
        data.put(30, archerqueen30);
        data.put(31, archerqueen31);
        data.put(32, archerqueen32);
        data.put(33, archerqueen33);
        data.put(34, archerqueen34);
        data.put(35, archerqueen35);
        data.put(36, archerqueen36);
        data.put(37, archerqueen37);
        data.put(38, archerqueen38);
        data.put(39, archerqueen39);
        data.put(40, archerqueen40);
        levelMax = data.size();
        ability.put(1, ability1);
        ability.put(2, ability2);
        ability.put(3, ability3);
        ability.put(4, ability4);
        ability.put(5, ability5);
        ability.put(6, ability6);
        ability.put(7, ability7);
        ability.put(8, ability8);
        abilityMax = ability.size();
    }

    public String getName() {
        return name;
    }

    public String getNamecode() {
        return namecode;
    }

    public String getHousingSpace() {
        return housingSpace;
    }

    public String getPrefferedTarget() {
        return prefferedTarget;
    }

    public String getTargetType() {
        return targetType;
    }

    public String getAttackType() {
        return attackType;
    }

    public String getSpeed() {
        return speed;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public int getAbilityMax() {
        return abilityMax;
    }

    public String[] getProperty(int level) {
        return data.get(level);
    }

    public String[] getAbility(int level) {
        return ability.get(level);
    }
}
