package beans;

import java.util.logging.Logger;
import org.omnifaces.util.Messages;

/**
 *
 * @author Anghel Leonard
 */
public class Foo2 implements FooI {

    private static final Logger LOG = Logger.getLogger(Foo2.class.getName());

    @Override
    public void fooify() {
        LOG.info("Foo2#fooify() called ...");
        Messages.addGlobalInfo("Foo2#fooify() called ...");
    }
}
