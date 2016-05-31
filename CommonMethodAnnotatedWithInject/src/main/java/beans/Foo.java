package beans;

import java.util.logging.Logger;
import org.omnifaces.util.Messages;

/**
 *
 * @author Anghel Leonard
 */
public class Foo {

    private static final Logger LOG = Logger.getLogger(Foo.class.getName());

    public void fooify() {
        LOG.info("Foo#fooify() called ...");
        Messages.addGlobalInfo("Foo#fooify() called ...");
    }
}
