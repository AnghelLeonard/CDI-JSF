package beans;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletRequest;

/**
 *
 * @author Anghel Leonard
 */
public class HttpParams {

    @Produces
    @HttpParam("")
    String getParamValue(InjectionPoint ip) {

        // obtain the current request
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        ServletRequest request = (ServletRequest) externalContext.getRequest();

        // obtain the desired parameter
        Annotated annotated = ip.getAnnotated();
        HttpParam httpParam = annotated.getAnnotation(HttpParam.class);

        return request.getParameter(httpParam.value());
    }

}
