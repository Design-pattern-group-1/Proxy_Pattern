
package access_control_proxy.service_package;

import java.util.ArrayList;
import java.util.List;

public class IvoryTower implements WizardTower
{
    private List<Wizard> wizards = new ArrayList<>();


    public void enter(Wizard wizard) {
        wizards.add(wizard);
        System.out.println(wizard.toString()+ " enters the tower");
    }

    public List<Wizard> getWizards() {
        return wizards;
    }
}
