package yobuma.stat.services;

import yobuma.stat.models.YobBookproBaggage;

import java.util.List;

public interface IBaggage {

    List<YobBookproBaggage> all();

    YobBookproBaggage getOne(int id);

    void delete(int id);
}
