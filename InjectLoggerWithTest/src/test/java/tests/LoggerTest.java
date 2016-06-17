package tests;

import beans.FooBean;
import beans.MyLogger;
import javax.inject.Inject;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.jglue.cdiunit.InRequestScope;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Anghel Leonard
 */
@RunWith(CdiRunner.class)
@AdditionalClasses(MyLogger.class) 
public class LoggerTest {

    @Inject
    FooBean fooBean;

    @Test
    @InRequestScope
    public void testStart() {
        fooBean.logFooAction();
    }

}
