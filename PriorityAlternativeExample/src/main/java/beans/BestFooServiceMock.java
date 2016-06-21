package beans;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Priority;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

/**
 *
 * @author Anghel Leonard
 */
@Priority(2)
@Alternative
@Stateless
public class BestFooServiceMock implements IFooService {

    @Override
    public List getAllFoo() {
        return Arrays.asList("best foo 1", "best foo 2", "best foo 3");
    }
}
