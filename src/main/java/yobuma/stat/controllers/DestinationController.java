package yobuma.stat.controllers;

import org.springframework.web.bind.annotation.*;
import yobuma.stat.models.YobBookproDest;
import yobuma.stat.servicesImpl.DestImpl;

import java.util.List;

@CrossOrigin(origins = "https://192.168.1.23:8081", maxAge = 3600)
@RestController
@RequestMapping("/Api/YobBookproDest")
public class DestinationController {
    private final DestImpl destSrc;

    public DestinationController(DestImpl destSrc) {
        this.destSrc = destSrc;
    }

    @RequestMapping(value = "destinations", method = RequestMethod.GET)
    public List<YobBookproDest> destinations() {
        return destSrc.all();
    }

    @RequestMapping(value = "destination/{id}", method = RequestMethod.GET)
    public YobBookproDest destination(@PathVariable("id") int id) {
        return destSrc.getOne(id);
    }
}
