
package WizardTower;
import java.util.logging.Logger;

public class IvoryTower implements WizardTower
{
    private static final Logger LOGGER = Logger.getLogger(IvoryTower.class.getName());

    public void enter(Wizard wizard) {
        System.out.println(wizard.toString()+ " enters the tower");
    }
}
