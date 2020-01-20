package yobuma.stat.controllers;

import org.springframework.web.bind.annotation.*;
import yobuma.stat.models.YobBookproPassenger;
import yobuma.stat.servicesImpl.PassengerImpl;

import java.util.List;

@CrossOrigin(origins = "https://192.168.1.23:8081", maxAge = 3600)
@RestController
@RequestMapping("/Api/YobBookproPassenger")
public class PassengerController {

    private final PassengerImpl passengerSrc;

    public PassengerController(PassengerImpl passengerSrc) {
        this.passengerSrc = passengerSrc;
    }

    @RequestMapping(value = "passagers", method = RequestMethod.GET)
    public List<YobBookproPassenger> passagers(){
        return passengerSrc.all();
    }

    @RequestMapping(value = "passager/{id}", method = RequestMethod.GET)
    YobBookproPassenger passager(@PathVariable("id") int id){
        return passengerSrc.getOne(id);
    }
}
