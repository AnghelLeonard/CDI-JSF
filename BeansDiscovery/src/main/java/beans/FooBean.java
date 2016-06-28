package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@RequestScoped
public class FooBean {
    
    // inject the annotated bean
    @Inject
    private FooImplAnnotated fooAnnotated;         
    
    // inject the no-annotation bean
    @Inject
    private FooImplNoAnnotation fooNoAnnotation;
    
    public void fooMasterAction(){
        // call fooSlaveAction() of the annotated bean
        fooAnnotated.fooSlaveAction();
        
        // call fooSlaveAction() of the no annotation bean
        fooNoAnnotation.fooSlaveAction();
    }
    
}
