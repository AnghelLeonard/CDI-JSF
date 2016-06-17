package beans;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@Dependent
public class BrookhavenFireStationBean {

    public void updateSmallFire(@Observes @FireType(FireType.Type.SMALL) String arg) {
        System.out.println("Brookhaven fire department will go to a small fire at " + arg);
    }

    public void updateBigFire(@Observes @FireType(FireType.Type.BIG) String arg) {
        System.out.println("Brookhaven fire department will go to a big fire at " + arg);
    }
}
