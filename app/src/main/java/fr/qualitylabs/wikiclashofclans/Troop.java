package fr.qualitylabs.wikiclashofclans;

import java.util.Hashtable;

/**
 * Created by Quentin on 07/06/2015.
 */
public class Troop {

    Hashtable hashStatistiques = new Hashtable();
//    Modèle du String[]: {nom, niveau, ciblesPréférées, typeCibles, typeDégats, espaceOccupé, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
    String[] barbare1 = {"Barbare", "1", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "8", "45", "25", "N/A", "N/A", "N/A"};
    String[] barbare2 = {"Barbare", "2", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "11", "54", "40", "50 000", "1", "6h"};
    String[] barbare3 = {"Barbare", "3", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "14", "65", "60", "150 000", "3", "1j"};
    String[] barbare4 = {"Barbare", "4", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "18", "78", "80", "500 000", "5", "3j"};
    String[] barbare5 = {"Barbare", "5", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "23", "95", "100", "1 500 00", "6", "5j"};
    String[] barbare6 = {"Barbare", "6", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "26", "110", "150", "4 500 000", "7", "10j"};
    String[] barbare7 = {"Barbare", "7", "Toutes", "Terrestres", "Cible unique", "1", "20s", "24", "30", "125", "200", "6 000 000", "8", "14j"};

    public Troop(){
//        Stockage des statistiques de chaque troupe
        hashStatistiques.put("barbare1", barbare1);
        hashStatistiques.put("barbare2", barbare2);
        hashStatistiques.put("barbare3", barbare3);
        hashStatistiques.put("barbare4", barbare4);
        hashStatistiques.put("barbare5", barbare5);
        hashStatistiques.put("barbare6", barbare6);
        hashStatistiques.put("barbare7", barbare7);
    }

    public String[] calculerStatistiques(String nom, int niveau) {
        String clé = nom + niveau;
        String[] nullStat = {"","","","","","","","","","","","","",""};
        switch (clé){
            case "barbare1": return (String[]) hashStatistiques.get("barbare1");
            case "barbare2": return (String[]) hashStatistiques.get("barbare2");
            case "barbare3": return (String[]) hashStatistiques.get("barbare3");
            case "barbare4": return (String[]) hashStatistiques.get("barbare4");
            case "barbare5": return (String[]) hashStatistiques.get("barbare5");
            case "barbare6": return (String[]) hashStatistiques.get("barbare6");
            case "barbare7": return (String[]) hashStatistiques.get("barbare7");
            default: return nullStat;
        }
    }
}
