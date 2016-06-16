package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@RequestScoped
public class PlayerBean {

    private static final Logger LOG = Logger.getLogger(PlayerBean.class.getName());

    @HttpParam("name") @Inject String name;
    @HttpParam("surname") @Inject String surname;

    public void registerAction() {
        LOG.log(Level.INFO, "Register: {0} {1}", new Object[]{name, surname});
    }
}
