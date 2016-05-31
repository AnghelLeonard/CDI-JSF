package beans;

import java.util.logging.Logger;
import javax.annotation.PostConstruct;
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

    public TheBean() {
        LOG.info("TheBean#constructor called ...");
        Messages.addGlobalInfo("TheBean#constructor called ...");
    }

    @PostConstruct
    public void init() {
        LOG.info("TheBean#init() called ...");
        Messages.addGlobalInfo("TheBean#init() called ...");
    }

    public void callFooBuzzBizzAction() {
        LOG.info("TheBean#callFooBuzzBizz() called ...");
        Messages.addGlobalInfo("TheBean#callFooBuzzBizz() called ...");
    }

    @Inject
    private void initFooBuzzBizz(Foo foo, Buzz buzz, Bizz bizz) {
        LOG.info("TheBean#initFooBuzzBizz() called ...");
        Messages.addGlobalInfo("TheBean#initFooBuzzBizz() called ...");

        foo.fooify();
        buzz.buzzify();
        bizz.bizzify();
    }
}
