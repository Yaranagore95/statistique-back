package yobuma.stat.traitementStat;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproBustrip;
import yobuma.stat.repositories.YobBookproBustripRepository;
import yobuma.stat.servicesImpl.DestImpl;
import yobuma.stat.statistiquesModels.LigneEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class LigneTraitement {
    private final YobBookproBustripRepository repository;
    private final DestImpl destSrc;

    public LigneTraitement(YobBookproBustripRepository bustripRepository, DestImpl destSrc) {
        this.repository = bustripRepository;
        this.destSrc = destSrc;
    }

    public List<LigneEntity> distinctRoutes(int hubId) {
        List<Integer> distinctLignes = new ArrayList<>();
        for (String route : repository.distinctRoutes()) {
            String[] routesArray = route.split(",");
            int routeId = Integer.parseInt(routesArray[routesArray.length - 1]);
            if (!distinctLignes.contains(routeId)) {
                distinctLignes.add(routeId);
            }
        }
        List<LigneEntity> ligneEntityList = new ArrayList<>();
        getDistinctRoutes(distinctLignes, ligneEntityList, hubId, 0);
        return ligneEntityList;
    }

    private void getDistinctRoutes(List<Integer> distinctLignes, List<LigneEntity> ligneEntityList, int hubId, int agentId) {
        for (int routeId : distinctLignes) {
            if (routeId != hubId) {
                LigneEntity ligneEntity = new LigneEntity();
                ligneEntity.setNumero(routeId);
                ligneEntity.setTitle(destSrc.getOne(routeId).getTitle());
                List<YobBookproBustrip> departs = new ArrayList<>();
                List<YobBookproBustrip> arrives = new ArrayList<>();
                List<YobBookproBustrip> all = repository.findAll();
                for (YobBookproBustrip ligne : all) {
                    String[] routes = ligne.getRoute().split(",");
                    if (agentId == 0) {
                        if (Integer.parseInt(routes[0]) == routeId) {
                            ligne.setTitle(destSrc.getOne(ligne.getTo()).getTitle());
                            departs.add(ligne);
                        }
                        if (Integer.parseInt(routes[routes.length - 1]) == routeId) {
                            ligne.setTitle(destSrc.getOne(ligne.getTo()).getTitle());
                            arrives.add(ligne);
                        }
                    } else {
                        if (Integer.parseInt(routes[0]) == routeId && agentId == ligne.getYobBookproAgent().getId()) {
                            ligne.setTitle(destSrc.getOne(ligne.getTo()).getTitle());
                            departs.add(ligne);
                        }
                        if (Integer.parseInt(routes[routes.length - 1]) == routeId && agentId == ligne.getYobBookproAgent().getId()) {
                            ligne.setTitle(destSrc.getOne(ligne.getTo()).getTitle());
                            arrives.add(ligne);
                        }
                    }

                }
                ligneEntity.setLignesArrive(arrives);
                ligneEntity.setLignesDepart(departs);
                ligneEntityList.add(ligneEntity);
            }
        }
    }

    public List<LigneEntity> distinctRoutesByAgent(int hubId, int agentId) {
        List<Integer> distinctLignes = new ArrayList<>();
        for (String route : repository.distinctRoutesByAgent(agentId)) {
            String[] routesArray = route.split(",");
            int routeId = Integer.parseInt(routesArray[routesArray.length - 1]);
            if (!distinctLignes.contains(routeId)) {
                distinctLignes.add(routeId);
            }
        }
        List<LigneEntity> ligneEntityList = new ArrayList<>();
        getDistinctRoutes(distinctLignes, ligneEntityList, hubId, agentId);
        return ligneEntityList;
    }
}