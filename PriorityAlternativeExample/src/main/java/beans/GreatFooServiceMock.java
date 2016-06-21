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
@Priority(3)
@Alternative
@Stateless
public class GreatFooServiceMock implements IFooService {

    @Override
    public List getAllFoo() {
        return Arrays.asList("great foo 1", "great foo 2", "great foo 3");
    }
}
