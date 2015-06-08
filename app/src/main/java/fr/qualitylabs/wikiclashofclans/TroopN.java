package fr.qualitylabs.wikiclashofclans;

import java.util.Hashtable;

/**
 * Created by Ironova on 08/06/15.
 */
public class TroopN {

    Hashtable hashStatistiques = new Hashtable();

    //    Modèle du String[]: {nom, niveau, ciblesPréférées, typeCibles, typeDégats, espaceOccupé, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] gargouille1 = {"Gargouille", "1", "Toutes", "Terrestres et Aériennes", "Cible unique", "2", "45s", "32", "35", "55", "6", "N/A", "N/A", "N/A"};
    String[] gargouille2 = {"Gargouille", "2", "Toutes", "Terrestres et Aériennes", "Cible unique", "2", "45s", "32", "38", "60", "7", "10 000", "5", "5j"};
    String[] gargouille3 = {"Gargouille", "3", "Toutes", "Terrestres et Aériennes", "Cible unique", "2", "45s", "32", "42", "66", "8", "20 000", "6", "6j"};
    String[] gargouille4 = {"Gargouille", "4", "Toutes", "Terrestres et Aériennes", "Cible unique", "2", "45s", "32", "46", "72", "9", "30 000", "6", "7j"};
    String[] gargouille5 = {"Gargouille", "5", "Toutes", "Terrestres et Aériennes", "Cible unique", "2", "45s", "32", "50", "78", "10", "40 000", "7", "10j"};
    String[] gargouille6 = {"Gargouille", "6", "Toutes", "Terrestres et Aériennes", "Cible unique", "2", "45s", "32", "54", "84", "11", "100 000", "8", "14j"};

    String[] chevaucheur1 = {"Chevaucheur de cochon", "1", "Défenses", "Terrestres", "Cible unique", "5", "2m", "24", "60", "270", "40", "N/A", "N/A", "N/A"};
    String[] chevaucheur2 = {"Chevaucheur de cochon", "2", "Défenses", "Terrestres", "Cible unique", "5", "2m", "24", "70", "312", "45", "20 000", "5", "8j"};
    String[] chevaucheur3 = {"Chevaucheur de cochon", "3", "Défenses", "Terrestres", "Cible unique", "5", "2m", "24", "80", "360", "52", "30 000", "6", "10j"};
    String[] chevaucheur4 = {"Chevaucheur de cochon", "4", "Défenses", "Terrestres", "Cible unique", "5", "2m", "24", "92", "415", "58", "40 000", "6", "12j"};
    String[] chevaucheur5 = {"Chevaucheur de cochon", "5", "Défenses", "Terrestres", "Cible unique", "5", "2m", "24", "105", "475", "65", "50 000", "7", "14j"};

    String[] valkyrie1 = {"Valkyrie", "1", "Toutes", "Terrestres", "Zone étendue (1 case)", "8", "8m", "24", "88", "900", "70", "N/A", "N/A", "N/A"};
    String[] valkyrie2 = {"Valkyrie", "2", "Toutes", "Terrestres", "Zone étendue (1 case)", "8", "8m", "24", "99", "1 000", "100", "50 000", "6", "10j"};
    String[] valkyrie3 = {"Valkyrie", "3", "Toutes", "Terrestres", "Zone étendue (1 case)", "8", "8m", "24", "111", "1 100", "130", "60 000", "7", "12j"};
    String[] valkyrie4 = {"Valkyrie", "4", "Toutes", "Terrestres", "Zone étendue (1 case)", "8", "8m", "24", "124", "1 200", "160", "70 000", "7", "14j"};

    String[] golem1 = {"Golem", "1", "Défenses", "Terrestres", "Mêlée", "30", "45m", "12", "38", "4 500", "450", "N/A", "N/A", "N/A"};
    String[] golem2 = {"Golem", "2", "Défenses", "Terrestres", "Mêlée", "30", "45m", "12", "42", "5 000", "525", "60 000", "6", "10j"};
    String[] golem3 = {"Golem", "3", "Défenses", "Terrestres", "Mêlée", "30", "45m", "12", "46", "5 500", "600", "70 000", "7", "12j"};
    String[] golem4 = {"Golem", "4", "Défenses", "Terrestres", "Mêlée", "30", "45m", "12", "50", "6 000", "675", "80 000", "7", "14j"};
    String[] golem5 = {"Golem", "5", "Défenses", "Terrestres", "Mêlée", "30", "45m", "12", "54", "6 300", "750", "90 000", "8", "14j"};

    String[] sorciere1 = {"Sorcière", "1", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,3 cases)", "12", "20m", "12", "25", "75", "250", "N/A", "N/A", "N/A"};
    String[] sorciere2 = {"Sorcière", "2", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,3 cases)", "12", "20m", "12", "30", "100", "350", "75 000", "7", "10j"};

    String[] molosse1 = {"Molosse de lave", "1", "Défenses antiaériennes", "Terrestres et Aériennes", "Cible unique", "30", "45m", "20", "10", "5 700", "390", "N/A", "N/A", "N/A"};
    String[] molosse2 = {"Molosse de lave", "2", "Défenses antiaériennes", "Terrestres et Aériennes", "Cible unique", "30", "45m", "20", "12", "6 200", "450", "60 000", "7", "10j"};
    String[] molosse3 = {"Molosse de lave", "3", "Défenses antiaériennes", "Terrestres et Aériennes", "Cible unique", "30", "45m", "20", "14", "6 700", "510", "70 000", "8", "12j"};

    public TroopN(){
        //Stockage des statistiques de chaque troupe
        hashStatistiques.put("gargouille1", gargouille1);
        hashStatistiques.put("gargouille2", gargouille2);
        hashStatistiques.put("gargouille3", gargouille3);
        hashStatistiques.put("gargouille4", gargouille4);
        hashStatistiques.put("gargouille5", gargouille5);
        hashStatistiques.put("gargouille6", gargouille6);

        hashStatistiques.put("chevaucheur1", chevaucheur1);
        hashStatistiques.put("chevaucheur2", chevaucheur2);
        hashStatistiques.put("chevaucheur3", chevaucheur3);
        hashStatistiques.put("chevaucheur4", chevaucheur4);
        hashStatistiques.put("chevaucheur5", chevaucheur5);

        hashStatistiques.put("valkyrie1", valkyrie1);
        hashStatistiques.put("valkyrie2", valkyrie2);
        hashStatistiques.put("valkyrie3", valkyrie3);
        hashStatistiques.put("valkyrie4", valkyrie4);

        hashStatistiques.put("golem1", golem1);
        hashStatistiques.put("golem2", golem2);
        hashStatistiques.put("golem3", golem3);
        hashStatistiques.put("golem4", golem4);
        hashStatistiques.put("golem5", golem5);

        hashStatistiques.put("sorciere1", sorciere1);
        hashStatistiques.put("sorciere2", sorciere2);

        hashStatistiques.put("molosse1", molosse1);
        hashStatistiques.put("molosse2", molosse2);
        hashStatistiques.put("molosse3", molosse3);
    }

    public String[] calculerStatistiques(String nom, int niveau) {
        String clé = nom + niveau;
        String[] nullStat = {"","","","","","","","","","","","","",""};
        switch (clé){

            case "gargouille1": return (String[]) hashStatistiques.get("gargouille1");
            case "gargouille2": return (String[]) hashStatistiques.get("gargouille2");
            case "gargouille3": return (String[]) hashStatistiques.get("gargouille3");
            case "gargouille4": return (String[]) hashStatistiques.get("gargouille4");
            case "gargouille5": return (String[]) hashStatistiques.get("gargouille5");
            case "gargouille6": return (String[]) hashStatistiques.get("gargouille6");

            case "chevaucheur1": return (String[]) hashStatistiques.get("chevaucheur1");
            case "chevaucheur2": return (String[]) hashStatistiques.get("chevaucheur2");
            case "chevaucheur3": return (String[]) hashStatistiques.get("chevaucheur3");
            case "chevaucheur4": return (String[]) hashStatistiques.get("chevaucheur4");
            case "chevaucheur5": return (String[]) hashStatistiques.get("chevaucheur5");

            case "valkyrie1": return (String[]) hashStatistiques.get("valkyrie1");
            case "valkyrie2": return (String[]) hashStatistiques.get("valkyrie2");
            case "valkyrie3": return (String[]) hashStatistiques.get("valkyrie3");
            case "valkyrie4": return (String[]) hashStatistiques.get("valkyrie4");

            case "golem1": return (String[]) hashStatistiques.get("golem1");
            case "golem2": return (String[]) hashStatistiques.get("golem2");
            case "golem3": return (String[]) hashStatistiques.get("golem3");
            case "golem4": return (String[]) hashStatistiques.get("golem4");
            case "golem5": return (String[]) hashStatistiques.get("golem5");

            case "sorciere1": return (String[]) hashStatistiques.get("sorciere1");
            case "sorciere2": return (String[]) hashStatistiques.get("sorciere2");

            case "molosse1": return (String[]) hashStatistiques.get("molosse1");
            case "molosse2": return (String[]) hashStatistiques.get("molosse2");
            case "molosse3": return (String[]) hashStatistiques.get("molosse3");

            default: return nullStat;
        }
    }
}
