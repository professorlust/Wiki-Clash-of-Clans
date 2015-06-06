package fr.qualitylabs.wikiclashofclans;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NavigationDrawerFragment extends android.support.v4.app.Fragment { // De base, la classe h�rite de Fragment (package pa d�faut), on modifie ceci pour h�riter de Fragment de la librairie android.support.v4.app

    private ActionBarDrawerToggle mDrawerToggle; // Toggler gérant les méthodes d'ouverture/fermeture du Drawer
    private DrawerLayout mDrawerLayout; // Layout du Drawer
    private boolean mUserLearnedDrawer; // sait-on que le Drawer existe? (on l'a vu au moins 1 fois?)
    private boolean mFromSavedInstanceState; // le Drawer est-il créé pour la première fois? (ou recréé par une rotation de l'appareil par exemple?)
    public static final String PREF_FILE_NAME = "testpref"; // Nom du fichier de pr�f�rences
    public static final String KEY_USER_LEARNED_DRAWER = "user_learned_drawer"; // Clé (valeur) indiquant que le Drawer est connu
    private View containerView; // Servira à récupérer le fragment inclu dans le layout de l'activité (<fragment.../>)


    public NavigationDrawerFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) { // Vérifie si le Drawer est créé pour la 1ère fois, stocke le résultat dans le boolean mFromSavedInstanceState
        super.onCreate(savedInstanceState);

        mUserLearnedDrawer = Boolean.getBoolean(readFromPreferences(getActivity(), KEY_USER_LEARNED_DRAWER, "false"));
        if (savedInstanceState != null) { // Si une instance est sauvegardée
            mFromSavedInstanceState = true; // Le Drawer provient bien d'une instance sauvegardée (true)
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
    }

    public void setUp(int fragmentID, DrawerLayout drawerLayout, Toolbar toolbar) {
        containerView = getActivity().findViewById(fragmentID); // Récupère le fragment inclu dans le Layout
        mDrawerLayout = drawerLayout; // Récupère le Layout du Drawer

        mDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) { // Gère l'ouverture/fermeture du Drawer, on indique: l'Activity, le Layout contenant le Drawer, 2 String indiquant l'état ouvert/fermé
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if (!mUserLearnedDrawer) { // Si le Drawer n'est pas connu (et vu qu'il l'est maintenant car la méthode onDrawerOpened l'a ouvert)
                    mUserLearnedDrawer = true; // Il est maintenant connu (true)
                    saveToPreferences(getActivity(), KEY_USER_LEARNED_DRAWER, mUserLearnedDrawer + ""); // Enregistre la modification sous le nom de KEY_USER_LEARNED_DRAWER, avec sa nouvelle valeur (true en l'occurrence)
                }
                getActivity().invalidateOptionsMenu(); // Recrée la Tool Bar
            }
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getActivity().invalidateOptionsMenu(); // Recrée la Tool Bar
            }
        };

//        if (!mUserLearnedDrawer && !mFromSavedInstanceState) { // Si le Drawer est inconnu et s'il n'a pas été créé pour la 1ère fois
//            mDrawerLayout.openDrawer(containerView); // On ouvre le Drawer
//        }

        mDrawerLayout.setDrawerListener(mDrawerToggle); // Attribution d'un Listener pour intercepter les interactions avec celui-ci

        mDrawerLayout.post(new Runnable() { // Synchronise l'état du Drawer (ouvert/fermé)
            @Override
            public void run() {
                mDrawerToggle.syncState(); // Synchronise pour afficher correctement le "Burger"
            }
        });
    }

    public static void saveToPreferences(Context context, String preferenceName, String preferenceValue) { // Enregistre les préférences
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE); // Instancie un "objet pont" pour communiquer avec le fichier de préférences en mode privé
        SharedPreferences.Editor editor = sharedPreferences.edit(); // Instancie un éditeur sur l'"objet pont" pour éditer les-dites préférences
        editor.putString(preferenceName, preferenceValue); // Envoie les paramètres à enregistrer
        editor.apply(); // Applique les modificaitons
    }

    public static String readFromPreferences(Context context, String preferenceName, String defaultValue) { // Lit les préférences
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE); // Instancie un "objet pont" pour communiquer avec le fichier de préférences en mode privé
        return sharedPreferences.getString(preferenceName, defaultValue); // Retourne la valeur du paramètre à lire
    }
}
