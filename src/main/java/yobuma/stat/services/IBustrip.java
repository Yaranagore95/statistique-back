package yobuma.stat.services;

import yobuma.stat.models.YobBookproBustrip;

import java.util.List;

public interface IBustrip {


    List<YobBookproBustrip> all();

    YobBookproBustrip getOne(int id);

    YobBookproBustrip findOne(String code);

    void delete(int id);

    List<YobBookproBustrip> agentLignes(int agentId);

    /*

    List<YobBookproBustrip> lignesByBus(int bus_id);

    List<YobBookproBustrip> lignesByAgent(int agent_id);

    List<Integer> ligneByAgentByFrom(int agent_id);

    List<YobBookproBustrip> compagnyLigneByFrom(int from_id, int agent_id);

    List<Integer> compagnyLigneByTo(int from_id, int agent_id);

    List<Integer> lignesByTo(int agent_id);

    List<LigneCompanyEntitie> agentLignes(int agent_id);

    List<YobBookproBustrip> lignesByRoute(String route);*/

}
