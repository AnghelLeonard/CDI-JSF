package beans;

import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.util.Messages;

/**
 *
 * @author Anghel Leonard
 */
@Named
@RequestScoped
public class TheBean {

    private static final Logger LOG = Logger.getLogger(TheBean.class.getName());

    @Inject @F1
    private FooI foo1;
    
    @Inject
    private FooI foo2;


    public void callFooBuzzBizz() {
        LOG.info("TheBean#callFooBuzzBizz() called ...");
        Messages.addGlobalInfo("TheBean#callFooBuzzBizz() called ...");

        foo1.fooify();
        foo2.fooify();
    }

}
