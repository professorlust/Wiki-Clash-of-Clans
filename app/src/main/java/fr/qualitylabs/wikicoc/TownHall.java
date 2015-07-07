package fr.qualitylabs.wikicoc;

import java.util.Hashtable;

public class TownHall extends Building {

    String[] numberOfResourceBuildings;

    Hashtable<Integer, String[]> numberOfArmyBuildings;
    //    DarkBarracks,	Barracks, ArmyCamps, Lab, SpellFactory, DarkSpellFactory, BarbarianKingAltar, ArcherQueenAltar
    String[] numberOfArmyBuildings1 = {"-", "1", "1", "-", "-", "-", "-", "-"};
    String[] numberOfArmyBuildings2 = {"-", "2", "1", "-", "-", "-", "-", "-"};
    String[] numberOfArmyBuildings3 = {"-", "2", "2", "1", "-", "-", "-", "-"};
    String[] numberOfArmyBuildings4 = {"-", "3", "2", "1", "-", "-", "-", "-"};
    String[] numberOfArmyBuildings5 = {"-", "3", "3", "1", "1", "-", "-", "-"};
    String[] numberOfArmyBuildings6 = {"-", "3", "3", "1", "1", "-", "-", "-"};
    String[] numberOfArmyBuildings7 = {"1", "4", "4", "1", "1", "-", "1", "-"};
    String[] numberOfArmyBuildings8 = {"2", "4", "4", "1", "1", "1", "1", "-"};
    String[] numberOfArmyBuildings9 = {"2", "4", "4", "1", "1", "1", "1", "1"};
    String[] numberOfArmyBuildings10 = {"2", "4", "4", "1", "1", "1", "1", "1"};

    String[] numberOfDefenseBuildings;

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
    String[] townhall10 = {"10", "5 000", "4 000 000", "14j", "1,099"};

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
    }

    public String[] getNumberOfArmyBuildings(int townHallLevel){
        return numberOfArmyBuildings.get(townHallLevel);
    }
}
