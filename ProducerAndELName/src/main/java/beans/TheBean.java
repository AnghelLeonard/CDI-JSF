package beans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@ApplicationScoped
public class TheBean {

    @Produces
    @Named
    @Foo
    String getSomeFoo() {
        return "foo";
    }        
    
    @Produces
    @Named("moreFoo")
    @Foo
    String getExtraFoo() {
        return "extra-foo";
    }   
}
