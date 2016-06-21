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
@Priority(1)
@Alternative
@Stateless
public class FooServiceMock implements IFooService {

    @Override
    public List getAllFoo() {
        return Arrays.asList("foo 1", "foo 2", "foo 3");
    }
}
