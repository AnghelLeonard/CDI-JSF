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

 public void update(@Observes String arg) {
  System.out.println("Brookhaven fire department will go to " + arg);
 }
}
