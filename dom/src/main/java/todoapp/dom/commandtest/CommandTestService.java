package todoapp.dom.commandtest;

import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.NatureOfService;
import org.apache.isis.applib.services.background.BackgroundService;

import javax.inject.Inject;

/**
 * Created by E. de Hair <e.dehair@pocos.nl> on 7/15/16.
 */
@DomainService(nature = NatureOfService.VIEW_REST_ONLY)
public class CommandTestService {

    public String requestFixedOutport(String message) {
        return backgroundService.execute(this).backgroundAction(message);
    }

    public String backgroundAction(String actionParam){
        return actionParam;
    }

    @Inject
    private BackgroundService backgroundService;
}
