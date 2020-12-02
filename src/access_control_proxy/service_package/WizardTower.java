package access_control_proxy.service_package;

import java.util.List;

public interface WizardTower {
    void enter(Wizard wizard);
    List<Wizard> getWizards();
}
