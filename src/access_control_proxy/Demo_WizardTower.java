package access_control_proxy;

import access_control_proxy.proxy.WizardTowerProxy;
import access_control_proxy.service_package.IvoryTower;
import access_control_proxy.service_package.Wizard;
import access_control_proxy.service_package.WizardTower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo_WizardTower {

    public static void main(String[] args) {
        WizardTower tower = new WizardTowerProxy(new IvoryTower());

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
         tower.enter(new Wizard(wizardname));
        }
    }
}
