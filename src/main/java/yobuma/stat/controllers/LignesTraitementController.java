package yobuma.stat.controllers;

import org.springframework.web.bind.annotation.*;
import yobuma.stat.StatConstants.ComparaisonReq;
import yobuma.stat.StatConstants.StatDateWithAgentId;
import yobuma.stat.StatConstants.StatDateWithHub;
import yobuma.stat.StatConstants.StatMonthWithHub;
import yobuma.stat.statistiquesModels.LigneEntity;
import yobuma.stat.statistiquesModels.LigneEntityWithOrders;
import yobuma.stat.traitementStat.LigneTraitement;
import yobuma.stat.traitementStat.StatistiqueTraitement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "https://192.168.1.23:8081", maxAge = 3600)
@RestController
@RequestMapping("/Api/TraitementLignes")
public class LignesTraitementController {

    private final LigneTraitement ligneTraitement;
    private final StatistiqueTraitement statistiqueTraitement;

    public LignesTraitementController(LigneTraitement ligneTraitement, StatistiqueTraitement statistiqueTraitement) {
        this.ligneTraitement = ligneTraitement;
        this.statistiqueTraitement = statistiqueTraitement;
    }

    @RequestMapping(value = "distinctLignes/{hubId}", method = RequestMethod.GET)
    List<LigneEntity> distinctLignes(@PathVariable("hubId") int hubId) {
        return ligneTraitement.distinctRoutes(hubId);
    }

    @RequestMapping(value = "distinctLignesByAgent", method = RequestMethod.POST)
    List<LigneEntity> distinctLignes(@RequestBody StatDateWithAgentId dateWithAgentId) {
        // return repository.distinctRoutesByAgent(14);
        return ligneTraitement.distinctRoutesByAgent(dateWithAgentId.getHubId(), dateWithAgentId.getAgentId());
    }

    @RequestMapping(value = "allCompagnieVente", method = RequestMethod.POST)
    List<LigneEntityWithOrders> allCompagnieVente(@RequestBody StatDateWithHub statDateAndId) throws ParseException {
        return statistiqueTraitement.allCompagnieStatistiqueGettingByDate(statDateAndId.getHubId(), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateInf()), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateSup()), "vente");
    }

    @RequestMapping(value = "oneCompagnieVente", method = RequestMethod.POST)
    List<LigneEntityWithOrders> oneCompagnieVente(@RequestBody StatDateWithAgentId statDateAndId) throws ParseException {
        return statistiqueTraitement.oneCompagnieStatistiqueGettingByDate(statDateAndId.getHubId(), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateInf()), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateSup()), statDateAndId.getAgentId(), "vente");
    }

    @RequestMapping(value = "allCompagnieVoyage", method = RequestMethod.POST)
    List<LigneEntityWithOrders> allCompagnieVoyage(@RequestBody StatDateWithHub statDateAndId) throws ParseException {
        return statistiqueTraitement.allCompagnieStatistiqueGettingByDate(statDateAndId.getHubId(), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateInf()), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateSup()), "voyage");
    }

    @RequestMapping(value = "oneCompagnieVoyage", method = RequestMethod.POST)
    List<LigneEntityWithOrders> oneCompagnieVoyage(@RequestBody StatDateWithAgentId statDateAndId) throws ParseException {
        return statistiqueTraitement.oneCompagnieStatistiqueGettingByDate(statDateAndId.getHubId(), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateInf()), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateSup()), statDateAndId.getAgentId(), "voyage");
    }

    @RequestMapping(value = "oneCompagnieVenteByDay", method = RequestMethod.POST)
    List<LigneEntityWithOrders> oneCompagnieVenteDay(@RequestBody StatDateWithAgentId statDateAndId) throws ParseException {
        Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateInf());
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 1);
        statDateAndId.setDateSup(new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()));
        return statistiqueTraitement.oneCompagnieStatistiqueGettingByDate(statDateAndId.getHubId(), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateInf()), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateSup()), statDateAndId.getAgentId(), "vente");
    }

    @RequestMapping(value = "oneCompagnieVoyageByDay", method = RequestMethod.POST)
    List<LigneEntityWithOrders> oneCompagnieVoyageDay(@RequestBody StatDateWithAgentId statDateAndId) {
        try {
            Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateInf());
            Calendar c = Calendar.getInstance();
            System.out.println("La date == " + dt);
            c.setTime(dt);
            c.add(Calendar.DATE, 1);
            statDateAndId.setDateSup(new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()));
            return statistiqueTraitement.oneCompagnieStatistiqueGettingByDate(statDateAndId.getHubId(), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateInf()), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateSup()), statDateAndId.getAgentId(), "voyage");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "oneCompagnieVenteByMonth", method = RequestMethod.POST)
    List<LigneEntityWithOrders> oneCompagnieVenteByMonth(@RequestBody StatMonthWithHub statMonthWithHub) throws ParseException {
        System.out.println("Year == " + statMonthWithHub.getYear() + " mothn == " + statMonthWithHub.getMonth() + " hub == " + statMonthWithHub.getHubId() + " agent Id == " + statMonthWithHub.getAgentId());
        Calendar calendar = Calendar.getInstance();
        int mois = statMonthWithHub.getMonth();
        calendar.set(statMonthWithHub.getYear(), (mois - 1), 1);
        String dateInf = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
        calendar.add(Calendar.MONTH, 1);
        String dateSup = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
        StatDateWithAgentId statDateAndId = new StatDateWithAgentId();
        statDateAndId.setAgentId(statMonthWithHub.getAgentId());
        statDateAndId.setDateInf(dateInf);
        statDateAndId.setDateSup(dateSup);
        statDateAndId.setHubId(statMonthWithHub.getHubId());
        return statistiqueTraitement.oneCompagnieStatistiqueGettingByDate(statDateAndId.getHubId(), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateInf()), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateSup()), statDateAndId.getAgentId(), "vente");
    }

    @RequestMapping(value = "oneCompagnieVoyageByMonth", method = RequestMethod.POST)
    List<LigneEntityWithOrders> oneCompagnieVoyageByMonth(@RequestBody StatMonthWithHub statMonthWithHub) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        int mois = statMonthWithHub.getMonth();
        calendar.set(statMonthWithHub.getYear(), (mois - 1), 1);
        String dateInf = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
        calendar.add(Calendar.MONTH, 1);
        String dateSup = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
        StatDateWithAgentId statDateAndId = new StatDateWithAgentId();
        statDateAndId.setAgentId(statMonthWithHub.getAgentId());
        statDateAndId.setDateInf(dateInf);
        statDateAndId.setDateSup(dateSup);
        statDateAndId.setHubId(statMonthWithHub.getHubId());
        return statistiqueTraitement.oneCompagnieStatistiqueGettingByDate(statDateAndId.getHubId(), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateInf()), new SimpleDateFormat("yyyy-MM-dd").parse(statDateAndId.getDateSup()), statDateAndId.getAgentId(), "voyage");
    }

    @RequestMapping(value = "comparaisonValues", method = RequestMethod.POST)
    public List<LigneEntityWithOrders> getCompagnieComparaisonValues(@RequestBody ComparaisonReq comparaisonReq) {
        return null;
    }
}
