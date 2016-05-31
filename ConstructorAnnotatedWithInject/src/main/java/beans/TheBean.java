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

    private Foo foo;
    private Buzz buzz;
    private Bizz bizz;

    @Inject
    public TheBean(Foo foo, Buzz buzz, Bizz bizz) {
        LOG.info("TheBean#constructor called ...");
         Messages.addGlobalInfo("TheBean#constructor called ...");
         
        this.foo = foo;
        this.buzz = buzz;
        this.bizz = bizz;
    }

    public void callFooBuzzBizz() {
        LOG.info("TheBean#callFooBuzzBizz() called ...");
        Messages.addGlobalInfo("TheBean#callFooBuzzBizz() called ...");
        
        foo.fooify();
        buzz.buzzify();
        bizz.bizzify();
    }

}
