package tests;

import beans.FooBean;
import beans.FooServiceMock;
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
@ActivatedAlternatives(FooServiceMock.class) 
public class FooBeanTest {
    
    @Inject
    FooBean fooBean;

    @Test
    @InRequestScope
    public void testStart() {
        fooBean.loadAllFoo();
    }
    
}
