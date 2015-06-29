package fr.qualitylabs.wikicoc;

import java.util.Hashtable;

public class BarbarianKing extends Troop {

    //    Extra ability data table
    protected Hashtable<Integer, String[]> ability = new Hashtable<>();
    protected int abilityMax;
    protected String speed;

    //    {lvl, damages/s, damages/hit, hp, regenerationTime, abilityLvl, researchCost, researchTime, lvlRequiered}
    String[] barbarianking1 = {"1", "120", "144", "1 700", "30m", "N/A", "10 000", "N/A", "7"};
    String[] barbarianking2 = {"2", "122", "146,4", "1 742", "32m", "N/A", "12 500", "12h", "7"};
    String[] barbarianking3 = {"3", "124", "148,8", "1 783", "34m", "N/A", "15 000", "1j", "7"};
    String[] barbarianking4 = {"4", "127", "152,4", "1 830", "36m", "N/A", "17 500", "1j 12h", "7"};
    String[] barbarianking5 = {"5", "129", "154,8", "1 876", "38m", "N/A", "20 000", "2j", "7"};
    String[] barbarianking6 = {"6", "132", "158,4", "1 923", "40m", "1", "22 500", "2j 12h", "8"};
    String[] barbarianking7 = {"7", "135", "162", "1 971", "42m", "1", "25 000", "3j", "8"};
    String[] barbarianking8 = {"8", "137", "164,4", "2 020", "44m", "1", "30 000", "3j 12h", "8"};
    String[] barbarianking9 = {"9", "140", "168", "2 071", "46m", "1", "35 000", "4j", "8"};
    String[] barbarianking10 = {"10", "143", "171,6", "2 123", "48m", "1", "40 000", "4j 12h", "8"};
    String[] barbarianking11 = {"11", "146", "175,2", "2 176", "50m", "2", "45 000", "5j", "9"};
    String[] barbarianking12 = {"12", "149", "178,8", "2 230", "52m", "2", "50 000", "5j 12h", "9"};
    String[] barbarianking13 = {"13", "152", "182,4", "2 286", "54m", "2", "55 000", "6j", "9"};
    String[] barbarianking14 = {"14", "155", "186", "2 343", "56m", "2", "60 000", "6j 12h", "9"};
    String[] barbarianking15 = {"15", "158", "189,6", "2 402", "58m", "2", "65 000", "7j", "9"};
    String[] barbarianking16 = {"16", "161", "193,2", "2 462", "1h", "3", "70 000", "7j", "9"};
    String[] barbarianking17 = {"17", "164", "196,8", "2 523", "1h 2m", "3", "75 000", "7j", "9"};
    String[] barbarianking18 = {"18", "168", "201,6", "2 486", "1h 4m", "3", "80 000", "7j", "9"};
    String[] barbarianking19 = {"19", "171", "205,2", "2 651", "1h 6m", "3", "85 000", "7j", "9"};
    String[] barbarianking20 = {"20", "174", "208,8", "2 717", "1h 8m", "3", "90 000", "7j", "9"};
    String[] barbarianking21 = {"21", "178", "213,6", "2 785", "1h 10m", "4", "95 000", "7j", "9"};
    String[] barbarianking22 = {"22", "181", "217,2", "2 855", "1h 12m", "4", "100 000", "7j", "9"};
    String[] barbarianking23 = {"23", "185", "222", "2 926", "1h 14m", "4", "105 000", "7j", "9"};
    String[] barbarianking24 = {"24", "189", "226,8", "2 999", "1h 16m", "4", "110 000", "7j", "9"};
    String[] barbarianking25 = {"25", "193", "231,6", "3 074", "1h 18m", "4", "115 000", "7j", "9"};
    String[] barbarianking26 = {"26", "196", "235,2", "3 151", "1h 20m", "5", "120 000", "7j", "9"};
    String[] barbarianking27 = {"27", "200", "240", "3 230", "1h 22m", "5", "125 000", "7j", "9"};
    String[] barbarianking28 = {"28", "204", "244,8", "3 311", "1h 24m", "5", "130 000", "7j", "9"};
    String[] barbarianking29 = {"29", "208", "249,6", "3 394", "1h 26m", "5", "135 000", "7j", "9"};
    String[] barbarianking30 = {"30", "213", "255,6", "3 478", "1h 28m", "5", "140 000", "7j", "9"};
    String[] barbarianking31 = {"31", "217", "260,4", "3 565", "1h 30m", "6", "145 000", "7j", "10"};
    String[] barbarianking32 = {"32", "221", "265,2", "3 655", "1h 32m", "6", "150 000", "7j", "10"};
    String[] barbarianking33 = {"33", "226", "271,2", "3 746", "1h 34m", "6", "155 000", "7j", "10"};
    String[] barbarianking34 = {"34", "230", "276", "3 840", "1h 36m", "6", "160 000", "7j", "10"};
    String[] barbarianking35 = {"35", "235", "282", "3 936", "1h 38m", "6", "165 000", "7j", "10"};
    String[] barbarianking36 = {"36", "239", "286,8", "4 034", "1h 40m", "7", "170 000", "7j", "10"};
    String[] barbarianking37 = {"37", "244", "292,8", "4 135", "1h 42m", "7", "175 000", "7j", "10"};
    String[] barbarianking38 = {"38", "249", "298,8", "4 238", "1h 44m", "7", "180 000", "7j", "10"};
    String[] barbarianking39 = {"39", "254", "304,8", "4 344", "1h 46m", "7", "185 000", "7j", "10"};
    String[] barbarianking40 = {"40", "259", "310,8", "4 453", "1h 48m", "7", "190 000", "7j", "10"};

    //    {lvl, damages+, hp+, speed+, unitsCreated, time}
    String[] ability1 = {"1", "56", "500", "18", "6", "10s"};
    String[] ability2 = {"2", "101", "620", "19", "8", "10s"};
    String[] ability3 = {"3", "147", "752", "20", "10", "10s"};
    String[] ability4 = {"4", "195", "899", "21", "12", "10s"};
    String[] ability5 = {"5", "245", "1 063", "22", "14", "10s"};
    String[] ability6 = {"6", "298", "1 247", "23", "16", "10s"};
    String[] ability7 = {"7", "354", "1 455", "24", "18", "10s"};
    String[] ability8 = {"8", "414", "1 692", "25", "20", "10s"};

    public BarbarianKing() {
        name = "Roi des barbares";
        namecode = "barbarian_king";
        housingSpace = "0";
        prefferedTarget = "Toutes";
        targetType = "Terrestres";
        attackType = "Cible unique";
        speed = "16";
        data.put(1, barbarianking1);
        data.put(2, barbarianking2);
        data.put(3, barbarianking3);
        data.put(4, barbarianking4);
        data.put(5, barbarianking5);
        data.put(6, barbarianking6);
        data.put(7, barbarianking7);
        data.put(8, barbarianking8);
        data.put(9, barbarianking9);
        data.put(10, barbarianking10);
        data.put(11, barbarianking11);
        data.put(12, barbarianking12);
        data.put(13, barbarianking13);
        data.put(14, barbarianking14);
        data.put(15, barbarianking15);
        data.put(16, barbarianking16);
        data.put(17, barbarianking17);
        data.put(18, barbarianking18);
        data.put(19, barbarianking19);
        data.put(20, barbarianking20);
        data.put(21, barbarianking21);
        data.put(22, barbarianking22);
        data.put(23, barbarianking23);
        data.put(24, barbarianking24);
        data.put(25, barbarianking25);
        data.put(26, barbarianking26);
        data.put(27, barbarianking27);
        data.put(28, barbarianking28);
        data.put(29, barbarianking29);
        data.put(30, barbarianking30);
        data.put(31, barbarianking31);
        data.put(32, barbarianking32);
        data.put(33, barbarianking33);
        data.put(34, barbarianking34);
        data.put(35, barbarianking35);
        data.put(36, barbarianking36);
        data.put(37, barbarianking37);
        data.put(38, barbarianking38);
        data.put(39, barbarianking39);
        data.put(40, barbarianking40);
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
