package tests;

import beans.BestFooServiceMock;
import beans.FooBean;
import beans.FooServiceMock;
import beans.GreatFooServiceMock;
import javax.inject.Inject;
import org.jglue.cdiunit.ActivatedAlternatives;
import org.jglue.cdiunit.CdiRunner;
import org.jglue.cdiunit.InRequestScope;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Anghel Leonard
 */
@RunWith(CdiRunner.class)
@ActivatedAlternatives({FooServiceMock.class, BestFooServiceMock.class, GreatFooServiceMock.class}) 
public class FooBeanTest {
    
    @Inject
    FooBean fooBean;

    @Test
    @InRequestScope
    public void testStart() {
        fooBean.loadAllFoo();
    }
    
}
