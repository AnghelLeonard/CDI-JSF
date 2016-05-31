package beans;

import java.util.logging.Logger;
import org.omnifaces.util.Messages;

/**
 *
 * @author Anghel Leonard
 */
public class Buzz {

    private static final Logger LOG = Logger.getLogger(Buzz.class.getName());
            
    public void buzzify() {
        LOG.info("Buzz#buzzify() called ...");
        Messages.addGlobalInfo("Buzz#buzzify() called ...");
    }    
}
