package beans;

import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Instance;
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

    @Inject
    private Foo foo;
    //private Instance<Foo> foo;
    
    @Inject
    private Buzz buzz;
    //private Instance<Buzz> buzz;
    
    @Inject
    private Bizz bizz;    
    //private Instance<Bizz> bizz;

    public void callFooBuzzBizz() {
        LOG.info("TheBean#callFooBuzzBizz() called ...");
        Messages.addGlobalInfo("TheBean#callFooBuzzBizz() called ...");
        
        foo.fooify();
        buzz.buzzify();
        bizz.bizzify();
        
        // foo.get().fooify();
        // buzz.get().buzzify();
        // bizz.get().bizzify();
    }
}
