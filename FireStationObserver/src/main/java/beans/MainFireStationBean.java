package beans;

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
 Event<String> evt;

 public void fireStarted(String address) {
  evt.fire(address);
 }
}

