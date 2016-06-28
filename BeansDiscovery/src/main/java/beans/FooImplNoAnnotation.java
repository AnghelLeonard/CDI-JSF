package beans;

import java.util.logging.Logger;

/**
 *
 * @author Anghel Leonard
 */
public class FooImplNoAnnotation implements IFoo {

    private static final Logger LOG = Logger.getLogger(FooImplNoAnnotation.class.getName());   
    
    @Override
    public void fooSlaveAction() {
        LOG.info("FooImplNoAnnotation#fooSlaveAction() was invoked ...");
    }
    
}
