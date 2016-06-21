package beans;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author Anghel Leonard
 */
@Stateless
public class FooService implements IFooService {

    private static final Logger LOG = Logger.getLogger(FooService.class.getName());   
    
    //@PersistenceContext(unitName = "fooPU")
    //private EntityManager em;

    @Override
    public List getAllFoo() {
        // perform the query
        LOG.info("Using entity manager ...");
        return new ArrayList();
    }

}
