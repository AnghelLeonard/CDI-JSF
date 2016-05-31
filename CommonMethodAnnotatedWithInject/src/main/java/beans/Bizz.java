package beans;

import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.omnifaces.util.Messages;

/**
 *
 * @author Anghel Leonard
 */
@Stateless
public class Bizz {

    private static final Logger LOG = Logger.getLogger(Bizz.class.getName());
            
    public void bizzify(){
        LOG.info("Bizz#bizzify() called ...");     
        Messages.addGlobalInfo("Bizz#bizzify() called ...");
    }
    
}
