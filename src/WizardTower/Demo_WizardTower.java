package WizardTower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo_WizardTower {

    public static void main(String[] args) {
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());

        ArrayList<String> wizards = new ArrayList<String>(
                Arrays.asList("Red wizard",
                        "White wizard",
                        "Black wizard",
                        "Green wizard",
                        "Brown wizard"
                        ));
        Collections.shuffle(wizards);

        for (String wizardname: wizards)
        {
         proxy.enter(new Wizard(wizardname));
        }
    }
}
