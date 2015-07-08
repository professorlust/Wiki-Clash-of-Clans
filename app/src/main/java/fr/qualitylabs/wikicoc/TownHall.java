package fr.qualitylabs.wikicoc;

import java.util.Hashtable;

public class TownHall extends Building {

    Hashtable<Integer, String[]> numberOfArmyBuildings;
    //    DarkBarracks,	Barracks, ArmyCamps, Lab, SpellFactory, DarkSpellFactory, BarbarianKingAltar, ArcherQueenAltar, ClanCastle
    String[] numberOfArmyBuildings1 = {"0", "1", "1", "0", "0", "0", "0", "0", "0"};
    String[] numberOfArmyBuildings2 = {"0", "2", "1", "0", "0", "0", "0", "0", "0"};
    String[] numberOfArmyBuildings3 = {"0", "2", "2", "1", "0", "0", "0", "0", "1"};
    String[] numberOfArmyBuildings4 = {"0", "3", "2", "1", "0", "0", "0", "0", "1"};
    String[] numberOfArmyBuildings5 = {"0", "3", "3", "1", "1", "0", "0", "0", "1"};
    String[] numberOfArmyBuildings6 = {"0", "3", "3", "1", "1", "0", "0", "0", "1"};
    String[] numberOfArmyBuildings7 = {"1", "4", "4", "1", "1", "0", "1", "0", "1"};
    String[] numberOfArmyBuildings8 = {"2", "4", "4", "1", "1", "1", "1", "0", "1"};
    String[] numberOfArmyBuildings9 = {"2", "4", "4", "1", "1", "1", "1", "1", "1"};
    String[] numberOfArmyBuildings10 = {"2", "4", "4", "1", "1", "1", "1", "1", "1"};
    Hashtable<Integer, String[]> levelOfArmyBuildings;
    //    DarkBarracks,	Barracks, ArmyCamps, Lab, SpellFactory, DarkSpellFactory, BarbarianKingAltar, ArcherQueenAltar
    String[] levelOfArmyBuildings1 = {"N/A", "3", "1", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A"};
    String[] levelOfArmyBuildings2 = {"N/A", "4", "2", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A"};
    String[] levelOfArmyBuildings3 = {"N/A", "5", "3", "1", "N/A", "N/A", "N/A", "N/A", "1"};
    String[] levelOfArmyBuildings4 = {"N/A", "6", "4", "2", "N/A", "N/A", "N/A", "N/A", "2"};
    String[] levelOfArmyBuildings5 = {"N/A", "7", "5", "3", "1", "N/A", "N/A", "N/A", "2"};
    String[] levelOfArmyBuildings6 = {"N/A", "8", "6", "4", "2", "N/A", "N/A", "N/A", "3"};
    String[] levelOfArmyBuildings7 = {"2", "9", "6", "5", "3", "N/A", "N/A", "N/A", "3"};
    String[] levelOfArmyBuildings8 = {"4", "10", "6", "6", "3", "2", "N/A", "N/A", "4"};
    String[] levelOfArmyBuildings9 = {"6", "10", "7", "7", "4", "3", "N/A", "N/A", "5"};
    String[] levelOfArmyBuildings10 = {"6", "10", "8", "8", "5", "3", "N/A", "N/A", "6"};


    Hashtable<Integer, String[]> numberOfResourceBuildings;
    //    GoldMines, ElixirCollectors, DarkElixirDrills, GoldStorages, ElixirStorages, DarkElixirStorages
    String[] numberOfResourceBuildings1 = {"1", "1", "0", "1", "1", "0"};
    String[] numberOfResourceBuildings2 = {"2", "2", "0", "1", "1", "0"};
    String[] numberOfResourceBuildings3 = {"3", "3", "0", "2", "2", "0"};
    String[] numberOfResourceBuildings4 = {"4", "4", "0", "2", "2", "0"};
    String[] numberOfResourceBuildings5 = {"5", "5", "0", "2", "2", "0"};
    String[] numberOfResourceBuildings6 = {"6", "6", "0", "2", "2", "0"};
    String[] numberOfResourceBuildings7 = {"6", "6", "1", "2", "2", "1"};
    String[] numberOfResourceBuildings8 = {"6", "6", "2", "3", "3", "1"};
    String[] numberOfResourceBuildings9 = {"6", "6", "2", "4", "4", "1"};
    String[] numberOfResourceBuildings10 = {"7", "7", "3", "4", "4", "1"};
    Hashtable<Integer, String[]> levelOfResourceBuildings;
    //    GoldMines, ElixirCollectors, DarkElixirDrills, GoldStorages, ElixirStorages, DarkElixirStorages
    String[] levelOfResourceBuildings1 = {"2", "2", "N/A", "1", "1", "N/A"};
    String[] levelOfResourceBuildings2 = {"4", "4", "N/A", "3", "3", "N/A"};
    String[] levelOfResourceBuildings3 = {"6", "6", "N/A", "6", "6", "N/A"};
    String[] levelOfResourceBuildings4 = {"8", "8", "N/A", "8", "8", "N/A"};
    String[] levelOfResourceBuildings5 = {"10", "10", "N/A", "9", "9", "N/A"};
    String[] levelOfResourceBuildings6 = {"10", "10", "N/A", "10", "10", "N/A"};
    String[] levelOfResourceBuildings7 = {"11", "11", "3", "11", "11", "2"};
    String[] levelOfResourceBuildings8 = {"12", "12", "3", "11", "11", "4"};
    String[] levelOfResourceBuildings9 = {"12", "12", "6", "11", "11", "6"};
    String[] levelOfResourceBuildings10 = {"12", "12", "6", "11", "11", "6"};

    Hashtable<Integer, String[]> numberOfDefenseBuildings;
    //    Cannons, ArcherTowers, Walls, Mortars, Bombs, AirDefenses, AirSweepers, Springs, WizardTowers, GiantBombs, AirBombs, SeekingAirMines, Skeletons, HiddenTeslas, XBows, InfernoTowers
    String[] numberOfDefenseBuildings1 = {"2", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    String[] numberOfDefenseBuildings2 = {"2", "1", "25", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    String[] numberOfDefenseBuildings3 = {"2", "1", "50", "1", "2", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    String[] numberOfDefenseBuildings4 = {"2", "2", "75", "1", "2", "1", "0", "2", "0", "0", "0", "0", "0", "0", "0", "0"};
    String[] numberOfDefenseBuildings5 = {"3", "3", "100", "1", "4", "1", "0", "2", "1", "0", "2", "0", "0", "0", "0", "0"};
    String[] numberOfDefenseBuildings6 = {"3", "3", "125", "2", "4", "1", "1", "4", "2", "1", "2", "0", "0", "0", "0", "0"};
    String[] numberOfDefenseBuildings7 = {"5", "4", "175", "3", "6", "2", "1", "4", "2", "2", "2", "1", "0", "2", "0", "0"};
    String[] numberOfDefenseBuildings8 = {"5", "5", "225", "4", "6", "3", "1", "6", "3", "3", "4", "2", "2", "3", "0", "0"};
    String[] numberOfDefenseBuildings9 = {"5", "6", "250", "4", "6", "4", "2", "6", "4", "4", "4", "4", "2", "4", "2", "0"};
    String[] numberOfDefenseBuildings10 = {"6", "7", "250", "4", "6", "4", "2", "6", "4", "5", "5", "5", "3", "4", "3", "2"};
    Hashtable<Integer, String[]> levelOfDefenseBuildings;
    //    Cannons, ArcherTowers, Walls, Mortars, Bombs, AirDefenses, AirSweepers, Springs, WizardTowers, GiantBombs, AirBombs, SeekingAirMines, Skeletons, HiddenTeslas, XBows, InfernoTowers
    String[] levelOfDefenseBuildings1 = {"2", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A"};
    String[] levelOfDefenseBuildings2 = {"3", "2", "2", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A"};
    String[] levelOfDefenseBuildings3 = {"4", "3", "3", "1", "2", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A"};
    String[] levelOfDefenseBuildings4 = {"5", "4", "4", "2", "2", "2", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A"};
    String[] levelOfDefenseBuildings5 = {"6", "6", "5", "3", "3", "3", "N/A", "N/A", "2", "N/A", "2", "N/A", "N/A", "N/A", "N/A", "N/A"};
    String[] levelOfDefenseBuildings6 = {"7", "7", "6", "4", "3", "4", "2", "N/A", "3", "2", "2", "N/A", "N/A", "N/A", "N/A", "N/A"};
    String[] levelOfDefenseBuildings7 = {"8", "8", "7", "5", "4", "5", "3", "N/A", "4", "2", "3", "1", "N/A", "3", "N/A", "N/A"};
    String[] levelOfDefenseBuildings8 = {"10", "10", "8", "6", "5", "6", "4", "N/A", "6", "3", "3", "1", "2", "6", "N/A", "N/A"};
    String[] levelOfDefenseBuildings9 = {"11", "11", "10", "7", "6", "7", "5", "N/A", "7", "3", "4", "2", "3", "7", "3", "N/A"};
    String[] levelOfDefenseBuildings10 = {"13", "13", "11", "8", "6", "8", "6", "N/A", "8", "4", "4", "3", "3", "8", "4", "3"};

    //{lvl, hp, buildCost, buildTime, xp, maxBuildingsNumber}
    String[] townhall1 = {"1", "1 500", "N/A", "N/A", "0"};
    String[] townhall2 = {"2", "1 600", "1 000", "10s", "3"};
    String[] townhall3 = {"3", "1 850", "4 000", "3h", "103"};
    String[] townhall4 = {"4", "2 100", "25 000", "1j", "293"};
    String[] townhall5 = {"5", "2 400", "150 000", "2j", "415"};
    String[] townhall6 = {"6", "2 800", "750 000", "4j", "587"};
    String[] townhall7 = {"7", "3 200", "1 200 000", "6j", "720"};
    String[] townhall8 = {"8", "3 700", "2 000 000", "8j", "831"};
    String[] townhall9 = {"9", "4 200", "3 000 000", "10j", "929"};
    String[] townhall10 = {"10", "5 000", "4 000 000", "14j", "1 099"};

    public TownHall() {
        name = "Hôtel de ville";
        nameCode = "town_hall";
        data.put(1, townhall1);
        data.put(2, townhall2);
        data.put(3, townhall3);
        data.put(4, townhall4);
        data.put(5, townhall5);
        data.put(6, townhall6);
        data.put(7, townhall7);
        data.put(8, townhall8);
        data.put(9, townhall9);
        data.put(10, townhall10);
        levelMax = data.size();

        numberOfArmyBuildings = new Hashtable<>();
        numberOfArmyBuildings.put(1, numberOfArmyBuildings1);
        numberOfArmyBuildings.put(2, numberOfArmyBuildings2);
        numberOfArmyBuildings.put(3, numberOfArmyBuildings3);
        numberOfArmyBuildings.put(4, numberOfArmyBuildings4);
        numberOfArmyBuildings.put(5, numberOfArmyBuildings5);
        numberOfArmyBuildings.put(6, numberOfArmyBuildings6);
        numberOfArmyBuildings.put(7, numberOfArmyBuildings7);
        numberOfArmyBuildings.put(8, numberOfArmyBuildings8);
        numberOfArmyBuildings.put(9, numberOfArmyBuildings9);
        numberOfArmyBuildings.put(10, numberOfArmyBuildings10);
        levelOfArmyBuildings = new Hashtable<>();
        levelOfArmyBuildings.put(1, levelOfArmyBuildings1);
        levelOfArmyBuildings.put(2, levelOfArmyBuildings2);
        levelOfArmyBuildings.put(3, levelOfArmyBuildings3);
        levelOfArmyBuildings.put(4, levelOfArmyBuildings4);
        levelOfArmyBuildings.put(5, levelOfArmyBuildings5);
        levelOfArmyBuildings.put(6, levelOfArmyBuildings6);
        levelOfArmyBuildings.put(7, levelOfArmyBuildings7);
        levelOfArmyBuildings.put(8, levelOfArmyBuildings8);
        levelOfArmyBuildings.put(9, levelOfArmyBuildings9);
        levelOfArmyBuildings.put(10, levelOfArmyBuildings10);

        numberOfResourceBuildings = new Hashtable<>();
        numberOfResourceBuildings.put(1, numberOfResourceBuildings1);
        numberOfResourceBuildings.put(2, numberOfResourceBuildings2);
        numberOfResourceBuildings.put(3, numberOfResourceBuildings3);
        numberOfResourceBuildings.put(4, numberOfResourceBuildings4);
        numberOfResourceBuildings.put(5, numberOfResourceBuildings5);
        numberOfResourceBuildings.put(6, numberOfResourceBuildings6);
        numberOfResourceBuildings.put(7, numberOfResourceBuildings7);
        numberOfResourceBuildings.put(8, numberOfResourceBuildings8);
        numberOfResourceBuildings.put(9, numberOfResourceBuildings9);
        numberOfResourceBuildings.put(10, numberOfResourceBuildings10);
        levelOfResourceBuildings = new Hashtable<>();
        levelOfResourceBuildings.put(1, levelOfResourceBuildings1);
        levelOfResourceBuildings.put(2, levelOfResourceBuildings2);
        levelOfResourceBuildings.put(3, levelOfResourceBuildings3);
        levelOfResourceBuildings.put(4, levelOfResourceBuildings4);
        levelOfResourceBuildings.put(5, levelOfResourceBuildings5);
        levelOfResourceBuildings.put(6, levelOfResourceBuildings6);
        levelOfResourceBuildings.put(7, levelOfResourceBuildings7);
        levelOfResourceBuildings.put(8, levelOfResourceBuildings8);
        levelOfResourceBuildings.put(9, levelOfResourceBuildings9);
        levelOfResourceBuildings.put(10, levelOfResourceBuildings10);

        numberOfDefenseBuildings = new Hashtable<>();
        numberOfDefenseBuildings.put(1, numberOfDefenseBuildings1);
        numberOfDefenseBuildings.put(2, numberOfDefenseBuildings2);
        numberOfDefenseBuildings.put(3, numberOfDefenseBuildings3);
        numberOfDefenseBuildings.put(4, numberOfDefenseBuildings4);
        numberOfDefenseBuildings.put(5, numberOfDefenseBuildings5);
        numberOfDefenseBuildings.put(6, numberOfDefenseBuildings6);
        numberOfDefenseBuildings.put(7, numberOfDefenseBuildings7);
        numberOfDefenseBuildings.put(8, numberOfDefenseBuildings8);
        numberOfDefenseBuildings.put(9, numberOfDefenseBuildings9);
        numberOfDefenseBuildings.put(10, numberOfDefenseBuildings10);
        levelOfDefenseBuildings = new Hashtable<>();
        levelOfDefenseBuildings.put(1, levelOfDefenseBuildings1);
        levelOfDefenseBuildings.put(2, levelOfDefenseBuildings2);
        levelOfDefenseBuildings.put(3, levelOfDefenseBuildings3);
        levelOfDefenseBuildings.put(4, levelOfDefenseBuildings4);
        levelOfDefenseBuildings.put(5, levelOfDefenseBuildings5);
        levelOfDefenseBuildings.put(6, levelOfDefenseBuildings6);
        levelOfDefenseBuildings.put(7, levelOfDefenseBuildings7);
        levelOfDefenseBuildings.put(8, levelOfDefenseBuildings8);
        levelOfDefenseBuildings.put(9, levelOfDefenseBuildings9);
        levelOfDefenseBuildings.put(10, levelOfDefenseBuildings10);
    }

    public String[] getProperty(int level) {
        return super.getProperty(level);
    }

    public String[] getNumberOfArmyBuildings(int townHallLevel) {
        return numberOfArmyBuildings.get(townHallLevel);
    }

    public String[] getLevelOfArmyBuildings(int townHallLevel) {
        return levelOfArmyBuildings.get(townHallLevel);
    }

    public String[] getNumberOfResourceBuildings(int townHallLevel) {
        return numberOfResourceBuildings.get(townHallLevel);
    }

    public String[] getLevelOfResourceBuildings(int townHallLevel) {
        return levelOfResourceBuildings.get(townHallLevel);
    }

    public String[] getNumberOfDefenseBuildings(int townHallLevel) {
        return numberOfDefenseBuildings.get(townHallLevel);
    }

    public String[] getLevelOfDefenseBuildings(int townHallLevel) {
        return levelOfDefenseBuildings.get(townHallLevel);
    }
}
