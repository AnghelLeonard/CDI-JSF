package beans;

import java.util.logging.Logger;
import org.omnifaces.util.Messages;

/**
 *
 * @author Anghel Leonard
 */
@F1
public class Foo1 implements FooI {

    private static final Logger LOG = Logger.getLogger(Foo1.class.getName());

    @Override
    public void fooify() {
        LOG.info("Foo1#fooify() called ...");
        Messages.addGlobalInfo("Foo1#fooify() called ...");
    }
}
