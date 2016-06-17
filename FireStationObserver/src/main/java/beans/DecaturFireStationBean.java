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
public class DecaturFireStationBean {

 public void update(@Observes String arg) {
  System.out.println("Decatur fire department will go to " + arg);
 }
}
