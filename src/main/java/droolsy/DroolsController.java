package droolsy;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DroolsController {
    @Autowired
    private KieSession session;

    @PostMapping("/diag")
    public Results checkSample(@RequestBody BloodSample sample) {
        Results result = new Results();
        session.setGlobal("gResult", result);
        session.insert(sample);
        session.fireAllRules();
        return result;
    }

}
