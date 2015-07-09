package fr.qualitylabs.wikicoc;

public class ClanCastle extends Building {
    //    {lvl, buildCost, hp, troopCapacity, GoldCapactity, ElixirCapacity, DarkElixirCapacity, buildTime, xp, THRequiered}
    String[] clancastle1 = {"1", "10 000", "1 000", "10", "75 000", "75 000", "500", "N/A", "0", "3"};
    String[] clancastle2 = {"2", "100 000", "1 400", "15", "250 000", "250 000", "1 000", "6h", "146", "4"};
    String[] clancastle3 = {"3", "800 000", "2 000", "20", "700 000", "700 000", "2 500", "j", "293", "6"};
    String[] clancastle4 = {"4", "1 800 000", "2 600", "25", "1 000 000", "1 000 000", "4 000", "2j", "415", "8"};
    String[] clancastle5 = {"5", "5 000 000", "3 000", "30", "1 500 000", "1 500 000", "6 000", "7j", "777", "9"};
    String[] clancastle6 = {"6", "7 000 000", "3 400", "35", "2 000 000", "2 000 000", "10 000", "14j", "1 099", "10"};

    public ClanCastle() {
        name = "Château de clan";
        nameCode = "clan_castle";
        data.put(1, clancastle1);
        data.put(2, clancastle2);
        data.put(3, clancastle3);
        data.put(4, clancastle4);
        data.put(5, clancastle5);
        data.put(6, clancastle6);
        levelMax = data.size();
    }
}
