package fr.qualitylabs.wikiclashofclans;

import java.util.Hashtable;

/**
 * Created by Quentin on 07/06/2015.
 */
public class Troop {

    Hashtable<String, String[]> hashStatistiques = new Hashtable<>();

    //    Modèle du String[]: {nom, niveau, ciblesPréférées, typeCibles, typeDégats, espaceOccupé, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
//   TROUPES BLANCHES
    String[] barbare1 = {"Barbare", "1", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "8", "45", "25", "N/A", "N/A", "N/A"};
    String[] barbare2 = {"Barbare", "2", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "11", "54", "40", "50 000", "1", "6h"};
    String[] barbare3 = {"Barbare", "3", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "14", "65", "60", "150 000", "3", "1j"};
    String[] barbare4 = {"Barbare", "4", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "18", "78", "80", "500 000", "5", "3j"};
    String[] barbare5 = {"Barbare", "5", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "23", "95", "100", "1 500 00", "6", "5j"};
    String[] barbare6 = {"Barbare", "6", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "26", "110", "150", "4 500 000", "7", "10j"};
    String[] barbare7 = {"Barbare", "7", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "30", "125", "200", "6 000 000", "8", "14j"};

    String[] archer1 = {"Archer", "1", "Aucune", "Toutes", "Cible unique", "1", "25s", "24", "7", "20", "50", "N/A", "N/A", "N/A"};
    String[] archer2 = {"Archer", "2", "Aucune", "Toutes", "Cible unique", "1", "25s", "24", "9", "23", "80", "50 000", "1", "12h"};
    String[] archer3 = {"Archer", "3", "Aucune", "Toutes", "Cible unique", "1", "25s", "24", "12", "28", "120", "250 000", "3", "2j"};
    String[] archer4 = {"Archer", "4", "Aucune", "Toutes", "Cible unique", "1", "25s", "24", "16", "33", "160", "750 000", "5", "3j"};
    String[] archer5 = {"Archer", "5", "Aucune", "Toutes", "Cible unique", "1", "25s", "24", "20", "40", "200", "2 250 000", "6", "5j"};
    String[] archer6 = {"Archer", "6", "Aucune", "Toutes", "Cible unique", "1", "25s", "24", "22", "44", "300", "6 000 000", "7", "10j"};
    String[] archer7 = {"Archer", "7", "Aucune", "Toutes", "Cible unique", "1", "25s", "24", "25", "48", "400", "7 500 000", "8", "14j"};

    String[] gobelin1 = {"Gobelin", "1", "Ressources (x2)", "Terrestres", "Mêlée", "1", "30s", "32", "11", "25", "25", "N/A", "N/A", "N/A"};
    String[] gobelin2 = {"Gobelin", "2", "Ressources (x2)", "Terrestres", "Mêlée", "1", "30s", "32", "14", "30", "40", "50 000", "1", "12h"};
    String[] gobelin3 = {"Gobelin", "3", "Ressources (x2)", "Terrestres", "Mêlée", "1", "30s", "32", "19", "36", "60", "250 000", "3", "2j"};
    String[] gobelin4 = {"Gobelin", "4", "Ressources (x2)", "Terrestres", "Mêlée", "1", "30s", "32", "24", "43", "80", "750 000", "5", "3j"};
    String[] gobelin5 = {"Gobelin", "5", "Ressources (x2)", "Terrestres", "Mêlée", "1", "30s", "32", "32", "52", "100", "2 250 000", "6", "5j"};
    String[] gobelin6 = {"Gobelin", "6", "Ressources (x2)", "Terrestres", "Mêlée", "1", "30s", "32", "42", "68", "150", "4 500 000", "8", "10j"};

    String[] geant1 = {"Géant", "1", "Défenses", "Terrestres", "Cible unique", "5", "2m", "12", "11", "300", "500", "N/A", "N/A", "N/A"};
    String[] geant2 = {"Géant", "2", "Défenses", "Terrestres", "Cible unique", "5", "2m", "12", "14", "360", "750", "100 000", "2", "1j"};
    String[] geant3 = {"Géant", "3", "Défenses", "Terrestres", "Cible unique", "5", "2m", "12", "19", "430", "1 250", "250 000", "4", "2j"};
    String[] geant4 = {"Géant", "4", "Défenses", "Terrestres", "Cible unique", "5", "2m", "12", "24", "520", "1 750", "750 000", "5", "3j"};
    String[] geant5 = {"Géant", "5", "Défenses", "Terrestres", "Cible unique", "5", "2m", "12", "31", "670", "2 250", "2 250 000", "6", "5j"};
    String[] geant6 = {"Géant", "6", "Défenses", "Terrestres", "Cible unique", "5", "2m", "12", "43", "940", "3 000", "6 000 000", "7", "10j"};
    String[] geant7 = {"Géant", "7", "Défenses", "Terrestres", "Cible unique", "5", "2m", "12", "50", "1 100", "3 500", "7 000 000", "8", "14j"};

    String[] sapeur1 = {"Sapeur", "1", "Rempart (x40)", "Terrestres", "Zone étendue (2 cases)", "2", "2m", "24", "12", "20", "1 000", "N/A", "N/A", "N/A"};
    String[] sapeur2 = {"Sapeur", "2", "Rempart (x40)", "Terrestres", "Zone étendue (2 cases)", "2", "2m", "24", "16", "24", "1 500", "100 000", "2", "1j"};
    String[] sapeur3 = {"Sapeur", "3", "Rempart (x40)", "Terrestres", "Zone étendue (2 cases)", "2", "2m", "24", "24", "29", "2 000", "250 000", "4", "2j"};
    String[] sapeur4 = {"Sapeur", "4", "Rempart (x40)", "Terrestres", "Zone étendue (2 cases)", "2", "2m", "24", "32", "35", "2 500", "750 000", "5", "3j"};
    String[] sapeur5 = {"Sapeur", "5", "Rempart (x40)", "Terrestres", "Zone étendue (2 cases)", "2", "2m", "24", "46", "42", "3 000", "2 250 000", "6", "5j"};
    String[] sapeur6 = {"Sapeur", "6", "Rempart (x40)", "Terrestres", "Zone étendue (2 cases)", "2", "2m", "24", "60", "54", "3 500", "6 750 000", "8", "10j"};

    String[] ballon1 = {"Ballon", "1", "Défenses", "Terrestres", "Zone étendue (1,2 cases)", "5", "8m", "10", "25", "150", "2 000", "N/A", "N/A", "N/A"};
    String[] ballon2 = {"Ballon", "2", "Défenses", "Terrestres", "Zone étendue (1,2 cases)", "5", "8m", "10", "32", "180", "2 500", "150 000", "2", "1j"};
    String[] ballon3 = {"Ballon", "3", "Défenses", "Terrestres", "Zone étendue (1,2 cases)", "5", "8m", "10", "48", "216", "3 000", "450 000", "4", "2j"};
    String[] ballon4 = {"Ballon", "4", "Défenses", "Terrestres", "Zone étendue (1,2 cases)", "5", "8m", "10", "72", "280", "3 500", "1 350 000", "5", "3j"};
    String[] ballon5 = {"Ballon", "5", "Défenses", "Terrestres", "Zone étendue (1,2 cases)", "5", "8m", "10", "108", "390", "4 000", "2 500 000", "6", "5j"};
    String[] ballon6 = {"Ballon", "6", "Défenses", "Terrestres", "Zone étendue (1,2 cases)", "5", "8m", "10", "162", "545", "4 500", "6 000 000", "7", "10j"};

    String[] sorcier1 = {"Sorcier", "1", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,2 cases)", "4", "8m", "16", "50", "75", "1 500", "N/A", "N/A", "N/A"};
    String[] sorcier2 = {"Sorcier", "2", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,2 cases)", "4", "8m", "16", "70", "90", "2 000", "150 000", "3", "1j"};
    String[] sorcier3 = {"Sorcier", "3", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,2 cases)", "4", "8m", "16", "90", "108", "2 500", "450 000", "4", "2j"};
    String[] sorcier4 = {"Sorcier", "4", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,2 cases)", "4", "8m", "16", "125", "130", "3 000", "1 350 000", "5", "3j"};
    String[] sorcier5 = {"Sorcier", "5", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,2 cases)", "4", "8m", "16", "170", "156", "3 500", "2 500 000", "6", "5j"};
    String[] sorcier6 = {"Sorcier", "6", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,2 cases)", "4", "8m", "16", "180", "164", "4 000", "7 500 000", "8", "14j"};

    String[] guerisseuse1 = {"Guérisseuse", "1", "Toutes", "Terrestres", "Zone étendue (soins de 2 cases)", "14", "15m", "16", "35", "500", "5 000", "N/A", "N/A", "N/A"};
    String[] guerisseuse2 = {"Guérisseuse", "2", "Toutes", "Terrestres", "Zone étendue (soins de 2 cases)", "14", "15m", "16", "42", "600", "6 000", "750 000", "5", "3j"};
    String[] guerisseuse3 = {"Guérisseuse", "3", "Toutes", "Terrestres", "Zone étendue (soins de 2 cases)", "14", "15m", "16", "55", "840", "8 000", "1 500 000", "6", "5j"};
    String[] guerisseuse4 = {"Guérisseuse", "4", "Toutes", "Terrestres", "Zone étendue (soins de 2 cases)", "14", "15m", "16", "71", "1176", "10 000", "3 000 000", "7", "7j"};

    String[] dragon1 = {"Dragon", "1", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,3 cases)", "20", "30m", "16", "140", "1 900", "25 000", "N/A", "N/A", "N/A"};
    String[] dragon2 = {"Dragon", "2", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,3 cases)", "20", "30m", "16", "160", "2 100", "30 000", "2 000 000", "5", "7j"};
    String[] dragon3 = {"Dragon", "3", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,3 cases)", "20", "30m", "16", "180", "2 300", "36 000", "3 000 000", "6", "10j"};
    String[] dragon4 = {"Dragon", "4", "Toutes", "Terrestres et Aériennes", "Zone étendue (0,3 cases)", "20", "30m", "16", "200", "2 500", "42 000", "8 000 000", "8", "14j"};

    String[] pekka1 = {"P.E.K.K.A.", "1", "Toutes", "Terrestres", "Cible unique", "25", "45m", "16", "240", "2 800", "30 000", "N/A", "N/A", "N/A"};
    String[] pekka2 = {"P.E.K.K.A.", "2", "Toutes", "Terrestres", "Cible unique", "25", "45m", "16", "270", "3 100", "35 000", "3 000 000", "6", "10j"};
    String[] pekka3 = {"P.E.K.K.A.", "3", "Toutes", "Terrestres", "Cible unique", "25", "45m", "16", "300", "3 500", "40 000", "6 000 000", "6", "12j"};
    String[] pekka4 = {"P.E.K.K.A.", "4", "Toutes", "Terrestres", "Cible unique", "25", "45m", "16", "340", "4 000", "45 000", "7 000 000", "8", "14j"};
    String[] pekka5 = {"P.E.K.K.A.", "5", "Toutes", "Terrestres", "Cible unique", "25", "45m", "16", "380", "4 500", "50 000", "8 000 000", "8", "14j"};

    //    TROUPES NOIRES
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

    public Troop() {
//        Stockage des statistiques de chaque TROUPE BLANCHE
        hashStatistiques.put("barbare1", barbare1);
        hashStatistiques.put("barbare2", barbare2);
        hashStatistiques.put("barbare3", barbare3);
        hashStatistiques.put("barbare4", barbare4);
        hashStatistiques.put("barbare5", barbare5);
        hashStatistiques.put("barbare6", barbare6);
        hashStatistiques.put("barbare7", barbare7);

        hashStatistiques.put("archer1", archer1);
        hashStatistiques.put("archer2", archer2);
        hashStatistiques.put("archer3", archer3);
        hashStatistiques.put("archer4", archer4);
        hashStatistiques.put("archer5", archer5);
        hashStatistiques.put("archer6", archer6);
        hashStatistiques.put("archer7", archer7);

        hashStatistiques.put("gobelin1", gobelin1);
        hashStatistiques.put("gobelin2", gobelin2);
        hashStatistiques.put("gobelin3", gobelin3);
        hashStatistiques.put("gobelin4", gobelin4);
        hashStatistiques.put("gobelin5", gobelin5);
        hashStatistiques.put("gobelin6", gobelin6);

        hashStatistiques.put("geant1", geant1);
        hashStatistiques.put("geant2", geant2);
        hashStatistiques.put("geant3", geant3);
        hashStatistiques.put("geant4", geant4);
        hashStatistiques.put("geant5", geant5);
        hashStatistiques.put("geant6", geant6);
        hashStatistiques.put("geant7", geant7);

        hashStatistiques.put("sapeur1", sapeur1);
        hashStatistiques.put("sapeur2", sapeur2);
        hashStatistiques.put("sapeur3", sapeur3);
        hashStatistiques.put("sapeur4", sapeur4);
        hashStatistiques.put("sapeur5", sapeur5);
        hashStatistiques.put("sapeur6", sapeur6);

        hashStatistiques.put("ballon1", ballon1);
        hashStatistiques.put("ballon2", ballon2);
        hashStatistiques.put("ballon3", ballon3);
        hashStatistiques.put("ballon4", ballon4);
        hashStatistiques.put("ballon5", ballon5);
        hashStatistiques.put("ballon6", ballon6);

        hashStatistiques.put("sorcier1", sorcier1);
        hashStatistiques.put("sorcier2", sorcier2);
        hashStatistiques.put("sorcier3", sorcier3);
        hashStatistiques.put("sorcier4", sorcier4);
        hashStatistiques.put("sorcier5", sorcier5);
        hashStatistiques.put("sorcier6", sorcier6);

        hashStatistiques.put("guerisseuse1", guerisseuse1);
        hashStatistiques.put("guerisseuse2", guerisseuse2);
        hashStatistiques.put("guerisseuse3", guerisseuse3);
        hashStatistiques.put("guerisseuse4", guerisseuse4);

        hashStatistiques.put("dragon1", dragon1);
        hashStatistiques.put("dragon2", dragon2);
        hashStatistiques.put("dragon3", dragon3);
        hashStatistiques.put("dragon4", dragon4);

        hashStatistiques.put("pekka1", pekka1);
        hashStatistiques.put("pekka2", pekka2);
        hashStatistiques.put("pekka3", pekka3);
        hashStatistiques.put("pekka4", pekka4);
        hashStatistiques.put("pekka5", pekka5);

        //Stockage des statistiques de chaque TROUPE NOIRE
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
        String[] nullStat = {"", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        switch (clé) {
            case "barbare1":
                return hashStatistiques.get("barbare1");
            case "barbare2":
                return hashStatistiques.get("barbare2");
            case "barbare3":
                return hashStatistiques.get("barbare3");
            case "barbare4":
                return hashStatistiques.get("barbare4");
            case "barbare5":
                return hashStatistiques.get("barbare5");
            case "barbare6":
                return hashStatistiques.get("barbare6");
            case "barbare7":
                return hashStatistiques.get("barbare7");

            case "archer1":
                return hashStatistiques.get("archer1");
            case "archer2":
                return hashStatistiques.get("archer2");
            case "archer3":
                return hashStatistiques.get("archer3");
            case "archer4":
                return hashStatistiques.get("archer4");
            case "archer5":
                return hashStatistiques.get("archer5");
            case "archer6":
                return hashStatistiques.get("archer6");
            case "archer7":
                return hashStatistiques.get("archer7");

            case "gobelin1":
                return hashStatistiques.get("gobelin1");
            case "gobelin2":
                return hashStatistiques.get("gobelin2");
            case "gobelin3":
                return hashStatistiques.get("gobelin3");
            case "gobelin4":
                return hashStatistiques.get("gobelin4");
            case "gobelin5":
                return hashStatistiques.get("gobelin5");
            case "gobelin6":
                return hashStatistiques.get("gobelin6");

            case "geant1":
                return hashStatistiques.get("geant1");
            case "geant2":
                return hashStatistiques.get("geant2");
            case "geant3":
                return hashStatistiques.get("geant3");
            case "geant4":
                return hashStatistiques.get("geant4");
            case "geant5":
                return hashStatistiques.get("geant5");
            case "geant6":
                return hashStatistiques.get("geant6");
            case "geant7":
                return hashStatistiques.get("geant7");

            case "sapeur1":
                return hashStatistiques.get("sapeur1");
            case "sapeur2":
                return hashStatistiques.get("sapeur2");
            case "sapeur3":
                return hashStatistiques.get("sapeur3");
            case "sapeur4":
                return hashStatistiques.get("sapeur4");
            case "sapeur5":
                return hashStatistiques.get("sapeur5");
            case "sapeur6":
                return hashStatistiques.get("sapeur6");

            case "ballon1":
                return hashStatistiques.get("ballon1");
            case "ballon2":
                return hashStatistiques.get("ballon2");
            case "ballon3":
                return hashStatistiques.get("ballon3");
            case "ballon4":
                return hashStatistiques.get("ballon4");
            case "ballon5":
                return hashStatistiques.get("ballon5");
            case "ballon6":
                return hashStatistiques.get("ballon6");

            case "sorcier1":
                return hashStatistiques.get("sorcier1");
            case "sorcier2":
                return hashStatistiques.get("sorcier2");
            case "sorcier3":
                return hashStatistiques.get("sorcier3");
            case "sorcier4":
                return hashStatistiques.get("sorcier4");
            case "sorcier5":
                return hashStatistiques.get("sorcier5");
            case "sorcier6":
                return hashStatistiques.get("sorcier6");

            case "guerisseuse1":
                return hashStatistiques.get("guerisseuse1");
            case "guerisseuse2":
                return hashStatistiques.get("guerisseuse2");
            case "guerisseuse3":
                return hashStatistiques.get("guerisseuse3");
            case "guerisseuse4":
                return hashStatistiques.get("guerisseuse4");

            case "dragon1":
                return hashStatistiques.get("dragon1");
            case "dragon2":
                return hashStatistiques.get("dragon2");
            case "dragon3":
                return hashStatistiques.get("dragon3");
            case "dragon4":
                return hashStatistiques.get("dragon4");

            case "pekka1":
                return hashStatistiques.get("pekka1");
            case "pekka2":
                return hashStatistiques.get("pekka2");
            case "pekka3":
                return hashStatistiques.get("pekka3");
            case "pekka4":
                return hashStatistiques.get("pekka4");
            case "pekka5":
                return hashStatistiques.get("pekka5");

            case "gargouille1":
                return hashStatistiques.get("gargouille1");
            case "gargouille2":
                return hashStatistiques.get("gargouille2");
            case "gargouille3":
                return hashStatistiques.get("gargouille3");
            case "gargouille4":
                return hashStatistiques.get("gargouille4");
            case "gargouille5":
                return hashStatistiques.get("gargouille5");
            case "gargouille6":
                return hashStatistiques.get("gargouille6");

            case "chevaucheur1":
                return hashStatistiques.get("chevaucheur1");
            case "chevaucheur2":
                return hashStatistiques.get("chevaucheur2");
            case "chevaucheur3":
                return hashStatistiques.get("chevaucheur3");
            case "chevaucheur4":
                return hashStatistiques.get("chevaucheur4");
            case "chevaucheur5":
                return hashStatistiques.get("chevaucheur5");

            case "valkyrie1":
                return hashStatistiques.get("valkyrie1");
            case "valkyrie2":
                return hashStatistiques.get("valkyrie2");
            case "valkyrie3":
                return hashStatistiques.get("valkyrie3");
            case "valkyrie4":
                return hashStatistiques.get("valkyrie4");

            case "golem1":
                return hashStatistiques.get("golem1");
            case "golem2":
                return hashStatistiques.get("golem2");
            case "golem3":
                return hashStatistiques.get("golem3");
            case "golem4":
                return hashStatistiques.get("golem4");
            case "golem5":
                return hashStatistiques.get("golem5");

            case "sorciere1":
                return hashStatistiques.get("sorciere1");
            case "sorciere2":
                return hashStatistiques.get("sorciere2");

            case "molosse1":
                return hashStatistiques.get("molosse1");
            case "molosse2":
                return hashStatistiques.get("molosse2");
            case "molosse3":
                return hashStatistiques.get("molosse3");

            default:
                return nullStat;
        }
    }

    public int getMax(String nom) {
        int max = 0;
        switch (nom) {
            case "Barbare":
                max = 6;
                break;
            case "Archer":
                max = 6;
                break;
            case "Gobelin":
                max = 5;
                break;
            case "Géant":
                max = 6;
                break;
            case "Sapeur":
                max = 5;
                break;
            case "Ballon":
                max = 5;
                break;
            case "Sorcier":
                max = 5;
                break;
            case "Guérisseuse":
                max = 3;
                break;
            case "Dragon":
                max = 3;
                break;
            case "P.E.K.K.A.":
                max = 4;
                break;
            case "Gargouille":
                max = 5;
                break;
            case "Chevaucheur de cochon":
                max = 4;
                break;
            case "Valkyrie":
                max = 3;
                break;
            case "Golem":
                max = 4;
                break;
            case "Sorcière":
                max = 1;
                break;
            case "Molosse de lave":
                max = 2;
                break;
        }
        return max;
    }
}