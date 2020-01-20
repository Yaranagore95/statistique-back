package yobuma.stat.controllers;

import org.springframework.web.bind.annotation.*;
import yobuma.stat.models.YobBookproAgent;
import yobuma.stat.servicesImpl.AgentImpl;
import java.util.List;

@CrossOrigin(origins = "https://192.168.1.23:8081", maxAge = 3600)
@RestController
@RequestMapping("/Api/YobBookproAgent")

public class AgentController {

    private final AgentImpl agentSrc;

    public AgentController(AgentImpl agentSrc) {
        this.agentSrc = agentSrc;
    }

    @RequestMapping(value = "agents", method = RequestMethod.GET)
    public List<YobBookproAgent> agents(){
        return agentSrc.all();
    }

    @RequestMapping(value = "agent/{id}", method = RequestMethod.GET)
    public YobBookproAgent agent(@PathVariable("id") int id){
        return agentSrc.getOne(id);
    }

    @RequestMapping(value = "agentByUserId/{id}", method = RequestMethod.GET)
    public YobBookproAgent agentByUserId(@PathVariable("id") int userId){
        return agentSrc.getByUserId(userId);
    }
}
