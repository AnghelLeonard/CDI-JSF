package beans;

import beans.FireType.Type;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@RequestScoped
public class MainFireStationBean {

    @Inject
    @FireType(Type.SMALL)
    Event<String> small;

    @Inject
    @FireType(Type.BIG)
    Event<String> big;

    public void fireStarted(String address, boolean t) {
        if (t) {
            small.fire(address);
        } else {
            big.fire(address);
        }
    }
}
