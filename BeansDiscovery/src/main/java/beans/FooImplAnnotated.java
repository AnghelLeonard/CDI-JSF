package beans;

import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Anghel Leonard
 */
@RequestScoped
public class FooImplAnnotated implements IFoo {

    private static final Logger LOG = Logger.getLogger(FooImplAnnotated.class.getName());   
    
    @Override
    public void fooSlaveAction() {
        LOG.info("FooImplAnnotated#fooSlaveAction() invoked ...");
    }
    
}
