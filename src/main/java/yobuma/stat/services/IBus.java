package yobuma.stat.services;

import yobuma.stat.models.YobBookproBus;

import java.util.List;


public interface IBus {

    List<YobBookproBus> all();

    YobBookproBus getOne(int id);

    YobBookproBus findOne(String code);

    void delete(int id);

    // List<YobBookproBus> agentBus(int agent_id);

}
