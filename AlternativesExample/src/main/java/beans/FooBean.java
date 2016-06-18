package beans;

import java.util.List;
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
public class FooBean {

    private static final Logger LOG = Logger.getLogger(FooBean.class.getName());

    @Inject
    private IFooService fooService;

    public void loadAllFoo() {
        List allfoo = fooService.getAllFoo();

        LOG.log(Level.INFO, "allfoo:{0}", allfoo);
    }

}
