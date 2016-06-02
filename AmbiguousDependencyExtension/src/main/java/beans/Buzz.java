package beans;

import java.util.logging.Logger;
import javax.enterprise.inject.Typed;
import org.omnifaces.util.Messages;

/**
 *
 * @author Anghel Leonard
 */
@Typed(Buzz.class)
public class Buzz extends Foo {

    private static final Logger LOG = Logger.getLogger(Buzz.class.getName());
            
    public void buzzify() {
        LOG.info("Buzz#buzzify() called ...");
        Messages.addGlobalInfo("Buzz#buzzify() called ...");
    }    
}
