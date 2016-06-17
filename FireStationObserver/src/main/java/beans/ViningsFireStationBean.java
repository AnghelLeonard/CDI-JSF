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
public class ViningsFireStationBean {

 public void update(@Observes String arg) {
  System.out.println("Vinings fire department will go to " + arg);
 }
}
