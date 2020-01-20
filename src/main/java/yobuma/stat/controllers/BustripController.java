package yobuma.stat.controllers;

import org.springframework.web.bind.annotation.*;
import yobuma.stat.models.YobBookproBustrip;
import yobuma.stat.servicesImpl.BustripImpl;

import java.util.List;

@CrossOrigin(origins = "https://192.168.1.23:8081", maxAge = 3600)
@RestController
@RequestMapping("/Api/YobBookproBustrip")
public class BustripController {

    private final BustripImpl bustripSrc;

    public BustripController(BustripImpl bustripSrc) {
        this.bustripSrc = bustripSrc;
    }

    @RequestMapping(value = "lignes", method = RequestMethod.GET)
    public List<YobBookproBustrip> lignes(){
        return bustripSrc.all();
    }

    @RequestMapping(value = "ligne/{id}", method = RequestMethod.GET)
    public YobBookproBustrip ligne(@PathVariable("id") int id){
        return bustripSrc.getOne(id);
    }
}
