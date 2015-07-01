package fr.qualitylabs.wikicoc;
public class WizardTower extends Building {

    //    {lvl, dammage/s, dammage/shot, hp, cost, build time, xp, th requiered}
    String[] wizardtower1 = {"1","11","14,3","620","180 000","12h","207","5"};
    String[] wizardtower2 = {"2","13","16,9","650","360 000","1j","293","5"};
    String[] wizardtower3 = {"3","16","20,8","680","720 000","2j","415","6"};
    String[] wizardtower4 = {"4","20","26","730","1 280 000","3j","509","7"};
    String[] wizardtower5 = {"5","24","31,2","790","1 960 000","4j","587","8"};
    String[] wizardtower6 = {"6","32","41,6","850","2 680 000","5j","657","8"};
    String[] wizardtower7 = {"7","40","52","930","5 360 000","7j","777","9"};
    String[] wizardtower8 = {"8","48","62,4","1 010","6 480 000","10j","929","10"};

    public WizardTower(){
        name = "Tour de sorcier";
        nameCode = "wizard_tower";
        data.put(1, wizardtower1);
        data.put(2, wizardtower2);
        data.put(3, wizardtower3);
        data.put(4, wizardtower4);
        data.put(5, wizardtower5);
        data.put(6, wizardtower6);
        data.put(7, wizardtower7);
        data.put(8, wizardtower8);
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
