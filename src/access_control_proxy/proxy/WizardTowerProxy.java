package access_control_proxy.proxy;

import access_control_proxy.service_package.Wizard;
import access_control_proxy.service_package.WizardTower;

import java.util.List;

public class WizardTowerProxy implements WizardTower {

    private final int maxWizards = 4;
    private final WizardTower tower;

    public WizardTowerProxy(WizardTower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (tower.getWizards().size() < maxWizards) {
            tower.enter(wizard);
        } else {
            System.out.println(wizard.toString() + " is not allowed to enter");
        }
    }

    @Override
    public List<Wizard> getWizards() {
        return tower.getWizards();
    }
}